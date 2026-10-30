package com.example.geminiautomation;

import com.google.genai.Client;
import com.google.genai.types.GenerateContentResponse;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class GeminiService {

    private final Client client = new Client();

    @Cacheable(value = "geminiResponses", key = "#prompt")
    public String generateResponse(String prompt) {

        try {
            GenerateContentResponse response =
                    client.models.generateContent(
                            "gemini-3.5-flash-lite",
                            prompt,
                            null
                    );

            String result = response.text();

            return result == null ? "" : result;

        } catch (Exception ex) {
            throw new RuntimeException(
                    "Gemini API request failed", ex);
        }
    }
}