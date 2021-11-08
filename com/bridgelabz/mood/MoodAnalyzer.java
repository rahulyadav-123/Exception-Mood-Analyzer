package com.bridgelabz.mood;

public class MoodAnalyzer {
	String message;
public MoodAnalyzer() {
		
	}
	
	public MoodAnalyzer(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public String analyseMood() {
		if (message.toLowerCase().contains("happy") || message.toLowerCase().contains("any")) {
			return "HAPPY";
		}
		else if (message.toLowerCase().contains("sad")) {
			return "SAD";
		}
		else {
			return null;
		}
    }
	
	public static void main(String[] args) {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
		
		moodAnalyzer.setMessage("I am Happy");
		System.out.println(moodAnalyzer.analyseMood());

		moodAnalyzer.setMessage("I am Sad");
		System.out.println(moodAnalyzer.analyseMood());
	}
}
	