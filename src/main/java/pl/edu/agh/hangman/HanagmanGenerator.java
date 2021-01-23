package pl.edu.agh.hangman;

import java.util.List;
import java.util.Random;

public class HanagmanGenerator implements WordPicker {
	Random generator = new Random();
	private List<String> words;

	public void randomWordPicker() {

		getRandomWords(words);
	}

	public String getRandomWords(List<String> words) {

		return words.get(generator.nextInt(words.size()));
	}

	public HanagmanGenerator(List<String> words) {
		this.words = words;
	}

	@Override
	public String getWord() {
		return words.get(generator.nextInt(words.size()));
	}

}