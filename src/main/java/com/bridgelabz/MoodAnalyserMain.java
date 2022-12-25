package com.bridgelabz;

/**
 *Created the class for Refactor the code to take the mood message in constructor. .
 */
public class MoodAnalyserMain {
    private String message;
    public MoodAnalyserMain() {}
    public MoodAnalyserMain(String message) {
        this.message = message;
    }

    /**
     *Create a Method for take the mood in message
     */

    public String analyseMood() {
        if (this.message.contains("sad")) {
            return "SAD";
        }else
            return "HAPPY";
    }

    /**
     *This is Main Method is Using for calling method and  take the mood message in constructor
     *
     */

    public static void main(String[] args) {
        MoodAnalyserMain mood = new MoodAnalyserMain("i am sad");
        System.out.println(mood.analyseMood());
        MoodAnalyserMain mood2 = new MoodAnalyserMain("i am happy");
        System.out.println(mood2.analyseMood());
    }
}