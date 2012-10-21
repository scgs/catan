package org.gilgi.scgs.catan.graph;

public class Node {
	
    private Node[] neighbors;
    
    public Node(int neighbors) {
        this.neighbors = new Node[neighbors];
    }

	public Node[] getNeighbors() {
		return neighbors;
	}
	
}