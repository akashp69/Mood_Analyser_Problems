package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

    @Test
    public void givenMoodShouldReturnHappy() {
    /**
    * Created  Object here for calling the methods here for testing
    */
        MoodAnalyserMain moodAnalyser = new MoodAnalyserMain("I am in Happy Mood");
    /**
     *Created mood Variable here for store the mood message present in moodHappy method
     **/
        String mood = moodAnalyser.moodHappy();
        Assert.assertEquals("HAPPY", mood);

    }
}