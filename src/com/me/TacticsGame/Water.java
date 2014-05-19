package com.me.TacticsGame;

/**
 * Water class for creating water Terrain
 * @author Andrew
 *
 */
public class Water extends Terrain {
	/**
	 * Constructor for Water class that initializes Terrain variables to Water conditions
	 */
	public Water() {
		landPassable = false;
		airPassable = true;
		waterPassable = true;
		movePenalty = 4; //Should I be making a global constant for this? WATER_PENALTY or something?
		image = "Water"; //again the constant question
	}
}
