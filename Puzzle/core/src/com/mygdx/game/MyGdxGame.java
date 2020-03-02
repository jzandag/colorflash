package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.mygdx.game.screens.Guesslevel;
import com.mygdx.game.screens.MainMenuScreen;
import com.mygdx.game.screens.PlayScreen;

public class MyGdxGame extends Game {
	public static final String TITLE = "Color Flash	";
	public static final int GAME_WIDTH = 480;
	public static final int GAME_HEIGHT = 700;

	public Music music;
	public SpriteBatch batch;
	public static AssetManager assets;

	@Override
	public void create () {
		batch = new SpriteBatch();

		assets = new AssetManager();
		assets.load("audio/bgmusic.mp3", Music.class);
		assets.load("audio/pop.wav", Sound.class);
		assets.load("audio/bell.wav", Sound.class);
		assets.load("audio/fail.wav", Sound.class);
		assets.load("audio/result.mp3", Sound.class);
		assets.finishLoading();

		music = assets.get("audio/bgmusic.mp3", Music.class);
		music.setLooping(true);
		music.setVolume(0.4f);
		music.play();

		setScreen(new Guesslevel(this));

	}

	@Override
	public void render () {
		super.render();
	}

	@Override
	public void resize(int width, int height) {
		super.resize(width, height);
	}

	@Override
	public void dispose () {
		super.dispose();
		//batch.dispose();
	}

	@Override
	public void pause() {
		super.pause();
	}

	@Override
	public void resume() {
		super.resume();
	}
}
