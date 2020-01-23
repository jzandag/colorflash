package com.mygdx.game.scenes;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Window;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.mygdx.game.MyGdxGame;
import com.mygdx.game.levels.Advanced;
import com.mygdx.game.levels.Beginner;
import com.mygdx.game.levels.Intermediate;
import com.mygdx.game.screens.GameScreens;
import com.mygdx.game.screens.LevelsScreen;
import com.mygdx.game.screens.MainMenuScreen;
import com.mygdx.game.screens.PlayScreen;


public class LevelClear {

    //Scene2D.ui Stage and its own Viewport for HUD
    private Viewport viewport;

    private Label clear;
    private TextureAtlas atlas;
    private Skin skin;

    public Window window;

    public LevelClear(final MyGdxGame game, GameScreens screen, final int level, boolean isWin){

        //atlas = new TextureAtlas("ui/colorBtn.pack");
        //skin = new Skin(Gdx.files.internal("ui/colorFlashSkin.json"),atlas);
        atlas = screen.atlas;
        skin = screen.skin;
        window = new Window(" ",skin);
        window.setBounds(0,0,300,300);
        window.setFillParent(true);
        ImageButton home = new ImageButton(skin,"home");
        home.addListener(new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y) {

                game.setScreen(new MainMenuScreen(game));
            }
        });

        ImageButton levelBtn = new ImageButton(skin,"level");
        levelBtn.addListener(new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y) {
                game.setScreen(new LevelsScreen(game));
            }
        });

        ImageButton restart = new ImageButton(skin,"replay");
        restart.addListener(new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y) {
                //System.out.println(level);
                switch(level){
                    case 0:
                        game.setScreen(new Beginner(game));
                        break;
                    case 1:
                        game.setScreen(new Intermediate(game));
                        break;
                    case 2:
                        game.setScreen(new Advanced(game));
                        break;
                }
            }
        });
        if(isWin)
            clear = new Label("Level Clear",skin,"levelClear");
        else
            clear = new Label("Game\n Over" , skin, "levelClear");
        clear.setFontScale(1.5f);
        //window.debug();
        //window.getTitleLabel().
        window.add(clear).colspan(3).spaceBottom(20).row();
        window.add(home).width(75).height(75).pad(20);
        window.add(levelBtn).width(75).height(75).pad(20);
        window.add(restart).width(75).height(75).pad(20);
        window.pack();

        /*atlas.dispose();
        skin.dispose();*/
    }

    public void dispose(){
        atlas.dispose();
        skin.dispose();
    }


}
