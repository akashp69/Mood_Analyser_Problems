package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

    @Test
    public void givenMoodShouldReturnSad() {
    /**
    * Created  Object here for calling the methods here for testing
    */
        MoodAnalyserMain moodAnalyser = new MoodAnalyserMain("I am In a Sad Mood");
    /**
     *Created mood Variable here for store the mood message present in moodSad method
     **/
        String mood = moodAnalyser.moodSad();
        Assert.assertEquals("SAD", mood);

    }
}