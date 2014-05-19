package com.me.TacticsGame;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;

public class testScreen implements Screen {

	//where the camera is
	Rectangle viewport;
	TileMap map;

	//spriteBatch helps with actually drawing all of the images to the screen
	SpriteBatch batch;

	//camera
	OrthographicCamera camera;


    @Override
    public void render(float delta) {
    	//map.drawMap(batch, camera);
    }

    @Override
    public void resize(int width, int height) {
        // TODO Auto-generated method stub

    }

    @Override
    public void show() {
        if (viewport == null) {
            // Make a viewport if one doesn't exist.
            viewport = new Rectangle(0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        }

        camera = new OrthographicCamera(500,500);
        batch = new SpriteBatch();
        map = new TileMap();
    }

    @Override
    public void hide() {
        // TODO Auto-generated method stub

    }

    @Override
    public void pause() {
        // TODO Auto-generated method stub

    }

    @Override
    public void resume() {
        // TODO Auto-generated method stub

    }

    @Override
    public void dispose() {
        // TODO Auto-generated method stub

    }

}
