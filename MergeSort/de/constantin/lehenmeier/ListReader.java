package de.constantin.lehenmeier;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ListReader {
	protected static Object[] readList(String path){
		try {
			BufferedReader bf = new BufferedReader(
					new FileReader(path));
			ArrayList<Integer> values = new ArrayList<Integer>();
			String input = bf.readLine();
			while(input != null){
				values.add(Integer.parseInt(input.trim()));
				input = bf.readLine();
			}
			return values.toArray();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
