package com.me.TacticsGame;

import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;

/**
 * TileMap class that will create the maps for the tactics game
 * probably will have methods to handle movement
 * @author Andrew
 *
 */
public class TileMap {


	private Tile[][] map;

	//asset manager to get rid of images more easily and stuff that i don't quite get
	AssetManager assetManager;
	//images that are packed together are a TextureAtlas, used to create the skin.
	private TextureAtlas atlas;
	//skin allows us to access the different images from the textureAtlas
	private final Skin skin;



	public TileMap() {

		 //still not sure why this is good
        assetManager = new AssetManager();
        //load the terrain pack of images
        assetManager.load("Assets/Terrain.pack", TextureAtlas.class);
        assetManager.finishLoading();

        //initialize the texture atlas and skin
        atlas = assetManager.get("Assets/Terrain.pack");
        skin = new Skin(atlas);

		createMap(10,10,skin);
	}
	/**
	 * creates a TileMap of specified height and width
	 * will change implementation later
	 * for now it only creates a bunch of tiles of standardLand
	 * have yet to implement reading text files
	 * @param height
	 * @param width
	 */
	private void createMap(int height, int width, Skin skin) {
		map = new Tile[height][width];
		for(int i = 0; i < height; i++) {
			for(int j = 0; j < width; j++) {
				map[i][j] = new Tile(i,j, new StandardLand(),skin);
			}
		}

		//still not sure why this is good
        assetManager = new AssetManager();
        //load the terrain pack of images
        assetManager.load("Assets/Terrain.pack", TextureAtlas.class);
        assetManager.finishLoading();


        //initialize the texture atlas and skin
        atlas = assetManager.get("Assets/Terrain.pack");
        skin = new Skin(atlas);
	}
	/**
	 * draws all the sprites for each tile
	 * @param batch
	 */
	public void drawMap(SpriteBatch batch, OrthographicCamera camera) {
		batch.setProjectionMatrix(camera.combined);
		batch.begin();
		for(int i = 0; i < map.length; i++) {
			for(int j = 0; j < map.length; j++) {
				map[i][j].getSprite().draw(batch);
			}
		}
		batch.end();

	}
}


