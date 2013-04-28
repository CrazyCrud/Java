package de.constantin.lehenmeier;

public class KeyboardShifter {
	private String lowerKeys, upperKeys;
	
	public KeyboardShifter(){
		lowerKeys = "qwertyuiop[]asdfghjkl;'zxcvbnm,.";
		upperKeys = "QWERTYUIOP{}ASDFGHJKL:\"YXCVBNM<>";
	}
	
	/*
	 * Input: "Jr;;p ept;f"
	 */
	public String shiftKeyboard(String input){
		StringBuilder strBuilder = new StringBuilder();
		for(int i = 0; i < input.length(); i++){
			int lowerLndex = lowerKeys.indexOf(input.charAt(i));
			int upperIndex = upperKeys.indexOf(input.charAt(i));
			if(lowerLndex > -1){
				strBuilder.append(lowerKeys.charAt(lowerLndex - 1));
			}else if(upperIndex > -1){
				strBuilder.append(upperKeys.charAt(upperIndex - 1));
			}else{
				strBuilder.append(" ");
			}
		}
		return strBuilder.toString();
	}
}
