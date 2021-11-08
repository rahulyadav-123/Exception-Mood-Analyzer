package com.bridgelabz.mood;

public class MoodAnalyzer {
	
	
	public String analyseMood(String message) {
	if (message.toLowerCase().contains("sad")) {
        return "SAD";
    } else if (message.toLowerCase().contains("any")) {
        return "HAPPY";
    } else {
        return null;
    }
}

public static void main(String[] args) {
	MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
	String mood = moodAnalyzer.analyseMood("I am happy");
	System.out.println(mood);
	mood = moodAnalyzer.analyseMood("I am sad");
	System.out.println(mood);
	}
}