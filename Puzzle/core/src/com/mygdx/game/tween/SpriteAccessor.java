package com.mygdx.game.tween;

import com.badlogic.gdx.graphics.g2d.Sprite;

import aurelienribon.tweenengine.TweenAccessor;

public class SpriteAccessor implements TweenAccessor<Sprite> {

    public static final int ALPHA = 0;
    public static final int Y = 1;
    public static final int X = 2;

    @Override
    public int getValues(Sprite target, int tweenType, float[] returnValues) {
        switch(tweenType){
            case ALPHA:
                returnValues[0] = target.getColor().a;
                return 1;
            case Y:
                returnValues[0] = target.getY();
                return 1;
            case X:
                returnValues[0] = target.getX();
                return 1;
            default:
                assert false;
                return -1;
        }
    }

    @Override
    public void setValues(Sprite target, int tweenType, float[] newValues) {
        switch(tweenType){
            case ALPHA:
                target.setColor(target.getColor().r,target.getColor().g,target.getColor().b,newValues[0]);
                break;
            case Y:
                target.setY(newValues[0]);
                break;
            case X:
                target.setX(newValues[0]);
                break;
            default:
                assert false;
                break;
        }
    }
}
