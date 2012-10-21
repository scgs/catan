package org.gilgi.scgs.catan.graph;

import org.gilgi.scgs.catan.Player;

public class Edge extends Node {
	
    private Player roadOwner;
    
    public Edge(int neighbors) {
        super(neighbors);
    }
    
    public boolean hasRoad() {
        if (roadOwner == null) {
            return false;
        }
        return true;
    }
    
    public Player getOwner() {
    	return roadOwner;
    }
    
}
