package de.constantin.lehenmeier;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WordAnalyser wAnalyser = new WordAnalyser("res/text.txt");
		wAnalyser.getNumberOfWords();
		wAnalyser.getNumberOfLetters();
		wAnalyser.getNumberOfSymbols();
	}

}
