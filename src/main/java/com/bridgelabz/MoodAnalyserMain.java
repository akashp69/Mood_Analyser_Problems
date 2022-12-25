package com.bridgelabz;

/**
 *Created the class for Handle Exception if User Provides Invalid Mood .
 */

    public class MoodAnalyserMain {
        private String message;
        public MoodAnalyserMain(String message) {
            this.message = message;
        }

    /**
     *Using throws method for handle exception using try-catch block
     * @throws MoodAnalyserException
     **/
        public String analyseMood() throws MoodAnalyserException {
            try {
                if (message.contains("Sad")) {
                    return "SAD";
                } else {
                    return "HAPPY";
                }
            } catch (NullPointerException e) {
                throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.ENTERED_NULL,"Please enter proper message");

            }
        }

    }


