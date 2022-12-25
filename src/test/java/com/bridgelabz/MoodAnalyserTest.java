package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created the class for Handle Exception if User Provides Invalid  Mood
 */
public class MoodAnalyserTest {
        @Test
        public void givenMoodShouldReturnHappy() {
            MoodAnalyserMain moodAnalyser = new MoodAnalyserMain(null);
            String mood = moodAnalyser.moodSad();
            Assert.assertEquals("HAPPY", mood);

        }
}
