package com.me.TacticsGame;
/**
 * Mountain class for creating mountain terrain
 * @author Andrew
 *
 */
public class Mountain extends Terrain{
	/**
	 * Constructor for Mountain class that initializes terrain variables to Mountain conditions
	 */
	public Mountain() {
		landPassable = true;
		airPassable = true;
		waterPassable = false;
		movePenalty = 6; // again i am not sure if i should be using a global variable here because IDK where else I might need to have it
		image = "Mountain"; //constant question
	}
}
