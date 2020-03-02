package com.mygdx.game.chooselevels;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.audio.Sound;
import com.mygdx.game.MyGdxGame;
import com.mygdx.game.scenes.Hud;
import com.mygdx.game.scenes.LevelClear;
import com.mygdx.game.screens.GameScreens;

public class Intermediate extends GameScreens implements Screen {
    private static final int STAGE_LEVEL = 1;

    public Intermediate(MyGdxGame game){
        super(game);
        hud = new Hud(game.batch,STAGE_LEVEL);

    }

    @Override
    public void show() {
        super.show();

    }

    private void update(float delta){
        hud.update(delta);
    }

    @Override
    public void render(float delta) {
        update(delta);
        super.render();

        if(hud.isTimeUp())
            hud.isFinished = true;
        if(hud.isFinished){
            hud.timerStop = true;
            if(!hud.isWin && hud.health >0 && hud.tune) {
                MyGdxGame.assets.get("audio/fail.wav", Sound.class).play();
                hud.tune=false;
            }
            levelClear = new LevelClear(game,this, STAGE_LEVEL, hud.isWin);
            //Gdx.input.setInputProcessor();
            stage.addActor(levelClear.window);
            stage.act();
            stage.draw();

        }
    }

    @Override
    public void resize(int width, int height) {
        stage.getViewport().update(width,height,true);

        table.invalidateHierarchy();

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
        game.dispose();
        bg.dispose();
        skin.dispose();
        stage.dispose();
        atlas.dispose();
    }
}
