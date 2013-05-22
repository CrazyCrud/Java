package de.constantin.lehenmeier;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ListSorting listSorting = new ListSorting(ListReader.readList("res/listA.txt"),
				ListReader.readList("res/listB.txt"));
		listSorting.sortLists();
		listSorting.printMergedList();
	}

}
