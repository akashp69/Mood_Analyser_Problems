package com.bridgelabz;
/**
 * Using Class for TC : 1.1 : Given "I am in Happy Mood" message should return HAPPY .
 */

public class MoodAnalyserMain {
    private String message;

    public MoodAnalyserMain(String message) {
        this.message = message;
    }
    /**
     *Created a method for Sad Mood if Mood is sad then return SAD with using contains method
     */
    public String moodHappy() {
        if (message.contains("Happy")) {
            return "HAPPY";
        } else {
            return "Sad";
        }
    }
}
