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
		try {
			if (message.toLowerCase().contains("sad")) {
				return "SAD";
			}
			else {
				return "HAPPY";
			}
		}
		catch (NullPointerException e) {
			return "HAPPY";
		}
    }
	
	public static void main(String[] args) {
		MoodAnalyzer moodAnalyser = new MoodAnalyzer();
		
		moodAnalyser.setMessage("I am Happy");
		System.out.println(moodAnalyser.analyseMood());

		moodAnalyser.setMessage("I am Sad");
		System.out.println(moodAnalyser.analyseMood());
		
		moodAnalyser.setMessage(null);
		System.out.println(moodAnalyser.analyseMood());
	}
}
