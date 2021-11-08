package com.labz.mood;

import org.junit.Assert;
import org.junit.Test;

import com.bridgelabz.mood.MoodAnalysisException;
import com.bridgelabz.mood.MoodAnalyzer;


public class MoodAnalyzerTest {
	@Test
	public void givenMessage_IsProper_ShouldReturnSad() throws MoodAnalysisException {
		MoodAnalyzer moodAnalyser = new MoodAnalyzer();
		moodAnalyser.setMessage("I am Sad");
		String actualResult = moodAnalyser.analyseMood();
		Assert.assertEquals("SAD", actualResult);
	}
	
	@Test
	public void givenMessage_IsProper_ShouldReturnHappy() throws MoodAnalysisException {
		MoodAnalyzer moodAnalyser = new MoodAnalyzer();
		moodAnalyser.setMessage("I am in any mood");
		String actualResult = moodAnalyser.analyseMood();
		Assert.assertEquals("HAPPY", actualResult);
	}
	
	@Test
    public void givenMessage_Null_ShouldReturnInvalidMood() throws MoodAnalysisException {
		MoodAnalyzer moodAnalyser = new MoodAnalyzer();
        moodAnalyser.setMessage(null);
        try {
        	String actualResult = moodAnalyser.analyseMood();
	        Assert.assertEquals("Invalid Mood", actualResult);
        }
        catch(MoodAnalysisException e) {
        	System.out.println("Exception occured :" + e);
        }
	}
}
