package de.constantin.lehenmeier;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class WordManager {
	private static WordManager INSTANCE;
	private HashMap<String, WordObj> words;
	
	private WordManager(){
		words = new HashMap<String, WordObj>();
	}
	
	protected static WordManager getWordManager(){
		if(INSTANCE == null){
			INSTANCE = new WordManager();
		}
		return INSTANCE;
	}
	
	protected void resetWordManager(){
		words.clear();
	}
	
	protected void addWord(String word){
		word = word.toLowerCase();
		if(hasWord(word)){
			words.get(word).increaseOccurence();	
		}else{
			words.put(word, new WordObj(word, false));
		}
	}
	
	protected int getNumberOfWords(){
		int count = 0;
		for(WordObj word: words.values()){
			count += word.getOccurence();
		}
		return count;
	}
	
	protected int getNumOfSymbols(){
		int count = 0;
		for(WordObj word: words.values()){
			count += word.getNumOfSymbols();
		}
		return count;
	}
	
	protected int getNumOfLetters(){
		int count = 0;
		for(WordObj word: words.values()){
			count += word.getNumOfLetters();
		}
		return count;
	}
	
	protected String getMostCommonWords(){
		ArrayList<WordObj> wordList = new ArrayList<WordObj>(words.values());
		Collections.sort(wordList, new WordComparator());
		StringBuilder sBuilder = new StringBuilder();
		if(wordList.size() > 0){
			if(wordList.size()  < 2){
				sBuilder.append("1: " + wordList.get(0).getWord());
			}else if(wordList.size()  < 3){
				sBuilder.append(", 2: " + wordList.get(1).getWord());
			}else{
				sBuilder.append(", 3: " + wordList.get(2).getWord());
			}
		}else{
			sBuilder.append("Empty Text");
		}
		return sBuilder.toString();
	}
	
	private boolean hasWord(String word){
		return words.containsKey(word)? true: false;
	}
	
	public class WordComparator implements Comparator<WordObj> 
	{
		@Override
		public int compare(WordObj word1, WordObj word2) {
			return word1.getWord().compareTo(word2.getWord());
		}
	}
}
