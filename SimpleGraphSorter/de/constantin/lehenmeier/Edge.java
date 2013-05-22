package de.constantin.lehenmeier;

public class Edge {
	private char id;
	private int verticeFrom, verticeTo;
	
	protected Edge(char id, int verticeFrom, int verticeTo){
		this.setId(id);
		this.setVerticeFrom(verticeFrom);
		this.setVerticeTo(verticeTo);
	}

	protected char getId() {
		return id;
	}

	private void setId(char id) {
		this.id = id;
	}

	protected int getVerticeFrom() {
		return verticeFrom;
	}

	private void setVerticeFrom(int verticeFrom) {
		this.verticeFrom = verticeFrom;
	}

	protected int getVerticeTo() {
		return verticeTo;
	}

	private void setVerticeTo(int verticeTo) {
		this.verticeTo = verticeTo;
	}
}
