package com.mygdx.game.guesslevels;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.audio.Sound;
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
import com.mygdx.game.scenes.Hud;
import com.mygdx.game.scenes.LevelClear;
import com.mygdx.game.screens.GameScreens;
import com.mygdx.game.screens.SuperPlayScreen;

public class Beginner implements Screen {
    private static final int STAGE_LEVEL = 0;

    private MyGdxGame game;

    private Texture bg;
    protected Stage stage;
    protected Table table;
    public TextureAtlas atlas;
    public Skin skin;

    protected Image query;
    protected TextButton choice1,choice2,choice3,choice4, choice5, choice6, choice7, choice8;
    protected TextButton[] choiceBtns;
    public LevelClear levelClear;

    protected ClickListener correctHandler, wrongHandler;

    protected int currentQuestion; //randomized number
    protected int questionNumber; // current index

    protected int[] questions;
    protected int[] btnOrder;

    protected Hud hud;


    public Beginner(MyGdxGame game){
        this.game = game;

        questions = SuperPlayScreen.RandomizeArray(1,20);
        btnOrder = SuperPlayScreen.RandomizeArray(0,7);

        stage = new Stage();
        atlas = new TextureAtlas("ui/colorBtn.pack");
        skin = new Skin(Gdx.files.internal("ui/colorFlashSkin.json"),atlas);

        table = new Table(skin);
        table.setBounds(0,0,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
        table.setFillParent(true);

        correctHandler = new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y) {
                //correct();
            }
        };

        wrongHandler = new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y) {
                //wrong();
            }
        };
    }

    @Override
    public void show() {
        bg = new Texture("img/bg1.png");
        hud = new Hud(game.batch,STAGE_LEVEL);

        questionNumber = 0;

        Gdx.input.setInputProcessor(stage);
        currentQuestion = questions[questionNumber];

        getQuestion(1);

        choiceBtns = new TextButton[]{ choice1,choice2,choice3,choice4, choice5, choice6, choice7, choice8};

        setUpChoices(btnOrder);
        stage.addActor(table);

    }

    private void getQuestion(int currentQuestion){
        switch(currentQuestion){
            case 1:
                /*System.out.println("amazon");*/
                query = new Image(new Texture("img/logo1/bonchon.png"));
                choice1 = new TextButton(" ", skin, "orange");
                choice1.addListener(correctHandler);
                //random colors
                choice2 = new TextButton(" ", skin, "blue");
                choice2.addListener(wrongHandler);
                choice3 = new TextButton(" ", skin, "red");
                choice3.addListener(wrongHandler);
                choice4 = new TextButton(" ", skin, "yellow");
                choice4.addListener(wrongHandler);
                choice5 = new TextButton(" ", skin, "blue");
                choice5.addListener(wrongHandler);
                choice6 = new TextButton(" ", skin, "green");
                choice6.addListener(wrongHandler);
                choice7 = new TextButton(" ", skin, "green");
                choice7.addListener(wrongHandler);
                choice8 = new TextButton(" ", skin, "violet");
                choice8.addListener(wrongHandler);
                break;
            default:
        }
    }

    public void setUpChoices(int[] btnOrder){
        int count = 1;
        choiceBtns = new TextButton[]{ choice1,choice2,choice3,choice4,choice5, choice6, choice7,choice8};
        table.top();
        table.add(query).colspan(4).center().width(Gdx.graphics.getWidth()-80).height(Gdx.graphics.getWidth()-80).padTop(40);
        table.row();
        for(int i: btnOrder){
            table.add(choiceBtns[i]).size((Gdx.graphics.getWidth() /5), Gdx.graphics.getHeight() / 11).pad(20).spaceBottom(10).padLeft(10).padRight(10);
            if(count % 4 == 0)
                table.row();
            count++;
        }
    }

    private void update(float delta){

    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(1, 1f, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        game.batch.begin();
        game.batch.draw(bg,0,0, Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
        game.batch.end();

        stage.act();
        stage.draw();
        hud.stage.draw();
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
        //dispose();
    }

    @Override
    public void dispose() {

    }
}
