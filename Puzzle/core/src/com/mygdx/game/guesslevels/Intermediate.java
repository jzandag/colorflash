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
import com.mygdx.game.screens.GuessScreens;
import com.mygdx.game.screens.SuperPlayScreen;

public class Intermediate extends GuessScreens implements Screen {
    private static final int STAGE_LEVEL = 1;


    public Intermediate(MyGdxGame game){
        super(game);
        hud = new Hud(game.batch,STAGE_LEVEL);

        correctHandler = new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y) {
                event.getListenerActor().setVisible(false);
                correct();
            }
        };

        wrongHandler = new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y) {
                event.getListenerActor().setVisible(false);
                wrong();
            }
        };
    }

    @Override
    public void show() {
        super.show();
        getQuestion(2);
        setUpChoices(btnOrder);
    }

    private void getQuestion(int currentQuestion){
        System.out.println("current question:" + currentQuestion);
        switch(currentQuestion){
            case 1:
                /*System.out.println("7up");*/
                query = new Image(new Texture("img/logo2/7up.png"));
                choice1 = new TextButton(" ", skin, "green");
                choice1.addListener(correctHandler);
                choice2 = new TextButton(" ", skin, "red");
                choice2.addListener(correctHandler);
                //random colors
                choice3 = new TextButton(" ", skin, "yellow");
                choice3.addListener(wrongHandler);
                choice4 = new TextButton(" ", skin, "gold");
                choice4.addListener(wrongHandler);
                choice5 = new TextButton(" ", skin, "blue");
                choice5.addListener(wrongHandler);
                choice6 = new TextButton(" ", skin, "dblue");
                choice6.addListener(wrongHandler);
                choice7 = new TextButton(" ", skin, "pink");
                choice7.addListener(wrongHandler);
                choice8 = new TextButton(" ", skin, "violet");
                choice8.addListener(wrongHandler);
                break;
            case 2:
                /*System.out.println("Boston Pizza");*/
                query = new Image(new Texture("img/logo2/boston.png"));
                choice1 = new TextButton(" ", skin, "blue");
                choice1.addListener(correctHandler);
                choice2 = new TextButton(" ", skin, "red");
                choice2.addListener(correctHandler);
                //random colors
                choice3 = new TextButton(" ", skin, "brown");
                choice3.addListener(wrongHandler);
                choice4 = new TextButton(" ", skin, "yellow");
                choice4.addListener(wrongHandler);
                choice5 = new TextButton(" ", skin, "orange");
                choice5.addListener(wrongHandler);
                choice6 = new TextButton(" ", skin, "gold");
                choice6.addListener(wrongHandler);
                choice7 = new TextButton(" ", skin, "green");
                choice7.addListener(wrongHandler);
                choice8 = new TextButton(" ", skin, "violet");
                choice8.addListener(wrongHandler);
                break;
            case 3:
                /*System.out.println("Cupachups");*/
                query = new Image(new Texture("img/logo2/cc.png"));
                choice1 = new TextButton(" ", skin, "yellow");
                choice1.addListener(correctHandler);
                //random colors
                choice2 = new TextButton(" ", skin, "red");
                choice2.addListener(correctHandler);
                choice3 = new TextButton(" ", skin, "pink");
                choice3.addListener(wrongHandler);
                choice4 = new TextButton(" ", skin, "blue");
                choice4.addListener(wrongHandler);
                choice5 = new TextButton(" ", skin, "orange");
                choice5.addListener(wrongHandler);
                choice6 = new TextButton(" ", skin, "lightgreen");
                choice6.addListener(wrongHandler);
                choice7 = new TextButton(" ", skin, "green");
                choice7.addListener(wrongHandler);
                choice8 = new TextButton(" ", skin, "violet");
                choice8.addListener(wrongHandler);
                break;
            case 4:
                /*System.out.println("Cisco");*/
                query = new Image(new Texture("img/logo2/cisco.png"));
                choice1 = new TextButton(" ", skin, "red");
                choice1.addListener(correctHandler);
                //random colors
                choice2 = new TextButton(" ", skin, "dblue");
                choice2.addListener(correctHandler);
                choice3 = new TextButton(" ", skin, "blue");
                choice3.addListener(wrongHandler);
                choice4 = new TextButton(" ", skin, "yellow");
                choice4.addListener(wrongHandler);
                choice5 = new TextButton(" ", skin, "orange");
                choice5.addListener(wrongHandler);
                choice6 = new TextButton(" ", skin, "green");
                choice6.addListener(wrongHandler);
                choice7 = new TextButton(" ", skin, "gold");
                choice7.addListener(wrongHandler);
                choice8 = new TextButton(" ", skin, "brown");
                choice8.addListener(wrongHandler);
                break;
            case 5:
                /*System.out.println("domino");*/
                query = new Image(new Texture("img/logo2/domino.png"));
                choice1 = new TextButton(" ", skin, "blue");
                choice1.addListener(correctHandler);
                //random colors
                choice2 = new TextButton(" ", skin, "red");
                choice2.addListener(correctHandler);
                choice3 = new TextButton(" ", skin, "brown");
                choice3.addListener(wrongHandler);
                choice4 = new TextButton(" ", skin, "yellow");
                choice4.addListener(wrongHandler);
                choice5 = new TextButton(" ", skin, "orange");
                choice5.addListener(wrongHandler);
                choice6 = new TextButton(" ", skin, "lightgreen");
                choice6.addListener(wrongHandler);
                choice7 = new TextButton(" ", skin, "green");
                choice7.addListener(wrongHandler);
                choice8 = new TextButton(" ", skin, "gold");
                choice8.addListener(wrongHandler);
                break;
            case 6:
                /*System.out.println("dove");*/
                query = new Image(new Texture("img/logo2/dove.png"));
                choice1 = new TextButton(" ", skin, "blue");
                choice1.addListener(correctHandler);
                //random colors
                choice2 = new TextButton(" ", skin, "gold");
                choice2.addListener(correctHandler);
                choice3 = new TextButton(" ", skin, "brown");
                choice3.addListener(wrongHandler);
                choice4 = new TextButton(" ", skin, "gray");
                choice4.addListener(wrongHandler);
                choice5 = new TextButton(" ", skin, "lilac");
                choice5.addListener(wrongHandler);
                choice6 = new TextButton(" ", skin, "green");
                choice6.addListener(wrongHandler);
                choice7 = new TextButton(" ", skin, "pink");
                choice7.addListener(wrongHandler);
                choice8 = new TextButton(" ", skin, "violet");
                choice8.addListener(wrongHandler);
                break;
            case 7:
                /*System.out.println("FedEx");*/
                query = new Image(new Texture("img/logo2/fed.png"));
                choice1 = new TextButton(" ", skin, "violet");
                choice1.addListener(correctHandler);
                //random colors
                choice2 = new TextButton(" ", skin, "orange");
                choice2.addListener(correctHandler);
                choice3 = new TextButton(" ", skin, "brown");
                choice3.addListener(wrongHandler);
                choice4 = new TextButton(" ", skin, "lilac");
                choice4.addListener(wrongHandler);
                choice5 = new TextButton(" ", skin, "red");
                choice5.addListener(wrongHandler);
                choice6 = new TextButton(" ", skin, "green");
                choice6.addListener(wrongHandler);
                choice7 = new TextButton(" ", skin, "gray");
                choice7.addListener(wrongHandler);
                choice8 = new TextButton(" ", skin, "blue");
                choice8.addListener(wrongHandler);
                break;
            case 8:
                /*System.out.println("Firefox");*/
                query = new Image(new Texture("img/logo2/firefox.png"));
                choice1 = new TextButton(" ", skin, "blue");
                choice1.addListener(correctHandler);
                //random colors
                choice2 = new TextButton(" ", skin, "orange");
                choice2.addListener(correctHandler);
                choice3 = new TextButton(" ", skin, "brown");
                choice3.addListener(wrongHandler);
                choice4 = new TextButton(" ", skin, "gray");
                choice4.addListener(wrongHandler);
                choice5 = new TextButton(" ", skin, "red");
                choice5.addListener(wrongHandler);
                choice6 = new TextButton(" ", skin, "lightgreen");
                choice6.addListener(wrongHandler);
                choice7 = new TextButton(" ", skin, "green");
                choice7.addListener(wrongHandler);
                choice8 = new TextButton(" ", skin, "brown");
                choice8.addListener(wrongHandler);
                break;
            case 9:
                /*System.out.println("flickr");*/
                query = new Image(new Texture("img/logo2/flickr.png"));
                choice1 = new TextButton(" ", skin, "blue");
                choice1.addListener(correctHandler);
                //random colors
                choice2 = new TextButton(" ", skin, "pink");
                choice2.addListener(correctHandler);
                choice3 = new TextButton(" ", skin, "brown");
                choice3.addListener(wrongHandler);
                choice4 = new TextButton(" ", skin, "yellow");
                choice4.addListener(wrongHandler);
                choice5 = new TextButton(" ", skin, "red");
                choice5.addListener(wrongHandler);
                choice6 = new TextButton(" ", skin, "gold");
                choice6.addListener(wrongHandler);
                choice7 = new TextButton(" ", skin, "green");
                choice7.addListener(wrongHandler);
                choice8 = new TextButton(" ", skin, "violet");
                choice8.addListener(wrongHandler);
                break;
            case 10:
                /*System.out.println("Gsw");*/
                query = new Image(new Texture("img/logo2/gsw.png"));
                choice1 = new TextButton(" ", skin, "blue");
                choice1.addListener(correctHandler);
                //random colors
                choice2 = new TextButton(" ", skin, "yellow");
                choice2.addListener(correctHandler);
                choice3 = new TextButton(" ", skin, "dblue");
                choice3.addListener(wrongHandler);
                choice4 = new TextButton(" ", skin, "pink");
                choice4.addListener(wrongHandler);
                choice5 = new TextButton(" ", skin, "orange");
                choice5.addListener(wrongHandler);
                choice6 = new TextButton(" ", skin, "lilac");
                choice6.addListener(wrongHandler);
                choice7 = new TextButton(" ", skin, "green");
                choice7.addListener(wrongHandler);
                choice8 = new TextButton(" ", skin, "red");
                choice8.addListener(wrongHandler);
                break;
            case 11:
                /*System.out.println("heineken");*/
                query = new Image(new Texture("img/logo2/heineken.png"));
                choice1 = new TextButton(" ", skin, "green");
                choice1.addListener(correctHandler);
                //random colors
                choice2 = new TextButton(" ", skin, "red");
                choice2.addListener(correctHandler);
                choice3 = new TextButton(" ", skin, "lilac");
                choice3.addListener(wrongHandler);
                choice4 = new TextButton(" ", skin, "yellow");
                choice4.addListener(wrongHandler);
                choice5 = new TextButton(" ", skin, "orange");
                choice5.addListener(wrongHandler);
                choice6 = new TextButton(" ", skin, "pink");
                choice6.addListener(wrongHandler);
                choice7 = new TextButton(" ", skin, "lightgreen");
                choice7.addListener(wrongHandler);
                choice8 = new TextButton(" ", skin, "violet");
                choice8.addListener(wrongHandler);
                break;
            case 12:
                /*System.out.println("Hotwheels");*/
                query = new Image(new Texture("img/logo2/hw.png"));
                choice1 = new TextButton(" ", skin, "yellow");
                choice1.addListener(correctHandler);
                //random colors
                choice2 = new TextButton(" ", skin, "red");
                choice2.addListener(correctHandler);
                choice3 = new TextButton(" ", skin, "orange");
                choice3.addListener(wrongHandler);
                choice4 = new TextButton(" ", skin, "brown");
                choice4.addListener(wrongHandler);
                choice5 = new TextButton(" ", skin, "blue");
                choice5.addListener(wrongHandler);
                choice6 = new TextButton(" ", skin, "green");
                choice6.addListener(wrongHandler);
                choice7 = new TextButton(" ", skin, "gray");
                choice7.addListener(wrongHandler);
                choice8 = new TextButton(" ", skin, "violet");
                choice8.addListener(wrongHandler);
                break;
            case 13:
                /*System.out.println("kraft");*/
                query = new Image(new Texture("img/logo2/kraft.png"));
                choice1 = new TextButton(" ", skin, "blue");
                choice1.addListener(correctHandler);
                //random colors
                choice2 = new TextButton(" ", skin, "red");
                choice2.addListener(correctHandler);
                choice3 = new TextButton(" ", skin, "brown");
                choice3.addListener(wrongHandler);
                choice4 = new TextButton(" ", skin, "yellow");
                choice4.addListener(wrongHandler);
                choice5 = new TextButton(" ", skin, "orange");
                choice5.addListener(wrongHandler);
                choice6 = new TextButton(" ", skin, "gold");
                choice6.addListener(wrongHandler);
                choice7 = new TextButton(" ", skin, "green");
                choice7.addListener(wrongHandler);
                choice8 = new TextButton(" ", skin, "brown");
                choice8.addListener(wrongHandler);
                break;
            case 14:
                /*System.out.println("L.A. Lakers");*/
                query = new Image(new Texture("img/logo2/lakers.png"));
                choice1 = new TextButton(" ", skin, "violet");
                choice1.addListener(correctHandler);
                //random colors
                choice2 = new TextButton(" ", skin, "orange");
                choice2.addListener(correctHandler);
                choice3 = new TextButton(" ", skin, "brown");
                choice3.addListener(wrongHandler);
                choice4 = new TextButton(" ", skin, "gray");
                choice4.addListener(wrongHandler);
                choice5 = new TextButton(" ", skin, "red");
                choice5.addListener(wrongHandler);
                choice6 = new TextButton(" ", skin, "dblue");
                choice6.addListener(wrongHandler);
                choice7 = new TextButton(" ", skin, "green");
                choice7.addListener(wrongHandler);
                choice8 = new TextButton(" ", skin, "blue");
                choice8.addListener(wrongHandler);
                break;
            case 15:
                /*System.out.println("Mars");*/
                query = new Image(new Texture("img/logo2/mars.png"));
                choice1 = new TextButton(" ", skin, "red");
                choice1.addListener(correctHandler);
                //random colors
                choice2 = new TextButton(" ", skin, "gold");
                choice2.addListener(correctHandler);
                choice3 = new TextButton(" ", skin, "blue");
                choice3.addListener(wrongHandler);
                choice4 = new TextButton(" ", skin, "lilac");
                choice4.addListener(wrongHandler);
                choice5 = new TextButton(" ", skin, "pink");
                choice5.addListener(wrongHandler);
                choice6 = new TextButton(" ", skin, "gray");
                choice6.addListener(wrongHandler);
                choice7 = new TextButton(" ", skin, "green");
                choice7.addListener(wrongHandler);
                choice8 = new TextButton(" ", skin, "violet");
                choice8.addListener(wrongHandler);
                break;
            case 16:
                /*System.out.println("Mastercard");*/
                query = new Image(new Texture("img/logo2/mastercard.png"));
                choice1 = new TextButton(" ", skin, "red");
                choice1.addListener(correctHandler);
                //random colors
                choice2 = new TextButton(" ", skin, "orange");
                choice2.addListener(correctHandler);
                choice3 = new TextButton(" ", skin, "blue");
                choice3.addListener(wrongHandler);
                choice4 = new TextButton(" ", skin, "lilac");
                choice4.addListener(wrongHandler);
                choice5 = new TextButton(" ", skin, "pink");
                choice5.addListener(wrongHandler);
                choice6 = new TextButton(" ", skin, "lightgreen");
                choice6.addListener(wrongHandler);
                choice7 = new TextButton(" ", skin, "green");
                choice7.addListener(wrongHandler);
                choice8 = new TextButton(" ", skin, "violet");
                choice8.addListener(wrongHandler);
                break;
            case 17:
                /*System.out.println("Mountaindew");*/
                query = new Image(new Texture("img/logo2/mdew.png"));
                choice1 = new TextButton(" ", skin, "red");
                choice1.addListener(correctHandler);
                //random colors
                choice2 = new TextButton(" ", skin, "green");
                choice2.addListener(correctHandler);
                choice3 = new TextButton(" ", skin, "brown");
                choice3.addListener(wrongHandler);
                choice4 = new TextButton(" ", skin, "yellow");
                choice4.addListener(wrongHandler);
                choice5 = new TextButton(" ", skin, "orange");
                choice5.addListener(wrongHandler);
                choice6 = new TextButton(" ", skin, "gray");
                choice6.addListener(wrongHandler);
                choice7 = new TextButton(" ", skin, "pink");
                choice7.addListener(wrongHandler);
                choice8 = new TextButton(" ", skin, "violet");
                choice8.addListener(wrongHandler);
                break;
            case 18:
                /*System.out.println("Miami");*/
                query = new Image(new Texture("img/logo2/miami.png"));
                choice1 = new TextButton(" ", skin, "red");
                choice1.addListener(correctHandler);
                //random colors
                choice2 = new TextButton(" ", skin, "orange");
                choice2.addListener(correctHandler);
                choice3 = new TextButton(" ", skin, "blue");
                choice3.addListener(wrongHandler);
                choice4 = new TextButton(" ", skin, "skyblue");
                choice4.addListener(wrongHandler);
                choice5 = new TextButton(" ", skin, "pink");
                choice5.addListener(wrongHandler);
                choice6 = new TextButton(" ", skin, "dblue");
                choice6.addListener(wrongHandler);
                choice7 = new TextButton(" ", skin, "green");
                choice7.addListener(wrongHandler);
                choice8 = new TextButton(" ", skin, "violet");
                choice8.addListener(wrongHandler);
                break;
            case 19:
                /*System.out.println("omegle");*/
                query = new Image(new Texture("img/logo2/omeg.png"));
                choice1 = new TextButton(" ", skin, "blue");
                choice1.addListener(correctHandler);
                //random colors
                choice2 = new TextButton(" ", skin, "orange");
                choice2.addListener(correctHandler);
                choice3 = new TextButton(" ", skin, "red");
                choice3.addListener(wrongHandler);
                choice4 = new TextButton(" ", skin, "brown");
                choice4.addListener(wrongHandler);
                choice5 = new TextButton(" ", skin, "pink");
                choice5.addListener(wrongHandler);
                choice6 = new TextButton(" ", skin, "lightgreen");
                choice6.addListener(wrongHandler);
                choice7 = new TextButton(" ", skin, "green");
                choice7.addListener(wrongHandler);
                choice8 = new TextButton(" ", skin, "violet");
                choice8.addListener(wrongHandler);
                break;
            case 20:
                /*System.out.println("pepsi");*/
                query = new Image(new Texture("img/logo2/pepsi.png"));
                choice1 = new TextButton(" ", skin, "blue");
                choice1.addListener(correctHandler);
                //random colors
                choice2 = new TextButton(" ", skin, "red");
                choice2.addListener(correctHandler);
                choice3 = new TextButton(" ", skin, "gold");
                choice3.addListener(wrongHandler);
                choice4 = new TextButton(" ", skin, "yellow");
                choice4.addListener(wrongHandler);
                choice5 = new TextButton(" ", skin, "orange");
                choice5.addListener(wrongHandler);
                choice6 = new TextButton(" ", skin, "brown");
                choice6.addListener(wrongHandler);
                choice7 = new TextButton(" ", skin, "green");
                choice7.addListener(wrongHandler);
                choice8 = new TextButton(" ", skin, "pink");
                choice8.addListener(wrongHandler);
                break;
            case 21:
                /*System.out.println("shell");*/
                query = new Image(new Texture("img/logo2/shell.png"));
                choice1 = new TextButton(" ", skin, "red");
                choice1.addListener(correctHandler);
                //random colors
                choice2 = new TextButton(" ", skin, "yellow");
                choice2.addListener(correctHandler);
                choice3 = new TextButton(" ", skin, "brown");
                choice3.addListener(wrongHandler);
                choice4 = new TextButton(" ", skin, "green");
                choice4.addListener(wrongHandler);
                choice5 = new TextButton(" ", skin, "pink");
                choice5.addListener(wrongHandler);
                choice6 = new TextButton(" ", skin, "blue");
                choice6.addListener(wrongHandler);
                choice7 = new TextButton(" ", skin, "lilac");
                choice7.addListener(wrongHandler);
                choice8 = new TextButton(" ", skin, "violet");
                choice8.addListener(wrongHandler);
                break;
            case 22:
                /*System.out.println("Sprite");*/
                query = new Image(new Texture("img/logo2/sprite.png"));
                choice1 = new TextButton(" ", skin, "green");
                choice1.addListener(correctHandler);
                //random colors
                choice2 = new TextButton(" ", skin, "yellow");
                choice2.addListener(correctHandler);
                choice3 = new TextButton(" ", skin, "blue");
                choice3.addListener(wrongHandler);
                choice4 = new TextButton(" ", skin, "red");
                choice4.addListener(wrongHandler);
                choice5 = new TextButton(" ", skin, "lilac");
                choice5.addListener(wrongHandler);
                choice6 = new TextButton(" ", skin, "pink");
                choice6.addListener(wrongHandler);
                choice7 = new TextButton(" ", skin, "brown");
                choice7.addListener(wrongHandler);
                choice8 = new TextButton(" ", skin, "violet");
                choice8.addListener(wrongHandler);
                break;
            case 23:
                /*System.out.println("Superman");*/
                query = new Image(new Texture("img/logo2/superman.png"));
                choice1 = new TextButton(" ", skin, "red");
                choice1.addListener(correctHandler);
                //random colors
                choice2 = new TextButton(" ", skin, "yellow");
                choice2.addListener(correctHandler);
                choice3 = new TextButton(" ", skin, "blue");
                choice3.addListener(wrongHandler);
                choice4 = new TextButton(" ", skin, "lilac");
                choice4.addListener(wrongHandler);
                choice5 = new TextButton(" ", skin, "dblue");
                choice5.addListener(wrongHandler);
                choice6 = new TextButton(" ", skin, "lightgreen");
                choice6.addListener(wrongHandler);
                choice7 = new TextButton(" ", skin, "green");
                choice7.addListener(wrongHandler);
                choice8 = new TextButton(" ", skin, "violet");
                choice8.addListener(wrongHandler);
                break;
            case 24:
                /*System.out.println("Toblerone");*/
                query = new Image(new Texture("img/logo2/tob.png"));
                choice1 = new TextButton(" ", skin, "red");
                choice1.addListener(correctHandler);
                //random colors
                choice2 = new TextButton(" ", skin, "gold");
                choice2.addListener(correctHandler);
                choice3 = new TextButton(" ", skin, "red");
                choice3.addListener(wrongHandler);
                choice4 = new TextButton(" ", skin, "gray");
                choice4.addListener(wrongHandler);
                choice5 = new TextButton(" ", skin, "brown");
                choice5.addListener(wrongHandler);
                choice6 = new TextButton(" ", skin, "dblue");
                choice6.addListener(wrongHandler);
                choice7 = new TextButton(" ", skin, "green");
                choice7.addListener(wrongHandler);
                choice8 = new TextButton(" ", skin, "violet");
                choice8.addListener(wrongHandler);
                break;
            case 25:
                /*System.out.println("Toyota");*/
                query = new Image(new Texture("img/logo2/toyota.png"));
                choice1 = new TextButton(" ", skin, "red");
                choice1.addListener(correctHandler);
                //random colors
                choice2 = new TextButton(" ", skin, "gray");
                choice2.addListener(correctHandler);
                choice3 = new TextButton(" ", skin, "brown");
                choice3.addListener(wrongHandler);
                choice4 = new TextButton(" ", skin, "yellow");
                choice4.addListener(wrongHandler);
                choice5 = new TextButton(" ", skin, "gold");
                choice5.addListener(wrongHandler);
                choice6 = new TextButton(" ", skin, "green");
                choice6.addListener(wrongHandler);
                choice7 = new TextButton(" ", skin, "skyblue");
                choice7.addListener(wrongHandler);
                choice8 = new TextButton(" ", skin, "violet");
                choice8.addListener(wrongHandler);
                break;
            case 26:
                /*System.out.println("Ups");*/
                query = new Image(new Texture("img/logo2/Ups.png"));
                choice1 = new TextButton(" ", skin, "brown");
                choice1.addListener(correctHandler);
                //random colors
                choice2 = new TextButton(" ", skin, "yellow");
                choice2.addListener(correctHandler);
                choice3 = new TextButton(" ", skin, "blue");
                choice3.addListener(wrongHandler);
                choice4 = new TextButton(" ", skin, "red");
                choice4.addListener(wrongHandler);
                choice5 = new TextButton(" ", skin, "orange");
                choice5.addListener(wrongHandler);
                choice6 = new TextButton(" ", skin, "lilac");
                choice6.addListener(wrongHandler);
                choice7 = new TextButton(" ", skin, "green");
                choice7.addListener(wrongHandler);
                choice8 = new TextButton(" ", skin, "violet");
                choice8.addListener(wrongHandler);
                break;
            case 27:
                /*System.out.println("Walmart");*/
                query = new Image(new Texture("img/logo2/Walmart.png"));
                choice1 = new TextButton(" ", skin, "blue");
                choice1.addListener(correctHandler);
                //random colors
                choice2 = new TextButton(" ", skin, "yellow");
                choice2.addListener(correctHandler);
                choice3 = new TextButton(" ", skin, "red");
                choice3.addListener(wrongHandler);
                choice4 = new TextButton(" ", skin, "brown");
                choice4.addListener(wrongHandler);
                choice5 = new TextButton(" ", skin, "pink");
                choice5.addListener(wrongHandler);
                choice6 = new TextButton(" ", skin, "lightgreen");
                choice6.addListener(wrongHandler);
                choice7 = new TextButton(" ", skin, "green");
                choice7.addListener(wrongHandler);
                choice8 = new TextButton(" ", skin, "violet");
                choice8.addListener(wrongHandler);
                break;
            case 28:
                /*System.out.println("Audi");*/
                query = new Image(new Texture("img/logo2/audi.png"));
                choice1 = new TextButton(" ", skin, "red");
                choice1.addListener(correctHandler);
                //random colors
                choice2 = new TextButton(" ", skin, "gray");
                choice2.addListener(correctHandler);
                choice3 = new TextButton(" ", skin, "blue");
                choice3.addListener(wrongHandler);
                choice4 = new TextButton(" ", skin, "gold");
                choice4.addListener(wrongHandler);
                choice5 = new TextButton(" ", skin, "orange");
                choice5.addListener(wrongHandler);
                choice6 = new TextButton(" ", skin, "lightgreen");
                choice6.addListener(wrongHandler);
                choice7 = new TextButton(" ", skin, "green");
                choice7.addListener(wrongHandler);
                choice8 = new TextButton(" ", skin, "violet");
                choice8.addListener(wrongHandler);
                break;
            case 29:
                /*System.out.println("Android Studio");*/
                query = new Image(new Texture("img/logo2/ands.png"));
                choice1 = new TextButton(" ", skin, "lightgreen");
                choice1.addListener(correctHandler);
                //random colors
                choice2 = new TextButton(" ", skin, "gray");
                choice2.addListener(correctHandler);
                choice3 = new TextButton(" ", skin, "blue");
                choice3.addListener(wrongHandler);
                choice4 = new TextButton(" ", skin, "yellow");
                choice4.addListener(wrongHandler);
                choice5 = new TextButton(" ", skin, "orange");
                choice5.addListener(wrongHandler);
                choice6 = new TextButton(" ", skin, "red");
                choice6.addListener(wrongHandler);
                choice7 = new TextButton(" ", skin, "brown");
                choice7.addListener(wrongHandler);
                choice8 = new TextButton(" ", skin, "pink");
                choice8.addListener(wrongHandler);
                break;
            case 30:
                /*System.out.println("Photoshop");*/
                query = new Image(new Texture("img/logo2/ps.png"));
                choice1 = new TextButton(" ", skin, "skyblue");
                choice1.addListener(correctHandler);
                //random colors
                choice2 = new TextButton(" ", skin, "dblue");
                choice2.addListener(correctHandler);
                choice3 = new TextButton(" ", skin, "lilac");
                choice3.addListener(wrongHandler);
                choice4 = new TextButton(" ", skin, "yellow");
                choice4.addListener(wrongHandler);
                choice5 = new TextButton(" ", skin, "gold");
                choice5.addListener(wrongHandler);
                choice6 = new TextButton(" ", skin, "green");
                choice6.addListener(wrongHandler);
                choice7 = new TextButton(" ", skin, "red");
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



    @Override
    public void render(float delta) {
        super.render(delta);

        if(hud.isTimeUp())
            hud.isFinished = true;
        if(hud.isFinished){
            hud.timerStop = true;
//            if(!hud.isWin)
//
            if(!hud.isWin && hud.health >0 && hud.tune) {
                MyGdxGame.assets.get("audio/fail.wav", Sound.class).play();
                hud.tune=false;
            }
            levelClear = new LevelClearGuess(game,this, STAGE_LEVEL, hud.isWin);
            //Gdx.input.setInputProcessor();
            stage.addActor(levelClear.window);
            stage.act();
            stage.draw();


        }
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

    private void correct(){
        health++;
        MyGdxGame.assets.get("audio/bell.wav", Sound.class).play();

        if(health == 2){
            if(hud.progress < 20 ){
                updateTable();
                hud.setProgress(hud.getProgress()+1);
                //System.out.println("correct");
                health = 0;
            }
            else if (hud.progress == 20){
                MyGdxGame.assets.get("audio/result.mp3", Sound.class).play();
                hud.isFinished = true;
                hud.isWin = true;

            }
        }else{

        }

    }

    private void updateTable(){
        table.clear();

        questionNumber++;
        currentQuestion = questions[questionNumber];
        getQuestion(currentQuestion);

        btnOrder = SuperPlayScreen.RandomizeArray(0,7);
        setUpChoices(btnOrder);
    }

    private void wrong(){

        hud.setHealth(hud.getHealth() - 1);
        if (hud.health == 0){
            MyGdxGame.assets.get("audio/fail.wav", Sound.class).play();
            hud.isFinished = true;
            hud.isWin = false;
            return;
        }


        //System.out.println("wrong");
        MyGdxGame.assets.get("audio/pop.wav", Sound.class).play();
    }

    public void setUpButton(Buttons butt){
        switch (butt){
            case BLUE: //1
                choice1 = new TextButton(" ", skin, "brown");
                choice1.addListener(correctHandler);
                //random colors
                choice2 = new TextButton(" ", skin, "pink");
                choice2.addListener(wrongHandler);
                choice3 = new TextButton(" ", skin, "lightblue");
                choice3.addListener(wrongHandler);
                choice4 = new TextButton(" ", skin, "yellow");
                choice4.addListener(wrongHandler);
                choice5 = new TextButton(" ", skin, "red");
                choice5.addListener(wrongHandler);
                choice6 = new TextButton(" ", skin, "orange");
                choice6.addListener(wrongHandler);
                choice7 = new TextButton(" ", skin, "green");
                choice7.addListener(wrongHandler);
                choice8 = new TextButton(" ", skin, "violet");
                choice8.addListener(wrongHandler);
                break;
            case RED:

            case BROWN:

            case GREEN:

            case ORANGE:

            case VIOLET:

            case YELLOW:

            case LIGHTBLUE:
        }
    }
}
