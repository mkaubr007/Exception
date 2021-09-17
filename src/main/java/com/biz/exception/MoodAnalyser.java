package com.biz.exception;


public class MoodAnalyser {
    public String analyseMood(String message) throws MoodAnalyserException {
        try {
            if(message.length()==0){
                throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.EMPTY,"Invalid mood");
            }
            if (message.toLowerCase().contains("sad")) {
                return "sad";
            } else {
                return "happy";
            }
        } catch (NullPointerException exception) {
            throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.NULL,"Invalid mood");
        }
    }
}
