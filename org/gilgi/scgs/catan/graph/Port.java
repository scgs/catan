package org.gilgi.scgs.catan.graph;

import org.gilgi.scgs.catan.Resource;

public class Port extends Node {
	
    private Resource resource;
    private int tradeCost;
    
    public Port(int neighbors, Resource res, int cost) {
        super(neighbors);
        resource = res;
        tradeCost = cost;
    }
    
	public Resource getResource() {
		return resource;
	}
	
	public int getTradeCost() {
		return tradeCost;
	}
    
}