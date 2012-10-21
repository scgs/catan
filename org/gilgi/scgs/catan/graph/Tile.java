package org.gilgi.scgs.catan.graph;

import org.gilgi.scgs.catan.Resource;

public class Tile extends Node {
	
    private boolean hasRobber;
    private Resource resource;
    private int diceValue;
    
    public Tile(int neighbors, Resource res, int diceValue) {
        super(neighbors);
        resource = res;
        this.diceValue = diceValue;
    }

	public boolean hasRobber() {
		return hasRobber;
	}

	public Resource getResource() {
		return resource;
	}

	public int getDiceValue() {
		return diceValue;
	}
	
}