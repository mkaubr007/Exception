package com.biz.exception;

public class MoodAnalyserRefactor {
    public String message;

    public MoodAnalyserRefactor(String message) {
        this.message = message;
    }

    public String analyseMood() throws MoodAnalyserException {
        try {
            if(message.length()==0){
                throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.EMPTY,"Invalid mood");
            }
            if (message.toLowerCase().contains("SAD")) {
                return "sad";
            } else {
                return "happy";
            }
        } catch (NullPointerException exception) {
            throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.NULL,"Invalid mood");
        }
    }
}
