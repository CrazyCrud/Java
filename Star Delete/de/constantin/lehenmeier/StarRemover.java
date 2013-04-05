package de.constantin.lehenmeier;

public class StarRemover {
	public static String starDelete(String inStr) {
	    return inStr.replaceAll(".?\\*+.?", "");
	}
}
