package com.biz.exception;

public class MoodAnalyserException extends Exception{
    String message;

    public MoodAnalyserException(String message) {
        this.message = message;
    }
}
