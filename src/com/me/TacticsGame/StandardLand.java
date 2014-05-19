package com.me.TacticsGame;
/**
 * Standard Land class for creating mundane land
 * @author Andrew
 */
public class StandardLand extends Terrain {

	/**
	 * StandardLand constructor that sets the initial values for Terrain using the StandardLand conditions
	 */
	public StandardLand() {
		landPassable = true;
		airPassable = true;
		waterPassable = false;
		movePenalty = 0;
		image = "StandardLand"; // constant question
	}
}
