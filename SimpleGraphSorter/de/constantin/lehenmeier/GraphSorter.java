package de.constantin.lehenmeier;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class GraphSorter {
	ArrayList<String> inputGraph;
	ArrayList<Edge> graph;
	
	protected GraphSorter(String path){
		inputGraph = InputReader.readFile(path);
		graph = new ArrayList<Edge>();
	}
	
	protected void sortGraph(){
		if(inputGraph == null){
			return;
		}else{
			constructEdges();
			compareEdges();
		}
	}
	
	protected void printSortedGraph(){
		if(inputGraph == null){
			return;
		}else{
			for(Edge edge: graph){
				System.out.println(edge.getId());
			}
		}
	}

	private void compareEdges(){
		Collections.sort(graph, new Comparator<Edge>(){
			@Override
			public int compare(Edge i, Edge j) {
				return i.getVerticeFrom() - j.getVerticeFrom();
			}
		});
	}

	private void constructEdges(){
		for(String line: inputGraph){
			if(line.length() > 1){
				String [] splittedLine = line.split("\\s");
				char id = splittedLine[0].charAt(0);
				int fromVertice = Integer.parseInt(splittedLine[1]);
				int toVertice = Integer.parseInt(splittedLine[2]);
				graph.add(new Edge(id, fromVertice, toVertice));
			}
		}
	}
}
