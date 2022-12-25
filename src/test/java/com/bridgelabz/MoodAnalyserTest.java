package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertSame;

/**
 * Created the class for checking the test cases
 */

public class MoodAnalyserTest {
    @Test
    public void givenSadMoodShouldReturnSad() {
        MoodAnalyserMain analyse = new MoodAnalyserMain("I am in sad mood");
        String mood = analyse.analyseMood();
        assertSame("SAD", mood);
    }

    @Test
    public void givenAnyMoodShouldReturnHappy() {
        MoodAnalyserMain analyse = new MoodAnalyserMain("I am in any mood");
        String mood = analyse.analyseMood();
        assertSame("HAPPY", mood);
    }
}
