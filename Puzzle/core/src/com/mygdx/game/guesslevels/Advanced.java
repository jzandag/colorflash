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

public class Advanced extends GuessScreens implements Screen {
    private static final int STAGE_LEVEL = 2;


    public Advanced(MyGdxGame game){
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
                /*System.out.println("711");*/
                query = new Image(new Texture("img/logo3/711.png"));
                choice1 = new TextButton(" ", skin, "green");
                choice1.addListener(correctHandler);
                choice2 = new TextButton(" ", skin, "red");
                choice2.addListener(correctHandler);
                choice3 = new TextButton(" ", skin, "orange");
                choice3.addListener(correctHandler);
                //random colors
                choice4 = new TextButton(" ", skin, "dblue");
                choice4.addListener(correctHandler);
                choice5 = new TextButton(" ", skin, "blue");
                choice5.addListener(wrongHandler);
                choice6 = new TextButton(" ", skin, "gray");
                choice6.addListener(wrongHandler);
                choice7 = new TextButton(" ", skin, "skyblue");
                choice7.addListener(wrongHandler);
                choice8 = new TextButton(" ", skin, "violet");
                choice8.addListener(wrongHandler);
                break;
            case 2:
                /*System.out.println("ABS-CBN");*/
                query = new Image(new Texture("img/logo3/abscbn.png"));
                choice1 = new TextButton(" ", skin, "green");
                choice1.addListener(correctHandler);
                choice2 = new TextButton(" ", skin, "red");
                choice2.addListener(correctHandler);
                choice3 = new TextButton(" ", skin, "blue");
                choice3.addListener(correctHandler);
                //random colors
                choice4 = new TextButton(" ", skin, "yellow");
                choice4.addListener(wrongHandler);
                choice5 = new TextButton(" ", skin, "orange");
                choice5.addListener(wrongHandler);
                choice6 = new TextButton(" ", skin, "gray");
                choice6.addListener(wrongHandler);
                choice7 = new TextButton(" ", skin, "brown");
                choice7.addListener(wrongHandler);
                choice8 = new TextButton(" ", skin, "violet");
                choice8.addListener(wrongHandler);
                break;
            case 3:
                /*System.out.println("Brazil");*/
                query = new Image(new Texture("img/logo3/Brazil.png"));
                choice1 = new TextButton(" ", skin, "green");
                choice1.addListener(correctHandler);
                choice2 = new TextButton(" ", skin, "yellow");
                choice2.addListener(correctHandler);
                choice3 = new TextButton(" ", skin, "blue");
                choice3.addListener(correctHandler);
                //random colors
                choice4 = new TextButton(" ", skin, "red");
                choice4.addListener(wrongHandler);
                choice5 = new TextButton(" ", skin, "lilac");
                choice5.addListener(wrongHandler);
                choice6 = new TextButton(" ", skin, "pink");
                choice6.addListener(wrongHandler);
                choice7 = new TextButton(" ", skin, "gray");
                choice7.addListener(wrongHandler);
                choice8 = new TextButton(" ", skin, "violet");
                choice8.addListener(wrongHandler);
                break;
            case 4:
                /*System.out.println("Burger King");*/
                query = new Image(new Texture("img/logo3/burgerking..png"));
                choice1 = new TextButton(" ", skin, "blue");
                choice1.addListener(correctHandler);
                choice2 = new TextButton(" ", skin, "red");
                choice2.addListener(correctHandler);
                choice3 = new TextButton(" ", skin, "orange");
                choice3.addListener(correctHandler);
                //random colors
                choice4 = new TextButton(" ", skin, "pink");
                choice4.addListener(wrongHandler);
                choice5 = new TextButton(" ", skin, "lightgreen");
                choice5.addListener(wrongHandler);
                choice6 = new TextButton(" ", skin, "lilac");
                choice6.addListener(wrongHandler);
                choice7 = new TextButton(" ", skin, "green");
                choice7.addListener(wrongHandler);
                choice8 = new TextButton(" ", skin, "violet");
                choice8.addListener(wrongHandler);
                break;
            case 5:
                /*System.out.println("djibouti");*/
                query = new Image(new Texture("img/logo3/djibouti.png"));
                choice1 = new TextButton(" ", skin, "skyblue");
                choice1.addListener(correctHandler);
                //random colors
                choice2 = new TextButton(" ", skin, "red");
                choice2.addListener(correctHandler);
                choice3 = new TextButton(" ", skin, "green");
                choice3.addListener(correctHandler);
                choice4 = new TextButton(" ", skin, "yellow");
                choice4.addListener(wrongHandler);
                choice5 = new TextButton(" ", skin, "blue");
                choice5.addListener(wrongHandler);
                choice6 = new TextButton(" ", skin, "gold");
                choice6.addListener(wrongHandler);
                choice7 = new TextButton(" ", skin, "pink");
                choice7.addListener(wrongHandler);
                choice8 = new TextButton(" ", skin, "lightgreen");
                choice8.addListener(wrongHandler);
                break;
            case 6:
                /*System.out.println("dole");*/
                query = new Image(new Texture("img/logo3/dole.png"));
                choice1 = new TextButton(" ", skin, "blue");
                choice1.addListener(correctHandler);
                choice2 = new TextButton(" ", skin, "red");
                choice2.addListener(correctHandler);
                choice3 = new TextButton(" ", skin, "yellow");
                choice3.addListener(correctHandler);
                //random colors
                choice4 = new TextButton(" ", skin, "brown");
                choice4.addListener(wrongHandler);
                choice5 = new TextButton(" ", skin, "lilac");
                choice5.addListener(wrongHandler);
                choice6 = new TextButton(" ", skin, "lightgreen");
                choice6.addListener(wrongHandler);
                choice7 = new TextButton(" ", skin, "green");
                choice7.addListener(wrongHandler);
                choice8 = new TextButton(" ", skin, "violet");
                choice8.addListener(wrongHandler);
                break;
            case 7:
                /*System.out.println("Gambia");*/
                query = new Image(new Texture("img/logo3/gambia.png"));
                choice1 = new TextButton(" ", skin, "blue");
                choice1.addListener(correctHandler);
                choice2 = new TextButton(" ", skin, "red");
                choice2.addListener(correctHandler);
                choice3 = new TextButton(" ", skin, "green");
                choice3.addListener(correctHandler);
                //random colors
                choice4 = new TextButton(" ", skin, "yellow");
                choice4.addListener(wrongHandler);
                choice5 = new TextButton(" ", skin, "red");
                choice5.addListener(wrongHandler);
                choice6 = new TextButton(" ", skin, "pink");
                choice6.addListener(wrongHandler);
                choice7 = new TextButton(" ", skin, "brown");
                choice7.addListener(wrongHandler);
                choice8 = new TextButton(" ", skin, "violet");
                choice8.addListener(wrongHandler);
                break;
            case 8:
                /*System.out.println("Ghana");*/
                query = new Image(new Texture("img/logo3/ghana.png"));
                choice1 = new TextButton(" ", skin, "green");
                choice1.addListener(correctHandler);
                choice2 = new TextButton(" ", skin, "red");
                choice2.addListener(correctHandler);
                choice3 = new TextButton(" ", skin, "yellow");
                choice3.addListener(correctHandler);
                //random colors
                choice4 = new TextButton(" ", skin, "blue");
                choice4.addListener(wrongHandler);
                choice5 = new TextButton(" ", skin, "gold");
                choice5.addListener(wrongHandler);
                choice6 = new TextButton(" ", skin, "skyblue");
                choice6.addListener(wrongHandler);
                choice7 = new TextButton(" ", skin, "brown");
                choice7.addListener(wrongHandler);
                choice8 = new TextButton(" ", skin, "violet");
                choice8.addListener(wrongHandler);
                break;
            case 9:
                /*System.out.println("knorr");*/
                query = new Image(new Texture("img/logo3/knorr.png"));
                choice1 = new TextButton(" ", skin, "green");
                choice1.addListener(correctHandler);
                choice2 = new TextButton(" ", skin, "red");
                choice2.addListener(correctHandler);
                choice3 = new TextButton(" ", skin, "yellow");
                choice3.addListener(correctHandler);
                //random colors
                choice4 = new TextButton(" ", skin, "pink");
                choice4.addListener(wrongHandler);
                choice5 = new TextButton(" ", skin, "skyblue");
                choice5.addListener(wrongHandler);
                choice6 = new TextButton(" ", skin, "lilac");
                choice6.addListener(wrongHandler);
                choice7 = new TextButton(" ", skin, "dblue");
                choice7.addListener(wrongHandler);
                choice8 = new TextButton(" ", skin, "violet");
                choice8.addListener(wrongHandler);
                break;
            case 10:
                /*System.out.println("Mang Inasal");*/
                query = new Image(new Texture("img/logo3/manginasal.png"));
                choice1 = new TextButton(" ", skin, "green");
                choice1.addListener(correctHandler);
                choice2 = new TextButton(" ", skin, "red");
                choice2.addListener(correctHandler);
                choice3 = new TextButton(" ", skin, "yellow");
                choice3.addListener(correctHandler);
                //random colors
                choice4 = new TextButton(" ", skin, "pink");
                choice4.addListener(wrongHandler);
                choice5 = new TextButton(" ", skin, "lilac");
                choice5.addListener(wrongHandler);
                choice6 = new TextButton(" ", skin, "gray");
                choice6.addListener(wrongHandler);
                choice7 = new TextButton(" ", skin, "gold");
                choice7.addListener(wrongHandler);
                choice8 = new TextButton(" ", skin, "brown");
                choice8.addListener(wrongHandler);
                break;
            case 11:
                /*System.out.println("oishi");*/
                query = new Image(new Texture("img/logo3/oishi.png"));
                choice1 = new TextButton(" ", skin, "orange");
                choice1.addListener(correctHandler);
                choice2 = new TextButton(" ", skin, "red");
                choice2.addListener(correctHandler);
                choice3 = new TextButton(" ", skin, "yellow");
                choice3.addListener(correctHandler);
                //random colors
                choice4 = new TextButton(" ", skin, "blue");
                choice4.addListener(wrongHandler);
                choice5 = new TextButton(" ", skin, "dblue");
                choice5.addListener(wrongHandler);
                choice6 = new TextButton(" ", skin, "brown");
                choice6.addListener(wrongHandler);
                choice7 = new TextButton(" ", skin, "lilac");
                choice7.addListener(wrongHandler);
                choice8 = new TextButton(" ", skin, "gold");
                choice8.addListener(wrongHandler);
                break;
            case 12:
                /*System.out.println("Philippines");*/
                query = new Image(new Texture("img/logo3/Philippines.png"));
                choice1 = new TextButton(" ", skin, "blue");
                choice1.addListener(correctHandler);
                choice2 = new TextButton(" ", skin, "red");
                choice2.addListener(correctHandler);
                choice3 = new TextButton(" ", skin, "yellow");
                choice3.addListener(correctHandler);
                //random colors
                choice4 = new TextButton(" ", skin, "lilac");
                choice4.addListener(wrongHandler);
                choice5 = new TextButton(" ", skin, "gray");
                choice5.addListener(wrongHandler);
                choice6 = new TextButton(" ", skin, "lightgreen");
                choice6.addListener(wrongHandler);
                choice7 = new TextButton(" ", skin, "green");
                choice7.addListener(wrongHandler);
                choice8 = new TextButton(" ", skin, "violet");
                choice8.addListener(wrongHandler);
                break;
            case 13:
                /*System.out.println("Pizza hut");*/
                query = new Image(new Texture("img/logo3/pizzahut.png"));
                choice1 = new TextButton(" ", skin, "green");
                choice1.addListener(correctHandler);
                choice2 = new TextButton(" ", skin, "red");
                choice2.addListener(correctHandler);
                choice3 = new TextButton(" ", skin, "yellow");
                choice3.addListener(correctHandler);
                //random colors
                choice4 = new TextButton(" ", skin, "lightgreen");
                choice4.addListener(wrongHandler);
                choice5 = new TextButton(" ", skin, "pink");
                choice5.addListener(wrongHandler);
                choice6 = new TextButton(" ", skin, "dblue");
                choice6.addListener(wrongHandler);
                choice7 = new TextButton(" ", skin, "skyblue");
                choice7.addListener(wrongHandler);
                choice8 = new TextButton(" ", skin, "violet");
                choice8.addListener(wrongHandler);
                break;
            case 14:
                /*System.out.println("Tanzania");*/
                query = new Image(new Texture("img/logo3/tanzania.png"));
                choice1 = new TextButton(" ", skin, "green");
                choice1.addListener(correctHandler);
                choice2 = new TextButton(" ", skin, "skyblue");
                choice2.addListener(correctHandler);
                choice3 = new TextButton(" ", skin, "yellow");
                choice3.addListener(correctHandler);
                //random colors
                choice4 = new TextButton(" ", skin, "lilac");
                choice4.addListener(wrongHandler);
                choice5 = new TextButton(" ", skin, "red");
                choice5.addListener(wrongHandler);
                choice6 = new TextButton(" ", skin, "gray");
                choice6.addListener(wrongHandler);
                choice7 = new TextButton(" ", skin, "brown");
                choice7.addListener(wrongHandler);
                choice8 = new TextButton(" ", skin, "blue");
                choice8.addListener(wrongHandler);
                break;
            case 15:
                /*System.out.println("Venezuela");*/
                query = new Image(new Texture("img/logo3/venezuela.png"));
                choice1 = new TextButton(" ", skin, "red");
                choice1.addListener(correctHandler);
                choice2 = new TextButton(" ", skin, "blue");
                choice2.addListener(correctHandler);
                choice3 = new TextButton(" ", skin, "yellow");
                choice3.addListener(correctHandler);
                //random colors
                choice4 = new TextButton(" ", skin, "brown");
                choice4.addListener(wrongHandler);
                choice5 = new TextButton(" ", skin, "gray");
                choice5.addListener(wrongHandler);
                choice6 = new TextButton(" ", skin, "lilac");
                choice6.addListener(wrongHandler);
                choice7 = new TextButton(" ", skin, "lightgreen");
                choice7.addListener(wrongHandler);
                choice8 = new TextButton(" ", skin, "violet");
                choice8.addListener(wrongHandler);
                break;
            case 16:
                /*System.out.println("Del Monte");*/
                query = new Image(new Texture("img/logo3/DM.png"));
                choice1 = new TextButton(" ", skin, "red");
                choice1.addListener(correctHandler);
                choice2 = new TextButton(" ", skin, "green");
                choice2.addListener(correctHandler);
                choice3 = new TextButton(" ", skin, "yellow");
                choice3.addListener(correctHandler);
                //random colors
                choice4 = new TextButton(" ", skin, "blue");
                choice4.addListener(wrongHandler);
                choice5 = new TextButton(" ", skin, "pink");
                choice5.addListener(wrongHandler);
                choice6 = new TextButton(" ", skin, "lightgreen");
                choice6.addListener(wrongHandler);
                choice7 = new TextButton(" ", skin, "dblue");
                choice7.addListener(wrongHandler);
                choice8 = new TextButton(" ", skin, "blue");
                choice8.addListener(wrongHandler);
                break;
            case 17:
                /*System.out.println("Dairy Queen");*/
                query = new Image(new Texture("img/logo3/dq.png"));
                choice1 = new TextButton(" ", skin, "red");
                choice1.addListener(correctHandler);
                choice2 = new TextButton(" ", skin, "blue");
                choice2.addListener(correctHandler);
                choice3 = new TextButton(" ", skin, "orange");
                choice3.addListener(correctHandler);
                //random colors
                choice4 = new TextButton(" ", skin, "lilac");
                choice4.addListener(wrongHandler);
                choice5 = new TextButton(" ", skin, "pink");
                choice5.addListener(wrongHandler);
                choice6 = new TextButton(" ", skin, "green");
                choice6.addListener(wrongHandler);
                choice7 = new TextButton(" ", skin, "lightgreen");
                choice7.addListener(wrongHandler);
                choice8 = new TextButton(" ", skin, "brown");
                choice8.addListener(wrongHandler);
                break;
            case 18:
                /*System.out.println("Fanta");*/
                query = new Image(new Texture("img/logo3/fanta.png"));
                choice1 = new TextButton(" ", skin, "green");
                choice1.addListener(correctHandler);
                choice2 = new TextButton(" ", skin, "blue");
                choice2.addListener(correctHandler);
                choice3 = new TextButton(" ", skin, "orange");
                choice3.addListener(correctHandler);
                //random colors
                choice4 = new TextButton(" ", skin, "lilac");
                choice4.addListener(wrongHandler);
                choice5 = new TextButton(" ", skin, "red");
                choice5.addListener(wrongHandler);
                choice6 = new TextButton(" ", skin, "pink");
                choice6.addListener(wrongHandler);
                choice7 = new TextButton(" ", skin, "brown");
                choice7.addListener(wrongHandler);
                choice8 = new TextButton(" ", skin, "violet");
                choice8.addListener(wrongHandler);
                break;
            case 19:
                /*System.out.println("Pringles");*/
                query = new Image(new Texture("img/logo3/pringles.png"));
                choice1 = new TextButton(" ", skin, "red");
                choice1.addListener(correctHandler);
                choice2 = new TextButton(" ", skin, "brown");
                choice2.addListener(correctHandler);
                choice3 = new TextButton(" ", skin, "yellow");
                choice3.addListener(correctHandler);
                //random colors
                choice4 = new TextButton(" ", skin, "blue");
                choice4.addListener(wrongHandler);
                choice5 = new TextButton(" ", skin, "gold");
                choice5.addListener(wrongHandler);
                choice6 = new TextButton(" ", skin, "dblue");
                choice6.addListener(wrongHandler);
                choice7 = new TextButton(" ", skin, "green");
                choice7.addListener(wrongHandler);
                choice8 = new TextButton(" ", skin, "lightgreen");
                choice8.addListener(wrongHandler);
                break;
            case 20:
                /*System.out.println("Taco Bell");*/
                query = new Image(new Texture("img/logo3/tb.png"));
                choice1 = new TextButton(" ", skin, "pink");
                choice1.addListener(correctHandler);
                choice2 = new TextButton(" ", skin, "violet");
                choice2.addListener(correctHandler);
                choice3 = new TextButton(" ", skin, "yellow");
                choice3.addListener(correctHandler);
                //random colors
                choice4 = new TextButton(" ", skin, "skyblue");
                choice4.addListener(wrongHandler);
                choice5 = new TextButton(" ", skin, "red");
                choice5.addListener(wrongHandler);
                choice6 = new TextButton(" ", skin, "lightgreen");
                choice6.addListener(wrongHandler);
                choice7 = new TextButton(" ", skin, "green");
                choice7.addListener(wrongHandler);
                choice8 = new TextButton(" ", skin, "blue");
                choice8.addListener(wrongHandler);
                break;
            case 21:
                /*System.out.println("PBA");*/
                query = new Image(new Texture("img/logo3/pba.png"));
                choice1 = new TextButton(" ", skin, "red");
                choice1.addListener(correctHandler);
                choice2 = new TextButton(" ", skin, "blue");
                choice2.addListener(correctHandler);
                choice3 = new TextButton(" ", skin, "orange");
                choice3.addListener(correctHandler);
                //random colors
                choice4 = new TextButton(" ", skin, "pink");
                choice4.addListener(wrongHandler);
                choice5 = new TextButton(" ", skin, "gold");
                choice5.addListener(wrongHandler);
                choice6 = new TextButton(" ", skin, "lightgreen");
                choice6.addListener(wrongHandler);
                choice7 = new TextButton(" ", skin, "green");
                choice7.addListener(wrongHandler);
                choice8 = new TextButton(" ", skin, "gray");
                choice8.addListener(wrongHandler);
                break;
            case 22:
                /*System.out.println("TNT");*/
                query = new Image(new Texture("img/logo3/tnt.png"));
                choice1 = new TextButton(" ", skin, "yellow");
                choice1.addListener(correctHandler);
                choice2 = new TextButton(" ", skin, "blue");
                choice2.addListener(correctHandler);
                choice3 = new TextButton(" ", skin, "orange");
                choice3.addListener(correctHandler);
                //random colors
                choice4 = new TextButton(" ", skin, "lilac");
                choice4.addListener(wrongHandler);
                choice5 = new TextButton(" ", skin, "red");
                choice5.addListener(wrongHandler);
                choice6 = new TextButton(" ", skin, "lightgreen");
                choice6.addListener(wrongHandler);
                choice7 = new TextButton(" ", skin, "green");
                choice7.addListener(wrongHandler);
                choice8 = new TextButton(" ", skin, "violet");
                choice8.addListener(wrongHandler);
                break;
            case 23:
                /*System.out.println("Moes");*/
                query = new Image(new Texture("img/logo3/moes.png"));
                choice1 = new TextButton(" ", skin, "red");
                choice1.addListener(correctHandler);
                choice2 = new TextButton(" ", skin, "yellow");
                choice2.addListener(correctHandler);
                choice3 = new TextButton(" ", skin, "green");
                choice3.addListener(correctHandler);
                //random colors
                choice4 = new TextButton(" ", skin, "pink");
                choice4.addListener(wrongHandler);
                choice5 = new TextButton(" ", skin, "lightgreen");
                choice5.addListener(wrongHandler);
                choice6 = new TextButton(" ", skin, "blue");
                choice6.addListener(wrongHandler);
                choice7 = new TextButton(" ", skin, "dblue");
                choice7.addListener(wrongHandler);
                choice8 = new TextButton(" ", skin, "violet");
                choice8.addListener(wrongHandler);
                break;
            case 24:
                /*System.out.println("Wonder Woman");*/
                query = new Image(new Texture("img/logo3/wowo.png"));
                choice1 = new TextButton(" ", skin, "red");
                choice1.addListener(correctHandler);
                choice2 = new TextButton(" ", skin, "yellow");
                choice2.addListener(correctHandler);
                choice3 = new TextButton(" ", skin, "skyblue");
                choice3.addListener(correctHandler);
                //random colors
                choice4 = new TextButton(" ", skin, "gray");
                choice4.addListener(wrongHandler);
                choice5 = new TextButton(" ", skin, "gold");
                choice5.addListener(wrongHandler);
                choice6 = new TextButton(" ", skin, "green");
                choice6.addListener(wrongHandler);
                choice7 = new TextButton(" ", skin, "pink");
                choice7.addListener(wrongHandler);
                choice8 = new TextButton(" ", skin, "brown");
                choice8.addListener(wrongHandler);
                break;
            case 25:
                /*System.out.println("Tide");*/
                query = new Image(new Texture("img/logo3/tide.png"));
                choice1 = new TextButton(" ", skin, "blue");
                choice1.addListener(correctHandler);
                choice2 = new TextButton(" ", skin, "yellow");
                choice2.addListener(correctHandler);
                choice3 = new TextButton(" ", skin, "orange");
                choice3.addListener(correctHandler);
                //random colors
                choice4 = new TextButton(" ", skin, "lightgreen");
                choice4.addListener(wrongHandler);
                choice5 = new TextButton(" ", skin, "red");
                choice5.addListener(wrongHandler);
                choice6 = new TextButton(" ", skin, "pink");
                choice6.addListener(wrongHandler);
                choice7 = new TextButton(" ", skin, "gray");
                choice7.addListener(wrongHandler);
                choice8 = new TextButton(" ", skin, "violet");
                choice8.addListener(wrongHandler);
                break;
            case 26:
                /*System.out.println("Mali");*/
                query = new Image(new Texture("img/logo3/mali.png"));
                choice1 = new TextButton(" ", skin, "red");
                choice1.addListener(correctHandler);
                choice2 = new TextButton(" ", skin, "yellow");
                choice2.addListener(correctHandler);
                choice3 = new TextButton(" ", skin, "green");
                choice3.addListener(correctHandler);
                //random colors
                choice4 = new TextButton(" ", skin, "violet");
                choice4.addListener(wrongHandler);
                choice5 = new TextButton(" ", skin, "gray");
                choice5.addListener(wrongHandler);
                choice6 = new TextButton(" ", skin, "blue");
                choice6.addListener(wrongHandler);
                choice7 = new TextButton(" ", skin, "pink");
                choice7.addListener(wrongHandler);
                choice8 = new TextButton(" ", skin, "dblue");
                choice8.addListener(wrongHandler);
                break;
            case 27:
                /*System.out.println("Gabon");*/
                query = new Image(new Texture("img/logo3/gabon.png"));
                choice1 = new TextButton(" ", skin, "skyblue");
                choice1.addListener(correctHandler);
                choice2 = new TextButton(" ", skin, "yellow");
                choice2.addListener(correctHandler);
                choice3 = new TextButton(" ", skin, "green");
                choice3.addListener(correctHandler);
                //random colors
                choice4 = new TextButton(" ", skin, "pink");
                choice4.addListener(wrongHandler);
                choice5 = new TextButton(" ", skin, "red");
                choice5.addListener(wrongHandler);
                choice6 = new TextButton(" ", skin, "brown");
                choice6.addListener(wrongHandler);
                choice7 = new TextButton(" ", skin, "lilac");
                choice7.addListener(wrongHandler);
                choice8 = new TextButton(" ", skin, "violet");
                choice8.addListener(wrongHandler);
                break;
            case 28:
                /*System.out.println("Rwanda");*/
                query = new Image(new Texture("img/logo3/rwanda.png"));
                choice1 = new TextButton(" ", skin, "skyblue");
                choice1.addListener(correctHandler);
                choice2 = new TextButton(" ", skin, "yellow");
                choice2.addListener(correctHandler);
                choice3 = new TextButton(" ", skin, "green");
                choice3.addListener(correctHandler);
                //random colors
                choice4 = new TextButton(" ", skin, "violet");
                choice4.addListener(wrongHandler);
                choice5 = new TextButton(" ", skin, "red");
                choice5.addListener(wrongHandler);
                choice6 = new TextButton(" ", skin, "pink");
                choice6.addListener(wrongHandler);
                choice7 = new TextButton(" ", skin, "lightgreen");
                choice7.addListener(wrongHandler);
                choice8 = new TextButton(" ", skin, "blue");
                choice8.addListener(wrongHandler);
                break;
            case 29:
                /*System.out.println("Colombia");*/
                query = new Image(new Texture("img/logo3/colombia.png"));
                choice1 = new TextButton(" ", skin, "red");
                choice1.addListener(correctHandler);
                choice2 = new TextButton(" ", skin, "yellow");
                choice2.addListener(correctHandler);
                choice3 = new TextButton(" ", skin, "blue");
                choice3.addListener(correctHandler);
                //random colors
                choice4 = new TextButton(" ", skin, "pink");
                choice4.addListener(wrongHandler);
                choice5 = new TextButton(" ", skin, "lilac");
                choice5.addListener(wrongHandler);
                choice6 = new TextButton(" ", skin, "lightgreen");
                choice6.addListener(wrongHandler);
                choice7 = new TextButton(" ", skin, "green");
                choice7.addListener(wrongHandler);
                choice8 = new TextButton(" ", skin, "gray");
                choice8.addListener(wrongHandler);
                break;
            case 30:
                /*System.out.println("Myanmar");*/
                query = new Image(new Texture("img/logo3/myanmar.png"));
                choice1 = new TextButton(" ", skin, "red");
                choice1.addListener(correctHandler);
                choice2 = new TextButton(" ", skin, "yellow");
                choice2.addListener(correctHandler);
                choice3 = new TextButton(" ", skin, "green");
                choice3.addListener(correctHandler);
                //random colors
                choice4 = new TextButton(" ", skin, "violet");
                choice4.addListener(wrongHandler);
                choice5 = new TextButton(" ", skin, "brown");
                choice5.addListener(wrongHandler);
                choice6 = new TextButton(" ", skin, "pink");
                choice6.addListener(wrongHandler);
                choice7 = new TextButton(" ", skin, "dblue");
                choice7.addListener(wrongHandler);
                choice8 = new TextButton(" ", skin, "skyblue");
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
        if(health == 3){
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
