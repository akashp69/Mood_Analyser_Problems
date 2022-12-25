package com.bridgelabz;

/**
 *Created the class for Handle Exception if User Provides Invalid Mood .
 */
public class MoodAnalyserMain {
    private String message;
    /**
     *Create a Method for take the mood message
     */
    public MoodAnalyserMain(String message) {
        this.message = message;
    }

    public String moodSad() {
        try {
            if (message.contains("SSad")) {
                return "SAD";
            }
        } catch (NullPointerException e) {
            return "HAPPY";
        }
        return "HAPPY";
    }

}



