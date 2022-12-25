package com.bridgelabz;


public class MoodAnalyserException extends Exception {
    /**
     * Using the enum to differentiate the mood analysis errors
     */
    public enum ExceptionType {
        ENTERED_NULL, ENTERED_EMPTY
    }

    public ExceptionType type;

    public MoodAnalyserException(ExceptionType type, String msg) {
        super(msg);
        this.type = type;
    }

}
