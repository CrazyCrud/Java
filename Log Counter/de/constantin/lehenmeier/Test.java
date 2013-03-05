package de.constantin.lehenmeier;

public class Test {
	public static void main(String [] args){
		LogCounter logCounter = new LogCounter("res/log.txt", "res/output.txt");
		logCounter.writeLogs(3);
	}
}
