package com.mygdx.game.screens;

import com.badlogic.gdx.Gdx;
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

import java.util.Random;

public class GameScreens {

    protected MyGdxGame game;
    protected Texture bg;

    protected Stage stage;
    protected Table table;
    public TextureAtlas atlas;
    public Skin skin;
    protected Image query;
    protected TextButton choice1,choice2,choice3,choice4;
    protected TextButton[] choiceBtns;
    public LevelClear levelClear;

    protected ClickListener correctHandler, wrongHandler;

    protected int currentQuestion; //randomized number
    protected int questionNumber; // current index

    protected int[] questions;
    protected int[] btnOrder;

    protected Hud hud;


    public GameScreens(MyGdxGame game){
        this.game = game;
        questions = SuperPlayScreen.RandomizeArray(1,20);
        btnOrder = SuperPlayScreen.RandomizeArray(0,3);

        stage = new Stage();
        atlas = new TextureAtlas("ui/colorBtn.pack");
        skin = new Skin(Gdx.files.internal("ui/colorFlashSkin.json"),atlas);

        table = new Table(skin);
        table.setBounds(0,0,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
        table.setFillParent(true);

        correctHandler = new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y) {
                correct();
            }
        };

        wrongHandler = new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y) {
                wrong();
            }
        };
    }

    public void show(){
        bg = new Texture("img/rainbow.jpg");
        questionNumber = 0;

        Gdx.input.setInputProcessor(stage);
        //get current question from the array of int
        currentQuestion = questions[questionNumber];
        getQuestion(currentQuestion);

        choiceBtns = new TextButton[]{ choice1,choice2,choice3,choice4};

        setUpChoices(btnOrder);
        stage.addActor(table);
    }

    public void render(){
        Gdx.gl.glClearColor(1, 1f, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        game.batch.begin();
        game.batch.draw(bg,0,0, Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
        game.batch.end();

        stage.act();
        stage.draw();
        hud.stage.draw();

    }

    private void getQuestion(int currentQuestion){
        switch (currentQuestion){
            case 1:
                query = new Image(new Texture("img/1.png"));
                choice1 = new TextButton("BLUE", skin, "red");
                choice1.addListener(correctHandler);
                //random colors
                choice2 = new TextButton("ORANGE", skin, "red");
                choice2.addListener(wrongHandler);
                choice3 = new TextButton("GREEN", skin, "red");
                choice3.addListener(wrongHandler);
                choice4 = new TextButton("RED", skin, "red");
                choice4.addListener(wrongHandler);
                break;
            case 2:
                query = new Image(new Texture("img/2.png"));
                choice1 = new TextButton("YELLOW", skin, "yellow");
                choice1.addListener(correctHandler);
                //random colors
                choice2 = new TextButton("BLUE", skin, "yellow");
                choice2.addListener(wrongHandler);
                choice3 = new TextButton("GREEN", skin, "yellow");
                choice3.addListener(wrongHandler);
                choice4 = new TextButton("BLACK ", skin, "yellow");
                choice4.addListener(wrongHandler);
                break;
            case 3:
                query = new Image(new Texture("img/3.png"));
                choice1 = new TextButton("ORANGE", skin, "green");
                choice1.addListener(correctHandler);
                //random colors
                choice2 = new TextButton("GREEN", skin, "green");
                choice2.addListener(wrongHandler);
                choice3 = new TextButton("YELLOW", skin, "green");
                choice3.addListener(wrongHandler);
                choice4 = new TextButton("WHITE", skin, "green");
                choice4.addListener(wrongHandler);
                break;
            case 4:
                query = new Image(new Texture("img/4.png"));
                choice1 = new TextButton("ORANGE", skin, "orange");
                choice1.addListener(correctHandler);
                //random colors
                choice2 = new TextButton("RED", skin, "orange");
                choice2.addListener(wrongHandler);
                choice3 = new TextButton("BLUE", skin, "orange");
                choice3.addListener(wrongHandler);
                choice4 = new TextButton("WHITE", skin, "orange");
                choice4.addListener(wrongHandler);
                break;
            case 5:
                query = new Image(new Texture("img/5.png"));
                choice1 = new TextButton("GREEN", skin, "violet");
                choice1.addListener(correctHandler);
                //random colors
                choice2 = new TextButton("BLUE", skin, "violet");
                choice2.addListener(wrongHandler);
                choice3 = new TextButton("YELLOW", skin, "violet");
                choice3.addListener(wrongHandler);
                choice4 = new TextButton("BROWN", skin, "violet");
                choice4.addListener(wrongHandler);
                break;

            case 6:
                query = new Image(new Texture("img/6.png"));
                choice1 = new TextButton("RED", skin, "red");
                choice1.addListener(correctHandler);
                //random colors
                choice2 = new TextButton("BLUE", skin, "red");
                choice2.addListener(wrongHandler);
                choice3 = new TextButton("VIOLET", skin, "red");
                choice3.addListener(wrongHandler);
                choice4 = new TextButton("PINK", skin, "red");
                choice4.addListener(wrongHandler);
                break;
            case 7:
                query = new Image(new Texture("img/7.png"));
                choice1 = new TextButton("VIOLET", skin, "orange");
                choice1.addListener(correctHandler);
                //random colors
                choice2 = new TextButton("BROWN", skin, "orange");
                choice2.addListener(wrongHandler);
                choice3 = new TextButton("GREEN", skin, "orange");
                choice3.addListener(wrongHandler);
                choice4 = new TextButton("ORANGE", skin, "orange");
                choice4.addListener(wrongHandler);
                break;
            case 8:
                query = new Image(new Texture("img/8.png"));
                choice1 = new TextButton("BROWN", skin, "yellow");
                choice1.addListener(correctHandler);
                //random colors
                choice2 = new TextButton("GREEN", skin, "yellow");
                choice2.addListener(wrongHandler);
                choice3 = new TextButton("VIOLET", skin, "yellow");
                choice3.addListener(wrongHandler);
                choice4 = new TextButton("BLUE", skin, "yellow");
                choice4.addListener(wrongHandler);
                break;
            case 9:
                query = new Image(new Texture("img/9.png"));
                choice1 = new TextButton("YELLOW", skin, "green");
                choice1.addListener(correctHandler);
                //random colors
                choice2 = new TextButton("RED", skin, "green");
                choice2.addListener(wrongHandler);
                choice3 = new TextButton("GREEN", skin, "green");
                choice3.addListener(wrongHandler);
                choice4 = new TextButton("ORANGE", skin, "green");
                choice4.addListener(wrongHandler);
                break;
            case 10:
                query = new Image(new Texture("img/10.png"));
                choice1 = new TextButton("BLUE", skin, "blue");
                choice1.addListener(correctHandler);
                //random colors
                choice2 = new TextButton("VIOLET", skin, "blue");
                choice2.addListener(wrongHandler);
                choice3 = new TextButton("WHITE", skin, "blue");
                choice3.addListener(wrongHandler);
                choice4 = new TextButton("GREEN", skin, "blue");
                choice4.addListener(wrongHandler);
                break;
            case 11:
                query = new Image(new Texture("img/11.png"));
                choice1 = new TextButton("WHITE", skin, "red");
                choice1.addListener(correctHandler);
                //random colors
                choice2 = new TextButton("RED", skin, "red");
                choice2.addListener(wrongHandler);
                choice3 = new TextButton("PINK", skin, "red");
                choice3.addListener(wrongHandler);
                choice4 = new TextButton("VIOLET", skin, "red");
                choice4.addListener(wrongHandler);
                break;
            case 12:
                query = new Image(new Texture("img/12.png"));
                choice1 = new TextButton("BLACK", skin, "orange");
                choice1.addListener(correctHandler);
                //random colors
                choice2 = new TextButton("GREEN", skin, "orange");
                choice2.addListener(wrongHandler);
                choice3 = new TextButton("WHITE", skin, "orange");
                choice3.addListener(wrongHandler);
                choice4 = new TextButton("BROWN", skin, "orange");
                choice4.addListener(wrongHandler);
                break;
            case 13:
                query = new Image(new Texture("img/13.png"));
                choice1 = new TextButton("ORANGE", skin, "yellow");
                choice1.addListener(correctHandler);
                //random colors
                choice2 = new TextButton("GREEN", skin, "yellow");
                choice2.addListener(wrongHandler);
                choice3 = new TextButton("YELLOW", skin, "yellow");
                choice3.addListener(wrongHandler);
                choice4 = new TextButton("RED", skin, "yellow");
                choice4.addListener(wrongHandler);
                break;
            case 14:
                query = new Image(new Texture("img/14.png"));
                choice1 = new TextButton("GREEN", skin, "green");
                choice1.addListener(correctHandler);
                //random colors
                choice2 = new TextButton("YELLOW", skin, "green");
                choice2.addListener(wrongHandler);
                choice3 = new TextButton("BLUE", skin, "green");
                choice3.addListener(wrongHandler);
                choice4 = new TextButton("WHITE", skin, "green");
                choice4.addListener(wrongHandler);
                break;
            case 15:
                query = new Image(new Texture("img/15.png"));
                choice1 = new TextButton("VIOLET", skin, "blue");
                choice1.addListener(correctHandler);
                //random colors
                choice2 = new TextButton("ORANGE", skin, "blue");
                choice2.addListener(wrongHandler);
                choice3 = new TextButton("PINK", skin, "blue");
                choice3.addListener(wrongHandler);
                choice4 = new TextButton("YELLOW", skin, "blue");
                choice4.addListener(wrongHandler);
                break;
            case 16:
                query = new Image(new Texture("img/16.png"));
                choice1 = new TextButton("RED", skin, "violet");
                choice1.addListener(correctHandler);
                //random colors
                choice2 = new TextButton("ORANGE", skin, "violet");
                choice2.addListener(wrongHandler);
                choice3 = new TextButton("YELLOW", skin, "violet");
                choice3.addListener(wrongHandler);
                choice4 = new TextButton("GREEN", skin, "violet");
                choice4.addListener(wrongHandler);
                break;
            case 17:
                query = new Image(new Texture("img/17.png"));
                choice1 = new TextButton("GREEN", skin, "red");
                choice1.addListener(correctHandler);
                //random colors
                choice2 = new TextButton("VIOLET", skin, "red");
                choice2.addListener(wrongHandler);
                choice3 = new TextButton("RED", skin, "red");
                choice3.addListener(wrongHandler);
                choice4 = new TextButton("BLUE", skin, "red");
                choice4.addListener(wrongHandler);
                break;
            case 18:
                query = new Image(new Texture("img/18.png"));
                choice1 = new TextButton("BROWN", skin, "orange");
                choice1.addListener(correctHandler);
                //random colors
                choice2 = new TextButton("YELLOW", skin, "orange");
                choice2.addListener(wrongHandler);
                choice3 = new TextButton("ORANGE", skin, "orange");
                choice3.addListener(wrongHandler);
                choice4 = new TextButton("GREEN", skin, "orange");
                choice4.addListener(wrongHandler);
                break;
            case 19:
                query = new Image(new Texture("img/19.png"));
                choice1 = new TextButton("YELLOW", skin, "yellow");
                choice1.addListener(correctHandler);
                //random colors
                choice2 = new TextButton("RED", skin, "yellow");
                choice2.addListener(wrongHandler);
                choice3 = new TextButton("BLUE", skin, "yellow");
                choice3.addListener(wrongHandler);
                choice4 = new TextButton("VIOLET", skin, "yellow");
                choice4.addListener(wrongHandler);
                break;
            case 20:
                query = new Image(new Texture("img/20.png"));
                choice1 = new TextButton("BLUE", skin, "green");
                choice1.addListener(correctHandler);
                //random colors
                choice2 = new TextButton("WHITE", skin, "green");
                choice2.addListener(wrongHandler);
                choice3 = new TextButton("YELLOW", skin, "green");
                choice3.addListener(wrongHandler);
                choice4 = new TextButton("GREEN", skin, "green");
                choice4.addListener(wrongHandler);
                break;


        }
    }

    private void correct(){
        //System.out.println(hud.progress);
        hud.setProgress(hud.getProgress()+1);
        if(hud.progress < 20){
            updateTable();
            System.out.println("correct");
            MyGdxGame.assets.get("audio/bell.wav", Sound.class).play();

        }
        else if (hud.progress == 20){
            MyGdxGame.assets.get("audio/result.mp3", Sound.class).play();
            hud.isFinished = true;
            hud.isWin = true;

        }
    }

    private void wrong(){

        hud.setHealth(hud.getHealth() - 1);
        if (hud.health == 0){
            MyGdxGame.assets.get("audio/fail.wav", Sound.class).play();
            hud.isFinished = true;
            hud.isWin = false;
            return;
        }


        System.out.println("wrong");
        MyGdxGame.assets.get("audio/pop.wav", Sound.class).play();
    }

    private void updateTable(){
        table.clear();

        questionNumber++;
        currentQuestion = questions[questionNumber];
        getQuestion(currentQuestion);

        btnOrder = SuperPlayScreen.RandomizeArray(0,3);
        setUpChoices(btnOrder);
    }

    public void setUpChoices(int[] btnOrder){
        int count = 1;
        choiceBtns = new TextButton[]{ choice1,choice2,choice3,choice4};
        table.top();
        table.add(query).colspan(2).center().width(Gdx.graphics.getWidth()-80).height(Gdx.graphics.getWidth()-80).padTop(40);
        table.row();
        for(int i: btnOrder){
            table.add(choiceBtns[i]).size((Gdx.graphics.getWidth() /2), Gdx.graphics.getHeight() / 10).pad(20).spaceBottom(10).padLeft(10);
            if(count % 2 == 0)
                table.row();
            count++;
        }
    }

    public static int[] RandomizeArray(int a, int b){
        Random rgen = new Random();  // Random number generator
        int size = b-a+1;
        int[] array = new int[size];

        for(int i=0; i< size; i++){
            array[i] = a+i;
        }

        for (int i=0; i<array.length; i++) {
            int randomPosition = rgen.nextInt(array.length);
            int temp = array[i];
            array[i] = array[randomPosition];
            array[randomPosition] = temp;
        }

        return array;
    }
}
