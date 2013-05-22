package de.constantin.lehenmeier;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		GraphSorter graphSorter = new GraphSorter("res/graph.txt");
		graphSorter.sortGraph();
		graphSorter.printSortedGraph();
	}

}
