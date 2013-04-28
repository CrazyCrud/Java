package de.constantin.lehenmeier;

public class TextDecoder {
	private String alphabet;
	
	public TextDecoder(){
		alphabet = "abcdefghijklmnopqrstuvwxyz";
	}
	
	public void decodeDigits(String input){
		decode(input, "");
	}
	
	private void decode(String input, String result){
		if(input == null){
			return;
		}
		if(input.length() < 1){
			System.out.println(result);
		}else{
			if(input.length() > 1){
				if(isValidNumber(Integer.parseInt(input.substring(0, 2)))){
					decode(input.substring(2),
							result + String.valueOf(
									decodeFrom(Integer.parseInt(input.substring(0, 2)))));
				}
			}
			decode(input.substring(1), 
					result + String.valueOf(decodeFrom(Integer.parseInt(input.substring(0, 1)))));
		}
	}
	
	private char decodeFrom(int number){
		return alphabet.charAt(number - 1);
	}
	
	private boolean isValidNumber(int number){
		return (number > 0 && number < 27)? true: false;
	}
}
