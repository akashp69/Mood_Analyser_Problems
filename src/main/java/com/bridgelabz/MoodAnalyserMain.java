package com.bridgelabz;

public class MoodAnalyserMain {

    private String message;

    public MoodAnalyserMain(String message) {
        this.message = message;
    }

    /**
     *Created a method for Happy Mood if Mood is happy then return HAPPY with using contains method
     */

    public String moodHappy() {
        if (message.contains("happy")) {
            return "HAPPY";
        } else {
            return "SAD";
        }
    }
    /**
     *Created a method for Sad Mood if Mood is sad then return SAD with using contains method
     */

    public String moodSad() {
        if (message.contains("sad")) {
            return "SAD";
        } else {
            return "HAPPY";
        }
    }
}
