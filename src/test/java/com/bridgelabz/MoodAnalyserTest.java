package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created the class for Test Handle Exception if User Provides Invalid  Mood
 */
public class MoodAnalyserTest {

    @Test
    public void givenNullMood_ShouldThrowMoodAnalysisException() {
        MoodAnalyserMain moodAnalyser = new MoodAnalyserMain(null);
        try {
            String mood = moodAnalyser.analyseMood();
            Assert.assertEquals("NULL MOOD", mood);
        } catch (MoodAnalyserException catchException) {
            catchException.printStackTrace();
        }
    }

    @Test
    public void givenEmptyMood_ShouldThrowMoodAnalysisException() {
        MoodAnalyserMain moodAnalyser = new MoodAnalyserMain("");
        try {
            String mood = moodAnalyser.analyseMood();
        } catch (MoodAnalyserException catchException) {
            Assert.assertEquals("EMPTY MOOD", catchException.getMessage());

        }
    }

}