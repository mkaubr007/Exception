package com.biz.exception;

public class MoodAnalyserRefactor {
    public String message;

    public MoodAnalyserRefactor(String message) {
        this.message = message;
    }

    public String analyseMood() throws MoodAnalyserException {
        try {
            if (message.toLowerCase().contains("sad")) {
                return "sad";
            } else {
                return "happy";
            }
        } catch (NullPointerException exception) {
            throw new MoodAnalyserException("Invalid mood");
        }
    }
}
