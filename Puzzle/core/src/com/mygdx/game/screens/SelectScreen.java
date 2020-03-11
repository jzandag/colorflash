package com.mygdx.game.screens;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.mygdx.game.MyGdxGame;
import com.mygdx.game.chooselevels.Advanced;

import static com.badlogic.gdx.scenes.scene2d.actions.Actions.moveTo;
import static com.badlogic.gdx.scenes.scene2d.actions.Actions.run;
import static com.badlogic.gdx.scenes.scene2d.actions.Actions.sequence;

public class SelectScreen implements Screen {
    private MyGdxGame game;

    private Stage stage;
    private Table table;
    private TextureAtlas atlas;
    private Skin skin;
    private TextButton backBtn;
    private Texture bg;

    public SelectScreen(MyGdxGame game) {
        this.game = game;
    }

    @Override
    public void show() {
        stage = new Stage();
        bg = new Texture("img/bg1.png");
        atlas = new TextureAtlas("ui/colorBtn.pack");
        skin = new Skin(Gdx.files.internal("ui/colorFlashSkin.json"),atlas);

        Table listButton;

        TextButton btnBeginner = new TextButton("Choose the color",skin, "red");
        TextButton btnIntermediate = new TextButton("Guess the color",skin, "orange");

        btnBeginner.addListener(new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y) {
                game.setScreen(new LevelsScreen(game));
            }
        });
        btnIntermediate.addListener(new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y) {
                game.setScreen(new Guesslevel(game));
            }
        });
        backBtn = new TextButton("back", skin,"green");
        backBtn.addListener(new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y) {
                sequence(moveTo(stage.getWidth(), 0), moveTo(0,0,0.5f),run(new Runnable() {
                    @Override
                    public void run() {
                    }
                }));

                game.setScreen(new MainMenuScreen(game));

            }
        });
        table = new Table();
        table.setBounds(0,0,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
        table.setFillParent(true);
        //put stuff together
        table.add(btnBeginner).center().pad(50).size(Gdx.graphics.getWidth()-100, Gdx.graphics.getHeight() / 5);
        table.row();
        table.add(btnIntermediate).center().pad(50).size(Gdx.graphics.getWidth()-100, Gdx.graphics.getHeight() / 5);
        table.row();
        table.add(backBtn);

        stage.addActor(table);

        stage.addAction(sequence(moveTo(0,stage.getHeight()), moveTo(0,0,0.5f)));



    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(1, 1f, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        game.batch.begin();
        game.batch.draw(bg,0,0,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
        game.batch.end();

        Gdx.input.setInputProcessor(stage);
        stage.act(delta);
        stage.draw();


    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
