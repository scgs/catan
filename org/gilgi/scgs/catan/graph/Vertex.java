package org.gilgi.scgs.catan.graph;

import org.gilgi.scgs.catan.Player;

public class Vertex extends Node {
	
    private Player settlementOwner;
    private boolean isCity;
    
    public Vertex(int neighbors) {
        super(neighbors);
    }
    
    public boolean hasSettlement() {
        if (settlementOwner == null) {
            return false;
        }
        return true;
    }
    
    public Player getOwner() {
    	return settlementOwner;
    }

	public boolean isCity() {
		return isCity;
	}
    
}
