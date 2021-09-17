package com.biz.exception;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    @Test
    public void givenMessage_WhenSad_ShouldReturnSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = null;
        try {
            mood = moodAnalyser.analyseMood("I am in sad mood");
        } catch (MoodAnalyserException e) {
            e.printStackTrace();
        }
        Assert.assertEquals("sad", mood);
    }

    @Test
    public void givenMessage_WhenAny_ShouldReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = null;
        try {
            mood = moodAnalyser.analyseMood("I am in Any Mood");
        } catch (MoodAnalyserException e) {
            e.printStackTrace();
        }
        Assert.assertEquals("happy", mood);
    }
    @Test
    public void givenRefactorCode_Message_WhenSad_ShouldReturnSad() {
        MoodAnalyserRefactor moodAnalyser = new MoodAnalyserRefactor("I am in sad mood");
        String mood = null;
        try {
            mood = moodAnalyser.analyseMood();
        } catch (MoodAnalyserException e) {
            e.printStackTrace();
        }
        Assert.assertEquals("sad", mood);
    }
    @Test
    public void givenRefactorCode_Message_WhenAny_ShouldReturnHappy() {
        MoodAnalyserRefactor moodAnalyser = new MoodAnalyserRefactor("I am in Any Mood");
        String mood = null;
        try {
            mood = moodAnalyser.analyseMood();
        } catch (MoodAnalyserException e) {
            e.printStackTrace();
        }
        Assert.assertEquals("happy", mood);
    }
    @Test
    public void givenNullMood_ShouldReturnInvalid() {
        MoodAnalyser moodAnalyser=new MoodAnalyser();
        try {
            moodAnalyser.analyseMood(null);
        } catch ( MoodAnalyserException e) {
            String expectedResult="Invalid mood";
            Assert.assertEquals(expectedResult,e.message);
        }
    }

}
