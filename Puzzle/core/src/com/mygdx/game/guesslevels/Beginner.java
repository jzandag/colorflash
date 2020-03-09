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

public class Beginner extends GuessScreens implements Screen {
    private static final int STAGE_LEVEL = 0;


    public Beginner(MyGdxGame game){
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
                /*System.out.println("amazon");*/
                query = new Image(new Texture("img/logo1/amazon.png"));
                choice1 = new TextButton(" ", skin, "orange");
                choice1.addListener(correctHandler);
                //random colors
                choice2 = new TextButton(" ", skin, "skyblue");
                choice2.addListener(wrongHandler);
                choice3 = new TextButton(" ", skin, "red");
                choice3.addListener(wrongHandler);
                choice4 = new TextButton(" ", skin, "yellow");
                choice4.addListener(wrongHandler);
                choice5 = new TextButton(" ", skin, "gray");
                choice5.addListener(wrongHandler);
                choice6 = new TextButton(" ", skin, "gold");
                choice6.addListener(wrongHandler);
                choice7 = new TextButton(" ", skin, "lightgreen");
                choice7.addListener(wrongHandler);
                choice8 = new TextButton(" ", skin, "violet");
                choice8.addListener(wrongHandler);
                break;
            case 2:
                /*System.out.println("at");*/
                query = new Image(new Texture("img/logo1/at.png"));
                choice1 = new TextButton(" ", skin, "blue");
                choice1.addListener(correctHandler);
                //random colors
                choice2 = new TextButton(" ", skin, "orange");
                choice2.addListener(wrongHandler);
                choice3 = new TextButton(" ", skin, "red");
                choice3.addListener(wrongHandler);
                choice4 = new TextButton(" ", skin, "yellow");
                choice4.addListener(wrongHandler);
                choice5 = new TextButton(" ", skin, "orange");
                choice5.addListener(wrongHandler);
                choice6 = new TextButton(" ", skin, "lilac");
                choice6.addListener(wrongHandler);
                choice7 = new TextButton(" ", skin, "dblue");
                choice7.addListener(wrongHandler);
                choice8 = new TextButton(" ", skin, "brown");
                choice8.addListener(wrongHandler);
                break;
            case 3:
                /*System.out.println("bat");*/
                query = new Image(new Texture("img/logo1/bat.png"));
                choice1 = new TextButton(" ", skin, "yellow");
                choice1.addListener(correctHandler);
                //random colors
                choice2 = new TextButton(" ", skin, "gold");
                choice2.addListener(wrongHandler);
                choice3 = new TextButton(" ", skin, "red");
                choice3.addListener(wrongHandler);
                choice4 = new TextButton(" ", skin, "dblue");
                choice4.addListener(wrongHandler);
                choice5 = new TextButton(" ", skin, "orange");
                choice5.addListener(wrongHandler);
                choice6 = new TextButton(" ", skin, "green");
                choice6.addListener(wrongHandler);
                choice7 = new TextButton(" ", skin, "lightblue");
                choice7.addListener(wrongHandler);
                choice8 = new TextButton(" ", skin, "violet");
                choice8.addListener(wrongHandler);
                break;
            case 4:
                /*System.out.println("bench");*/
                query = new Image(new Texture("img/logo1/bench.png"));
                choice1 = new TextButton(" ", skin, "red");
                choice1.addListener(correctHandler);
                //random colors
                choice2 = new TextButton(" ", skin, "orange");
                choice2.addListener(wrongHandler);
                choice3 = new TextButton(" ", skin, "blue");
                choice3.addListener(wrongHandler);
                choice4 = new TextButton(" ", skin, "yellow");
                choice4.addListener(wrongHandler);
                choice5 = new TextButton(" ", skin, "orange");
                choice5.addListener(wrongHandler);
                choice6 = new TextButton(" ", skin, "dblue");
                choice6.addListener(wrongHandler);
                choice7 = new TextButton(" ", skin, "green");
                choice7.addListener(wrongHandler);
                choice8 = new TextButton(" ", skin, "pink");
                choice8.addListener(wrongHandler);
                break;
            case 5:
                /*System.out.println("bmw");*/
                query = new Image(new Texture("img/logo1/bmw.png"));
                choice1 = new TextButton(" ", skin, "blue");
                choice1.addListener(correctHandler);
                //random colors
                choice2 = new TextButton(" ", skin, "orange");
                choice2.addListener(wrongHandler);
                choice3 = new TextButton(" ", skin, "pink");
                choice3.addListener(wrongHandler);
                choice4 = new TextButton(" ", skin, "yellow");
                choice4.addListener(wrongHandler);
                choice5 = new TextButton(" ", skin, "orange");
                choice5.addListener(wrongHandler);
                choice6 = new TextButton(" ", skin, "brown");
                choice6.addListener(wrongHandler);
                choice7 = new TextButton(" ", skin, "green");
                choice7.addListener(wrongHandler);
                choice8 = new TextButton(" ", skin, "violet");
                choice8.addListener(wrongHandler);
                break;
            case 6:
                /*System.out.println("bonchon");*/
                query = new Image(new Texture("img/logo1/bonchon.png"));
                choice1 = new TextButton(" ", skin, "red");
                choice1.addListener(correctHandler);
                //random colors
                choice2 = new TextButton(" ", skin, "orange");
                choice2.addListener(wrongHandler);
                choice3 = new TextButton(" ", skin, "blue");
                choice3.addListener(wrongHandler);
                choice4 = new TextButton(" ", skin, "yellow");
                choice4.addListener(wrongHandler);
                choice5 = new TextButton(" ", skin, "dblue");
                choice5.addListener(wrongHandler);
                choice6 = new TextButton(" ", skin, "green");
                choice6.addListener(wrongHandler);
                choice7 = new TextButton(" ", skin, "skyblue");
                choice7.addListener(wrongHandler);
                choice8 = new TextButton(" ", skin, "violet");
                choice8.addListener(wrongHandler);
                break;
            case 7:
                /*System.out.println("chevrolet");*/
                query = new Image(new Texture("img/logo1/chev.png"));
                choice1 = new TextButton(" ", skin, "gold");
                choice1.addListener(correctHandler);
                //random colors
                choice2 = new TextButton(" ", skin, "orange");
                choice2.addListener(wrongHandler);
                choice3 = new TextButton(" ", skin, "red");
                choice3.addListener(wrongHandler);
                choice4 = new TextButton(" ", skin, "blue");
                choice4.addListener(wrongHandler);
                choice5 = new TextButton(" ", skin, "yellow");
                choice5.addListener(wrongHandler);
                choice6 = new TextButton(" ", skin, "pink");
                choice6.addListener(wrongHandler);
                choice7 = new TextButton(" ", skin, "lightgreen");
                choice7.addListener(wrongHandler);
                choice8 = new TextButton(" ", skin, "violet");
                choice8.addListener(wrongHandler);
                break;
            case 8:
                /*System.out.println("Coca-Cola");*/
                query = new Image(new Texture("img/logo1/coke.png"));
                choice1 = new TextButton(" ", skin, "red");
                choice1.addListener(correctHandler);
                //random colors
                choice2 = new TextButton(" ", skin, "orange");
                choice2.addListener(wrongHandler);
                choice3 = new TextButton(" ", skin, "dblue");
                choice3.addListener(wrongHandler);
                choice4 = new TextButton(" ", skin, "yellow");
                choice4.addListener(wrongHandler);
                choice5 = new TextButton(" ", skin, "lightgreen");
                choice5.addListener(wrongHandler);
                choice6 = new TextButton(" ", skin, "brown");
                choice6.addListener(wrongHandler);
                choice7 = new TextButton(" ", skin, "green");
                choice7.addListener(wrongHandler);
                choice8 = new TextButton(" ", skin, "violet");
                choice8.addListener(wrongHandler);
                break;
            case 9:
                /*System.out.println("colgate");*/
                query = new Image(new Texture("img/logo1/colgate.png"));
                choice1 = new TextButton(" ", skin, "red");
                choice1.addListener(correctHandler);
                //random colors
                choice2 = new TextButton(" ", skin, "orange");
                choice2.addListener(wrongHandler);
                choice3 = new TextButton(" ", skin, "blue");
                choice3.addListener(wrongHandler);
                choice4 = new TextButton(" ", skin, "yellow");
                choice4.addListener(wrongHandler);
                choice5 = new TextButton(" ", skin, "orange");
                choice5.addListener(wrongHandler);
                choice6 = new TextButton(" ", skin, "gold");
                choice6.addListener(wrongHandler);
                choice7 = new TextButton(" ", skin, "green");
                choice7.addListener(wrongHandler);
                choice8 = new TextButton(" ", skin, "pink");
                choice8.addListener(wrongHandler);
                break;
            case 10:
                /*System.out.println("discord");*/
                query = new Image(new Texture("img/logo1/discord.png"));
                choice1 = new TextButton(" ", skin, "lilac");
                choice1.addListener(correctHandler);
                //random colors
                choice2 = new TextButton(" ", skin, "orange");
                choice2.addListener(wrongHandler);
                choice3 = new TextButton(" ", skin, "blue");
                choice3.addListener(wrongHandler);
                choice4 = new TextButton(" ", skin, "yellow");
                choice4.addListener(wrongHandler);
                choice5 = new TextButton(" ", skin, "lightgreen");
                choice5.addListener(wrongHandler);
                choice6 = new TextButton(" ", skin, "lightblue");
                choice6.addListener(wrongHandler);
                choice7 = new TextButton(" ", skin, "violet");
                choice7.addListener(wrongHandler);
                choice8 = new TextButton(" ", skin, "red");
                choice8.addListener(wrongHandler);
                break;
            case 11:
                /*System.out.println("facebook");*/
                query = new Image(new Texture("img/logo1/fb.png"));
                choice1 = new TextButton(" ", skin, "blue");
                choice1.addListener(correctHandler);
                //random colors
                choice2 = new TextButton(" ", skin, "orange");
                choice2.addListener(wrongHandler);
                choice3 = new TextButton(" ", skin, "red");
                choice3.addListener(wrongHandler);
                choice4 = new TextButton(" ", skin, "yellow");
                choice4.addListener(wrongHandler);
                choice5 = new TextButton(" ", skin, "gray");
                choice5.addListener(wrongHandler);
                choice6 = new TextButton(" ", skin, "lilac");
                choice6.addListener(wrongHandler);
                choice7 = new TextButton(" ", skin, "green");
                choice7.addListener(wrongHandler);
                choice8 = new TextButton(" ", skin, "violet");
                choice8.addListener(wrongHandler);
                break;
            case 12:
                /*System.out.println("foodpanda");*/
                query = new Image(new Texture("img/logo1/food.png"));
                choice1 = new TextButton(" ", skin, "pink");
                choice1.addListener(correctHandler);
                //random colors
                choice2 = new TextButton(" ", skin, "orange");
                choice2.addListener(wrongHandler);
                choice3 = new TextButton(" ", skin, "red");
                choice3.addListener(wrongHandler);
                choice4 = new TextButton(" ", skin, "yellow");
                choice4.addListener(wrongHandler);
                choice5 = new TextButton(" ", skin, "dblue");
                choice5.addListener(wrongHandler);
                choice6 = new TextButton(" ", skin, "brown");
                choice6.addListener(wrongHandler);
                choice7 = new TextButton(" ", skin, "green");
                choice7.addListener(wrongHandler);
                choice8 = new TextButton(" ", skin, "violet");
                choice8.addListener(wrongHandler);
                break;
            case 13:
                /*System.out.println("ford");*/
                query = new Image(new Texture("img/logo1/ford.png"));
                choice1 = new TextButton(" ", skin, "blue");
                choice1.addListener(correctHandler);
                //random colors
                choice2 = new TextButton(" ", skin, "orange");
                choice2.addListener(wrongHandler);
                choice3 = new TextButton(" ", skin, "red");
                choice3.addListener(wrongHandler);
                choice4 = new TextButton(" ", skin, "yellow");
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
            case 14:
                /*System.out.println("intel");*/
                query = new Image(new Texture("img/logo1/intel.png"));
                choice1 = new TextButton(" ", skin, "blue");
                choice1.addListener(correctHandler);
                //random colors
                choice2 = new TextButton(" ", skin, "orange");
                choice2.addListener(wrongHandler);
                choice3 = new TextButton(" ", skin, "red");
                choice3.addListener(wrongHandler);
                choice4 = new TextButton(" ", skin, "yellow");
                choice4.addListener(wrongHandler);
                choice5 = new TextButton(" ", skin, "orange");
                choice5.addListener(wrongHandler);
                choice6 = new TextButton(" ", skin, "brown");
                choice6.addListener(wrongHandler);
                choice7 = new TextButton(" ", skin, "green");
                choice7.addListener(wrongHandler);
                choice8 = new TextButton(" ", skin, "violet");
                choice8.addListener(wrongHandler);
                break;
            case 15:
                /*System.out.println("Jollibee");*/
                query = new Image(new Texture("img/logo1/jabe.png"));
                choice1 = new TextButton(" ", skin, "red");
                choice1.addListener(correctHandler);
                //random colors
                choice2 = new TextButton(" ", skin, "orange");
                choice2.addListener(wrongHandler);
                choice3 = new TextButton(" ", skin, "blue");
                choice3.addListener(wrongHandler);
                choice4 = new TextButton(" ", skin, "yellow");
                choice4.addListener(wrongHandler);
                choice5 = new TextButton(" ", skin, "lightblue");
                choice5.addListener(wrongHandler);
                choice6 = new TextButton(" ", skin, "lilac");
                choice6.addListener(wrongHandler);
                choice7 = new TextButton(" ", skin, "green");
                choice7.addListener(wrongHandler);
                choice8 = new TextButton(" ", skin, "violet");
                choice8.addListener(wrongHandler);
                break;
            case 16:
                /*System.out.println("LG");*/
                query = new Image(new Texture("img/logo1/lg.png"));
                choice1 = new TextButton(" ", skin, "red");
                choice1.addListener(correctHandler);
                //random colors
                choice2 = new TextButton(" ", skin, "orange");
                choice2.addListener(wrongHandler);
                choice3 = new TextButton(" ", skin, "blue");
                choice3.addListener(wrongHandler);
                choice4 = new TextButton(" ", skin, "yellow");
                choice4.addListener(wrongHandler);
                choice5 = new TextButton(" ", skin, "pink");
                choice5.addListener(wrongHandler);
                choice6 = new TextButton(" ", skin, "brown");
                choice6.addListener(wrongHandler);
                choice7 = new TextButton(" ", skin, "green");
                choice7.addListener(wrongHandler);
                choice8 = new TextButton(" ", skin, "violet");
                choice8.addListener(wrongHandler);
                break;
            case 17:
                /*System.out.println("messenger");*/
                query = new Image(new Texture("img/logo1/mess.png"));
                choice1 = new TextButton(" ", skin, "skyblue");
                choice1.addListener(correctHandler);
                //random colors
                choice2 = new TextButton(" ", skin, "orange");
                choice2.addListener(wrongHandler);
                choice3 = new TextButton(" ", skin, "red");
                choice3.addListener(wrongHandler);
                choice4 = new TextButton(" ", skin, "yellow");
                choice4.addListener(wrongHandler);
                choice5 = new TextButton(" ", skin, "gold");
                choice5.addListener(wrongHandler);
                choice6 = new TextButton(" ", skin, "gray");
                choice6.addListener(wrongHandler);
                choice7 = new TextButton(" ", skin, "green");
                choice7.addListener(wrongHandler);
                choice8 = new TextButton(" ", skin, "violet");
                choice8.addListener(wrongHandler);
                break;
            case 18:
                /*System.out.println("nickelodeon");*/
                query = new Image(new Texture("img/logo1/nick.png"));
                choice1 = new TextButton(" ", skin, "orange");
                choice1.addListener(correctHandler);
                //random colors
                choice2 = new TextButton(" ", skin, "blue");
                choice2.addListener(wrongHandler);
                choice3 = new TextButton(" ", skin, "red");
                choice3.addListener(wrongHandler);
                choice4 = new TextButton(" ", skin, "yellow");
                choice4.addListener(wrongHandler);
                choice5 = new TextButton(" ", skin, "lilac");
                choice5.addListener(wrongHandler);
                choice6 = new TextButton(" ", skin, "lightblue");
                choice6.addListener(wrongHandler);
                choice7 = new TextButton(" ", skin, "green");
                choice7.addListener(wrongHandler);
                choice8 = new TextButton(" ", skin, "lightgreen");
                choice8.addListener(wrongHandler);
                break;
            case 19:
                /*System.out.println("rolex");*/
                query = new Image(new Texture("img/logo1/rolex.png"));
                choice1 = new TextButton(" ", skin, "gold");
                choice1.addListener(correctHandler);
                //random colors
                choice2 = new TextButton(" ", skin, "lightgreen");
                choice2.addListener(wrongHandler);
                choice3 = new TextButton(" ", skin, "red");
                choice3.addListener(wrongHandler);
                choice4 = new TextButton(" ", skin, "yellow");
                choice4.addListener(wrongHandler);
                choice5 = new TextButton(" ", skin, "orange");
                choice5.addListener(wrongHandler);
                choice6 = new TextButton(" ", skin, "brown");
                choice6.addListener(wrongHandler);
                choice7 = new TextButton(" ", skin, "lilac");
                choice7.addListener(wrongHandler);
                choice8 = new TextButton(" ", skin, "violet");
                choice8.addListener(wrongHandler);
                break;
            case 20:
                /*System.out.println("samsung");*/
                query = new Image(new Texture("img/logo1/samsung.png"));
                choice1 = new TextButton(" ", skin, "blue");
                choice1.addListener(correctHandler);
                //random colors
                choice2 = new TextButton(" ", skin, "orange");
                choice2.addListener(wrongHandler);
                choice3 = new TextButton(" ", skin, "red");
                choice3.addListener(wrongHandler);
                choice4 = new TextButton(" ", skin, "yellow");
                choice4.addListener(wrongHandler);
                choice5 = new TextButton(" ", skin, "skyblue");
                choice5.addListener(wrongHandler);
                choice6 = new TextButton(" ", skin, "gray");
                choice6.addListener(wrongHandler);
                choice7 = new TextButton(" ", skin, "green");
                choice7.addListener(wrongHandler);
                choice8 = new TextButton(" ", skin, "violet");
                choice8.addListener(wrongHandler);
                break;
            case 21:
                /*System.out.println("starbucks");*/
                query = new Image(new Texture("img/logo1/sb.png"));
                choice1 = new TextButton(" ", skin, "green");
                choice1.addListener(correctHandler);
                //random colors
                choice2 = new TextButton(" ", skin, "orange");
                choice2.addListener(wrongHandler);
                choice3 = new TextButton(" ", skin, "red");
                choice3.addListener(wrongHandler);
                choice4 = new TextButton(" ", skin, "yellow");
                choice4.addListener(wrongHandler);
                choice5 = new TextButton(" ", skin, "lightblue");
                choice5.addListener(wrongHandler);
                choice6 = new TextButton(" ", skin, "blue");
                choice6.addListener(wrongHandler);
                choice7 = new TextButton(" ", skin, "red");
                choice7.addListener(wrongHandler);
                choice8 = new TextButton(" ", skin, "dblue");
                choice8.addListener(wrongHandler);
                break;
            case 22:
                /*System.out.println("Selecta");*/
                query = new Image(new Texture("img/logo1/selecta.png"));
                choice1 = new TextButton(" ", skin, "red");
                choice1.addListener(correctHandler);
                //random colors
                choice2 = new TextButton(" ", skin, "orange");
                choice2.addListener(wrongHandler);
                choice3 = new TextButton(" ", skin, "blue");
                choice3.addListener(wrongHandler);
                choice4 = new TextButton(" ", skin, "yellow");
                choice4.addListener(wrongHandler);
                choice5 = new TextButton(" ", skin, "brown");
                choice5.addListener(wrongHandler);
                choice6 = new TextButton(" ", skin, "lightgreen");
                choice6.addListener(wrongHandler);
                choice7 = new TextButton(" ", skin, "green");
                choice7.addListener(wrongHandler);
                choice8 = new TextButton(" ", skin, "violet");
                choice8.addListener(wrongHandler);
                break;
            case 23:
                /*System.out.println("Snapchat");*/
                query = new Image(new Texture("img/logo1/snap.png"));
                choice1 = new TextButton(" ", skin, "yellow");
                choice1.addListener(correctHandler);
                //random colors
                choice2 = new TextButton(" ", skin, "orange");
                choice2.addListener(wrongHandler);
                choice3 = new TextButton(" ", skin, "blue");
                choice3.addListener(wrongHandler);
                choice4 = new TextButton(" ", skin, "red");
                choice4.addListener(wrongHandler);
                choice5 = new TextButton(" ", skin, "orange");
                choice5.addListener(wrongHandler);
                choice6 = new TextButton(" ", skin, "pink");
                choice6.addListener(wrongHandler);
                choice7 = new TextButton(" ", skin, "green");
                choice7.addListener(wrongHandler);
                choice8 = new TextButton(" ", skin, "lilac");
                choice8.addListener(wrongHandler);
                break;
            case 24:
                /*System.out.println("Twitter");*/
                query = new Image(new Texture("img/logo1/twit.png"));
                choice1 = new TextButton(" ", skin, "skyblue");
                choice1.addListener(correctHandler);
                //random colors
                choice2 = new TextButton(" ", skin, "orange");
                choice2.addListener(wrongHandler);
                choice3 = new TextButton(" ", skin, "red");
                choice3.addListener(wrongHandler);
                choice4 = new TextButton(" ", skin, "lilac");
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
            case 25:
                /*System.out.println("Unilever");*/
                query = new Image(new Texture("img/logo1/uni.png"));
                choice1 = new TextButton(" ", skin, "blue");
                choice1.addListener(correctHandler);
                //random colors
                choice2 = new TextButton(" ", skin, "orange");
                choice2.addListener(wrongHandler);
                choice3 = new TextButton(" ", skin, "red");
                choice3.addListener(wrongHandler);
                choice4 = new TextButton(" ", skin, "yellow");
                choice4.addListener(wrongHandler);
                choice5 = new TextButton(" ", skin, "dblue");
                choice5.addListener(wrongHandler);
                choice6 = new TextButton(" ", skin, "gray");
                choice6.addListener(wrongHandler);
                choice7 = new TextButton(" ", skin, "green");
                choice7.addListener(wrongHandler);
                choice8 = new TextButton(" ", skin, "lightgreen");
                choice8.addListener(wrongHandler);
                break;
            case 26:
                /*System.out.println("Mitsubishi");*/
                query = new Image(new Texture("img/logo1/Untitled-1.png"));
                choice1 = new TextButton(" ", skin, "red");
                choice1.addListener(correctHandler);
                //random colors
                choice2 = new TextButton(" ", skin, "orange");
                choice2.addListener(wrongHandler);
                choice3 = new TextButton(" ", skin, "blue");
                choice3.addListener(wrongHandler);
                choice4 = new TextButton(" ", skin, "yellow");
                choice4.addListener(wrongHandler);
                choice5 = new TextButton(" ", skin, "brown");
                choice5.addListener(wrongHandler);
                choice6 = new TextButton(" ", skin, "green");
                choice6.addListener(wrongHandler);
                choice7 = new TextButton(" ", skin, "dblue");
                choice7.addListener(wrongHandler);
                choice8 = new TextButton(" ", skin, "lilac");
                choice8.addListener(wrongHandler);
                break;
            case 27:
                /*System.out.println("Volkswagen");*/
                query = new Image(new Texture("img/logo1/volks.png"));
                choice1 = new TextButton(" ", skin, "blue");
                choice1.addListener(correctHandler);
                //random colors
                choice2 = new TextButton(" ", skin, "lightgreen");
                choice2.addListener(wrongHandler);
                choice3 = new TextButton(" ", skin, "red");
                choice3.addListener(wrongHandler);
                choice4 = new TextButton(" ", skin, "yellow");
                choice4.addListener(wrongHandler);
                choice5 = new TextButton(" ", skin, "orange");
                choice5.addListener(wrongHandler);
                choice6 = new TextButton(" ", skin, "lilac");
                choice6.addListener(wrongHandler);
                choice7 = new TextButton(" ", skin, "green");
                choice7.addListener(wrongHandler);
                choice8 = new TextButton(" ", skin, "pink");
                choice8.addListener(wrongHandler);
                break;
            case 28:
                /*System.out.println("Youtube");*/
                query = new Image(new Texture("img/logo1/yt.png"));
                choice1 = new TextButton(" ", skin, "red");
                choice1.addListener(correctHandler);
                //random colors
                choice2 = new TextButton(" ", skin, "skyblue");
                choice2.addListener(wrongHandler);
                choice3 = new TextButton(" ", skin, "blue");
                choice3.addListener(wrongHandler);
                choice4 = new TextButton(" ", skin, "yellow");
                choice4.addListener(wrongHandler);
                choice5 = new TextButton(" ", skin, "orange");
                choice5.addListener(wrongHandler);
                choice6 = new TextButton(" ", skin, "lightgreen");
                choice6.addListener(wrongHandler);
                choice7 = new TextButton(" ", skin, "green");
                choice7.addListener(wrongHandler);
                choice8 = new TextButton(" ", skin, "gray");
                choice8.addListener(wrongHandler);
                break;
            case 29:
                /*System.out.println("Xbox");*/
                query = new Image(new Texture("img/logo1/xbox.png"));
                choice1 = new TextButton(" ", skin, "green");
                choice1.addListener(correctHandler);
                //random colors
                choice2 = new TextButton(" ", skin, "orange");
                choice2.addListener(wrongHandler);
                choice3 = new TextButton(" ", skin, "blue");
                choice3.addListener(wrongHandler);
                choice4 = new TextButton(" ", skin, "yellow");
                choice4.addListener(wrongHandler);
                choice5 = new TextButton(" ", skin, "skyblue");
                choice5.addListener(wrongHandler);
                choice6 = new TextButton(" ", skin, "red");
                choice6.addListener(wrongHandler);
                choice7 = new TextButton(" ", skin, "dblue");
                choice7.addListener(wrongHandler);
                choice8 = new TextButton(" ", skin, "violet");
                choice8.addListener(wrongHandler);
                break;
            case 30:
                /*System.out.println("KIA");*/
                query = new Image(new Texture("img/logo1/kia.png"));
                choice1 = new TextButton(" ", skin, "red");
                choice1.addListener(correctHandler);
                //random colors
                choice2 = new TextButton(" ", skin, "orange");
                choice2.addListener(wrongHandler);
                choice3 = new TextButton(" ", skin, "blue");
                choice3.addListener(wrongHandler);
                choice4 = new TextButton(" ", skin, "yellow");
                choice4.addListener(wrongHandler);
                choice5 = new TextButton(" ", skin, "dblue");
                choice5.addListener(wrongHandler);
                choice6 = new TextButton(" ", skin, "green");
                choice6.addListener(wrongHandler);
                choice7 = new TextButton(" ", skin, "gold");
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

        if(health == 1){
            if(hud.progress < 20 ){
                updateTable();
                hud.setProgress(hud.getProgress()+1);
                //System.out.println("correct");
                MyGdxGame.assets.get("audio/bell.wav", Sound.class).play();
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
