package de.constantin.lehenmeier;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordObj {
	private static int UNDEFINED = -1;
	
	private boolean isFirstWord;
	private int occurence;
	private int numOfLetters = UNDEFINED;
	private int numOfSymbols = UNDEFINED;
	private String word;
	private Pattern symbPat;
	
	protected WordObj(String word, boolean isFirstWord){
		symbPat = Pattern.compile("[^\\pL\\pN]");
		setWord(word);
		setOccurence(1);
		setFirstWord(isFirstWord);
	}
	
	protected boolean isFirstWord() {
		return isFirstWord;
	}
	
	private void setFirstWord(boolean isFirstWord) {
		this.isFirstWord = isFirstWord;
	}
	
	protected int getOccurence() {
		return occurence;
	}
	
	private void setOccurence(int occurence) {
		this.occurence = occurence;
	}
	
	protected void increaseOccurence() {
		this.occurence++;
	}
	
	protected int getNumOfLetters() {
		if(numOfLetters == UNDEFINED){
			setNumOfLetters(word.length());
		}
		return word.length();
	}
	
	private void setNumOfLetters(int numOfLetters) {
		this.numOfLetters = numOfLetters;
	}
	
	protected int getNumOfSymbols() {
		if(numOfSymbols == UNDEFINED){
			Matcher matcher = symbPat.matcher(word);
			int computedSymbols = 0;
			while(matcher.find()){
				computedSymbols++;
			}
			setNumOfSymbols(computedSymbols);
		}
		return numOfSymbols;
	}
	
	private void setNumOfSymbols(int numOfSymbols) {
		this.numOfSymbols = numOfSymbols;
	}
	
	protected String getWord() {
		return word.toLowerCase();
	}
	
	private void setWord(String word) {
		this.word = word.toLowerCase();
	}
}
