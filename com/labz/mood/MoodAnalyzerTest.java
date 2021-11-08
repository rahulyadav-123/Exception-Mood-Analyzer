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
}

	
