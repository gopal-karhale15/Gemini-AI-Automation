
package com.example.geminiautomation;

import com.google.genai.Client;
import com.google.genai.types.GenerateContentResponse;
import org.springframework.stereotype.Service;

@Service
public class GeminiService {

    private final Client client = new Client();

    public String generateResponse(String prompt) {

        GenerateContentResponse response =
                client.models.generateContent(
                        "gemini-3.5-flash-lite",
                        prompt,
                        null
                );

        String result = response.text();
        return result == null ? "" : result;
    }
}
