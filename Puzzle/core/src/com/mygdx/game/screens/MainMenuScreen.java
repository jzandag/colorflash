package com.mygdx.game.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.mygdx.game.MyGdxGame;
import com.mygdx.game.tween.SpriteAccessor;

import aurelienribon.tweenengine.BaseTween;
import aurelienribon.tweenengine.Timeline;
import aurelienribon.tweenengine.Tween;
import aurelienribon.tweenengine.TweenCallback;
import aurelienribon.tweenengine.TweenManager;

public class MainMenuScreen implements Screen {

    private MyGdxGame game;

    private Viewport viewport;

    private Texture img;
    private Texture logo;
    private Sprite start;

    private TweenManager tweenManager;

    public MainMenuScreen(MyGdxGame game){
        this.game = game;
    }

    @Override
    public void show() {
        img = new Texture("img/bg1.png");
        logo = new Texture("img/logo.png");
        start = new Sprite(new Texture("img/rocket.png"));
        start.setPosition((Gdx.graphics.getWidth()/2) - start.getWidth()/2, (Gdx.graphics.getHeight()/2) - start.getHeight()/2);

        viewport = new FitViewport(Gdx.graphics.getWidth(),Gdx.graphics.getHeight(), new OrthographicCamera());
        viewport.getCamera().position.x = Gdx.graphics.getWidth()/2;
        viewport.getCamera().position.y = Gdx.graphics.getHeight()/2;
        tweenManager = new TweenManager();
        Tween.registerAccessor(Sprite.class, new SpriteAccessor());

    }

    public void handleInput(){
        if(Gdx.input.justTouched()){
            Timeline.createSequence().beginSequence()
                    .push(Tween.to(start, SpriteAccessor.X, 1f).target(Gdx.graphics.getWidth()))
                    .end()
                    .setCallback(new TweenCallback() {
                        @Override
                        public void onEvent(int type, BaseTween<?> source) {
                            game.setScreen(new SelectScreen(game));
                        }
                    }).start(tweenManager);
        }

    }

    @Override
    public void render(float delta) {
        handleInput();
        tweenManager.update(delta);
        Gdx.gl.glClearColor(1, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        game.batch.setProjectionMatrix(viewport.getCamera().combined);
        game.batch.begin();
        game.batch.draw(img,0,0,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
        game.batch.draw(logo, Gdx.graphics.getWidth() / 2 - logo.getWidth()/2, Gdx.graphics.getHeight() / 2 + start.getHeight()/2);
        start.draw(game.batch);
        game.batch.end();

    }

    @Override
    public void resize(int width, int height) {
        viewport.update(width,height);
    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {
        dispose();
    }

    @Override
    public void dispose() {
        img.dispose();
        start.getTexture().dispose();
    }
}
