package com.mygdx.game.scenes;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.utils.Disposable;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.mygdx.game.MyGdxGame;

public class Hud implements Disposable {
    //Scene2D.ui Stage and its own Viewport for HUD
    public Stage stage;
    private Viewport viewport;

    private Integer worldTimer;
    private boolean timeUp; // true when the world timer reaches 0
    private float timeCount;
    public Integer health;

    //scene2d
    public Label countdownLabel;
    public Label timeLabel;
    public Label healthLabel;
    public Label roomLabel;
    public Label progressLabel;

    public Label currentQuestion;
    public Integer progress;
    public Integer stageNumber;
    public Image heart[];
    private Table heartTable;

    public boolean timerStop;
    public boolean isFinished;
    public boolean isWin;
    public boolean tune;

    public Hud(SpriteBatch sb, int level){
        stageNumber = level;
        heart = new Image[]{
                new Image(new Texture("img/heart.png")),
                new Image(new Texture("img/heart.png")),
                new Image(new Texture("img/heart.png"))
        };
        tune = true;
        if(level == 1)
            worldTimer = 40;
        else if(level == 2)
            worldTimer = 20;
        else
            worldTimer = 60;
        //System.out.println(level);
        timeCount = 0;
        health = 3;
        timerStop = false;
        isWin = false;
        progress = 0;

        viewport = new FitViewport(MyGdxGame.GAME_WIDTH, MyGdxGame.GAME_HEIGHT, new OrthographicCamera());
        stage = new Stage(viewport, sb);

        //define a table used to organize our hud's labels
        Table table = new Table();
        table.top();

        //make the table fill the entire stage
        table.setFillParent(true);

        TextureAtlas atlas = new TextureAtlas("ui/colorBtn.pack");
        Skin skin = new Skin(Gdx.files.internal("ui/colorFlashSkin.json"),atlas);
        if(stageNumber == 1 || stageNumber == 2 || stageNumber == 0)
            countdownLabel = new Label(String.format("%03d", worldTimer), new Label.LabelStyle(new BitmapFont(), Color.BLACK));
        /*else if(stageNumber == 0)
            countdownLabel = new Label("NO LIMIT", new Label.LabelStyle(new BitmapFont(), Color.BLACK));*/
        timeLabel = new Label("TIME", new Label.LabelStyle(new BitmapFont(), Color.BLACK));
        roomLabel = new Label(MyGdxGame.TITLE, new Label.LabelStyle(new BitmapFont(), Color.BLACK));
        healthLabel = new Label(String.format("%03d", health),new Label.LabelStyle(new BitmapFont(), Color.BLACK));
        currentQuestion = new Label(String.format("%01d",progress) + "/20", new Label.LabelStyle(new BitmapFont(), Color.BLACK));
        progressLabel = new Label("Progress", new Label.LabelStyle(new BitmapFont(), Color.BLACK));
        heartTable = new Table();
        //heartTable.debug();
        for(int i =0;i <health;i++ )
            heartTable.add(heart[i]);

        table.add(roomLabel).expandX().padTop(10);
        table.add().expandX().padTop(10);
        table.add(timeLabel).expandX().padTop(10);

        table.row();
        table.add(heartTable).expandX();
        table.add(currentQuestion).expandX();
        table.add(countdownLabel).expandX();

        stage.addActor(table);
        skin.dispose();
        atlas.dispose();

    }

    public void update(float dt) {
        timeCount += dt;
        if (/*stageNumber != 0*/true){
            if (timeCount >= 1 && !timerStop) {
                if (worldTimer > 0) {
                    worldTimer--;
                } else {
                    timeUp = true;
                }

                countdownLabel.setText(String.format("%03d", worldTimer));
                timeCount = 0;
            }
        }

        heartTable.clear();
        for(int i =0;i <health;i++ )
            heartTable.add(heart[i]);

        //System.out.println(worldTimer);
        healthLabel.setText(String.format("%03d",health));
        currentQuestion.setText(String.format("%01d",progress) + "/20");
    }

    @Override
    public void dispose() {
        stage.dispose();

    }

    public boolean isTimeUp() {
        return timeUp;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    public Integer getHealth() {
        return health;
    }

    public Integer getProgress() {
        return progress;
    }

    public void setProgress(Integer progress) {
        this.progress = progress;
    }

}
