package com.me.TacticsGame;


/**
 * Terrain class, that will determine how a Tile will interact with units
 * @author Andrew
 *
 */
abstract class Terrain {

	//how much it slows down a unit
	int movePenalty;
	//can cross through walk / horse
	boolean landPassable;
	//can cross through flight
	boolean airPassable;
	//can cross through swimming
	boolean waterPassable;
	//name of the image in string format to get from the skin
	String image;

	/**
	 * @return boolean saying if you can run over this terrain
	 */
	public boolean isLandPassable() {
		return landPassable;
	}
	/**
	 *
	 * @return boolean saying if you can fly over this terrain
	 */
	public boolean isAirPassable() {
		return airPassable;
	}
	/**
	 * @return boolean saying if you can swim through this terrain
	 */
	public boolean isWaterPassable() {
		return waterPassable;
	}
	/**
	 * @return int amount of how much terrain deducts from the movement of a unit
	 */
	public int getMovePenalty() {
		return movePenalty;
	}
	/**
	 * @return the name of the image in String format to retrieve from the skin in Tile
	 */
	public String getImage() {
		return image;
	}
}
