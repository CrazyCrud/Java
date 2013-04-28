package de.constantin.lehenmeier;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		KeyboardShifter kShift = new KeyboardShifter();
		String shiftedInput = kShift.shiftKeyboard("Jr;;p ept;f");
		System.out.println(shiftedInput);
	}

}
