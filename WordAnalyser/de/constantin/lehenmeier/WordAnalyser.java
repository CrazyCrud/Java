package de.constantin.lehenmeier;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class WordAnalyser {
	
	protected WordAnalyser(String path){
		readInText(path);
	}

	private void readInText(String path){
		try{
			BufferedReader bf = new 
					BufferedReader(new FileReader(path));
			String input = bf.readLine();
			while(input != null){
				String [] wordsPerLine = input.split("\\pZ");
				for(String word: wordsPerLine){
					word = word.replaceAll("\\pP", "");
					WordManager.getWordManager().addWord(word);
				}
				input = bf.readLine();
			}
		}catch (FileNotFoundException e){
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	protected void getNumberOfWords(){
		System.out.println(
				WordManager.getWordManager().getNumberOfWords());
	}
	
	protected void getNumberOfLetters(){
		System.out.println(
				WordManager.getWordManager().getNumOfLetters());
	}
	
	protected void getNumberOfSymbols(){
		System.out.println(
				WordManager.getWordManager().getNumOfSymbols());
	}
}
