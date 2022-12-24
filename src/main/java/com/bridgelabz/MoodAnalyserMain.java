package com.bridgelabz;
/**
 * Using Class for TC : 1.1 : Given "I am in Sad Mood" message should return SAD .
 */

public class MoodAnalyserMain {
    private String message;

    public MoodAnalyserMain(String message) {
        this.message = message;
    }
    /**
     *Created a method for Sad Mood if Mood is sad then return SAD with using contains method
     */
    public String moodSad() {
        if (message.contains("Sad")) {
            return "SAD";
        } else {
            return "HAPPY";
        }
    }
}
