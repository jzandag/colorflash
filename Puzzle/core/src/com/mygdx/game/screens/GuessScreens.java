package com.mygdx.game.screens;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.mygdx.game.MyGdxGame;
import com.mygdx.game.guesslevels.LevelClearGuess;
import com.mygdx.game.scenes.Hud;

public class GuessScreens {
    public MyGdxGame game;

    private Texture bg;
    protected Stage stage;
    protected Table table;
    public TextureAtlas atlas;
    public Skin skin;

    protected Image query;
    protected TextButton choice1,choice2,choice3,choice4, choice5, choice6, choice7, choice8;
    protected TextButton[] choiceBtns;
    public LevelClearGuess levelClear;
    public Integer health;

    protected ClickListener correctHandler, wrongHandler;

    protected int currentQuestion; //randomized number
    protected int questionNumber; // current index

    protected int[] questions;
    protected int[] btnOrder;

    protected Hud hud;

    public GuessScreens(MyGdxGame game){
        this.game = game;
        health = 0;
        questions = SuperPlayScreen.RandomizeArray(1,20);
        btnOrder = SuperPlayScreen.RandomizeArray(0,7);

        stage = new Stage();
        atlas = new TextureAtlas("ui/colorBtn.pack");
        skin = new Skin(Gdx.files.internal("ui/colorFlashSkin.json"),atlas);

        table = new Table(skin);
        table.setBounds(0,0,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
        table.setFillParent(true);


    }

    public void show(){
        bg = new Texture("img/bg1.png");

        questionNumber = 0;

        Gdx.input.setInputProcessor(stage);
        currentQuestion = questions[questionNumber];



        choiceBtns = new TextButton[]{ choice1,choice2,choice3,choice4, choice5, choice6, choice7, choice8};


        stage.addActor(table);
    }

    public void render(float delta){
        update(delta);
        Gdx.gl.glClearColor(1, 1f, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        game.batch.begin();
        game.batch.draw(bg,0,0, Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
        game.batch.end();

        stage.act();
        stage.draw();
        hud.stage.draw();
    }

    private void update(float delta){
        hud.update(delta);
    }
}
