package com.me.TacticsGame;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
        cfg.width = 900;
        cfg.height = 700;
        cfg.vSyncEnabled = true;
        cfg.fullscreen = false;
        cfg.useGL20 = true;
        cfg.title = "Tactics Game";
        
        new LwjglApplication(new TacticsGame(), cfg);
    }

}
