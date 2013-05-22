package de.constantin.lehenmeier;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class InputReader {
	public static ArrayList<String> readFile(String path){
		ArrayList<String> inputText = new ArrayList<String>();
		try{
			BufferedReader bf = new BufferedReader(
					new FileReader(path));
			String input = bf.readLine();
			while(input != null){
				inputText.add(input.trim());
				input = bf.readLine();
			}
			return inputText;
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
