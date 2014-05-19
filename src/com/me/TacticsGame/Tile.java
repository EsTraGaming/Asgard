package com.me.TacticsGame;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;

/**
 * Tile class that holds the information about where it is in the map
 * and what unit it may contain.
 * @author Andrew
 *
 */
public class Tile extends ImageTextButton {

	private boolean isOccupied;
	//Terrain object that determines what terrain it is and how it interacts with units
	private final Terrain terrain;
	//x and y coordinates on the TileMap
	private final int xPosition;
	private final int yPosition;
	//holds the image of the Tile
	private Sprite sprite;


	/**
	 * default constructor for Tile that initializes values to default.
	 * Probably will not be used too much.
	 */
	public Tile(Skin skin) {
		super("", skin);
		isOccupied = false;
		//terrain will probably be changed to an abstract class need to change when create the different terrains
		//this default will instead be changed to just a standard land
		terrain = new StandardLand();
		xPosition = 0;
		yPosition = 0;
	}
	/**
	 * constructor that sets up all initial default values
	 * except sets the coordinates of the x and y values.
	 * @param x
	 * @param y
	 */
	public Tile(int x, int y, Terrain t, Skin skin) {
		super(x +"," + y, skin);
		isOccupied = false;
		//terrain will probably be changed to an abstract class need to change when create the different terrains
		//this default will instead be changed to just a standard land
		terrain = t;
		xPosition = x;
		yPosition = y;
		//gets the correct sprite depending on the terrain image
		sprite = skin.getSprite(t.getImage());
		//hardcoded size for now
		sprite.setSize(50,50);
	}
	/**
	 * sets the Tile be occupied or not depending on param
	 * @param o
	 */
	public void setOccupied(boolean o) {
		isOccupied = o;
	}
	/**
	 * @return if the Tile is occupied or not
	 */
	public boolean isOccupied() {
		return isOccupied;
	}
	/**
	 * @return xPosition of the Tile
	 */
	public int getXPosition() {
		return xPosition;
	}
	/**
	 * @return yPosition of the Tile
	 */
	public int getYPosition() {
		return yPosition;
	}
	/**
	 * @return what terrain the Tile is
	 */
	public Terrain getTerrain() {
		return terrain;
	}
	/**
	 *  @return the sprite of the Tile
	 */
	public Sprite getSprite() {
		return sprite;
	}
}
