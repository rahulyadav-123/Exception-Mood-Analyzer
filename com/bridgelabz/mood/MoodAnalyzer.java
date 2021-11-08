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
	
	public String analyseMood() throws MoodAnalysisException{
		try {
			if (message.toLowerCase().contains("sad")) {
				return "SAD";
			}
			else {
				return "HAPPY";
			}
		}
		catch (NullPointerException e) {
			throw new MoodAnalysisException("Entered Invalid Mood");
		}
    }
	
	public static void main(String[] args) throws MoodAnalysisException  {
		MoodAnalyzer moodAnalyser = new MoodAnalyzer();
		
		moodAnalyser.setMessage("I am Happy");
		System.out.println(moodAnalyser.analyseMood());

		moodAnalyser.setMessage("I am Sad");
		System.out.println(moodAnalyser.analyseMood());
		
		moodAnalyser.setMessage(null);
		try {
			System.out.println(moodAnalyser.analyseMood());
		} catch (MoodAnalysisException e) {
			e.printStackTrace();
		}
	}
}