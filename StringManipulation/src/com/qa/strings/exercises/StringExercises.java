package com.qa.strings.exercises;

public class StringExercises {
	
	public void displayWeather() {
		String weatherOld = "yesterday it was raining";
		String weatherCurrent = "today it is sunny";
		
		System.out.println(weatherCurrent.toUpperCase() + ", " + weatherOld.toUpperCase());
		System.out.println(weatherCurrent.toUpperCase().concat(", ".concat(weatherOld.toUpperCase())));
		
		System.out.println(weatherCurrent.substring(0, 12).toUpperCase() + weatherOld.substring(17).toUpperCase());
	}
	
	public boolean findString(String message, String word) {
		for(int i = 0; i < message.length() - word.length(); i++) {
			if(message.substring(i, i + word.length()).equals(word)) {
				return true;
			}
		}
		
		return false;
		
	}
	
	public int countWords(String sentence) {
		int wordCount = 0;
		
		if(sentence.length() < 1) {
			return wordCount;
		} else {
			wordCount++;
			for(int i = 0; i < sentence.length(); i++) {
				if(sentence.substring(i, i + 1).equals(" ")) {
					wordCount++;
				}
			}
		}
	
		return wordCount;
	}
	
	public void verticalWords(String sentence) {
		String word = "";

		for (int i = 0; i < sentence.length(); i++) {
			if (sentence.substring(i, i + 1).equals(" ")) {
				System.out.println(word);
				word = "";
			} else {
				word += sentence.substring(i, i + 1);
			}
		}
		System.out.println(word);

	}
	
	public void reverseVerticalWords(String sentence) {
		String word = "";

		for (int i = sentence.length(); i > 0; i--) {
			if (sentence.substring(i - 1, i).equals(" ")) {
				System.out.println(word);
				word = "";
			} else {
				word = sentence.substring(i-1, i) + word;
			}
		}
		System.out.println(word);
	}

}
