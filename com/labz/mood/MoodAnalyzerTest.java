package com.labz.mood;

import org.junit.Assert;
import org.junit.Test;

import com.bridgelabz.mood.MoodAnalyzer;


public class MoodAnalyzerTest {
	@Test
	public void givenMessage_IsProper_ShouldReturnSad() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
		moodAnalyzer.setMessage("I am Sad");
		String actualResult = moodAnalyzer.analyseMood();
		Assert.assertEquals("SAD", actualResult);
	}
	
	@Test
	public void givenMessage_IsProper_ShouldReturnHappy() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
		moodAnalyzer.setMessage("I am happy");
		String actualResult = moodAnalyzer.analyseMood();
		Assert.assertEquals("HAPPY", actualResult);
	}
}

	
