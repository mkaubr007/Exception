package com.biz.exception;


public class MoodAnalyser {
    public String analyseMood(String message) throws MoodAnalyserException {
        try {
            if (message.toLowerCase().contains("sad")) {
                return "sad";
            } else {
                return "happy";
            }
        } catch (NullPointerException exception) {
            throw new MoodAnalyserException("happy");
        }
    }
}
