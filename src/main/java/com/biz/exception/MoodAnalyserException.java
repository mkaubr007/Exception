package com.biz.exception;

public class MoodAnalyserException extends Exception{
    enum ExceptionType{
        EMPTY,NULL
    }
    ExceptionType type;
    String message;

    public MoodAnalyserException(ExceptionType type, String message) {
        this.message = message;
        this.type=type;
    }
}
