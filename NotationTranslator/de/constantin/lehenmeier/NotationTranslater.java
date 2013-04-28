package de.constantin.lehenmeier;

public class NotationTranslater {
	
	public static String getScientificNotationOf(String input){
		double exponent = Math.floor(Math.log10(Double.parseDouble(input)));
	    double value = Double.parseDouble(input) / Math.pow(10, exponent);
		return (value + " x10 ^ " + exponent);
	}
}
