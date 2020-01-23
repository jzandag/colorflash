package com.mygdx.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mygdx.game.MyGdxGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = MyGdxGame.TITLE;
		config.width = MyGdxGame.GAME_WIDTH;
		config.height = MyGdxGame.GAME_HEIGHT;

		config.resizable = true;
		config.useGL30 = true;
		config.vSyncEnabled = true;
		config.audioDeviceBufferCount = 4096*10;
		new LwjglApplication(new MyGdxGame(), config);
	}
}
