package com.labz.mood;

import org.junit.Assert;
import org.junit.Test;

import com.bridgelabz.mood.MoodAnalyzer;

public class MoodAnalyzerTest {
	@Test
	public void givenMessage_IsProper_ShouldReturnSad() {
		MoodAnalyzer moodAnalyser = new MoodAnalyzer();
		moodAnalyser.setMessage("I am Sad");
		String actualResult = moodAnalyser.analyseMood();
		Assert.assertEquals("SAD", actualResult);
	}
	
	@Test
	public void givenMessage_IsProper_ShouldReturnHappy() {
		MoodAnalyzer moodAnalyser = new MoodAnalyzer();
		moodAnalyser.setMessage("I am in any mood");
		String actualResult = moodAnalyser.analyseMood();
		Assert.assertEquals("HAPPY", actualResult);
	}
	
	@Test
    public void givenMessage_Null_ShouldReturnHappy() {
		MoodAnalyzer moodAnalyser = new MoodAnalyzer();
        moodAnalyser.setMessage(null);
        String actualResult = moodAnalyser.analyseMood();
        Assert.assertEquals("Happy", actualResult);
    }
}

	
