package org.gilgi.scgs.catan;

public class Player {
	
    private int[] resources;
    
    public Player() {
        resources = new int[Resource.length];
    }
    
    public int[] getResources() {
    	return resources;
    }
    
}
