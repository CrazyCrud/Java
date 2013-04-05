package de.constantin.lehenmeier;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DigitalRoot {
	
	public static String getDigitalRoot(String number){
		if(isInputCorrect(number)){
			if(number.length() < 2){
				return number;
			}else{
				int dRoot = 0;
				for(int i = 0; i < number.length(); i++){
					dRoot += Character.getNumericValue(number.charAt(i));
				}
				return getDigitalRoot(Integer.toString(dRoot));
			}
		}else{
			return null;
		}
	}
	
	public static String getDigitalRootFaster(String number){
		if(isInputCorrect(number)){
			if(number.length() < 2){
				return number;
			}else{
				int inputNumber = Integer.parseInt(number);
				int digitalRoot = 0;
				while(inputNumber > 0){
					digitalRoot += inputNumber % 10;
					inputNumber /= 10;
				}
				return getDigitalRootFaster(Integer.toString(digitalRoot));
			}
		}else{
			return null;
		}
	}

	private static boolean isInputCorrect(String number) {
		if(number == null){
			return false;
		}else{
			Pattern pat = Pattern.compile("\\D");
			Matcher matcher = pat.matcher(number);
			if(matcher.find()){
				return false;
			}else{
				return true;
			}
		}
	}
}
