package com.start.designpattern.behavioral.StatePattern.demo;

/**
 * 电视遥控器，含有开机、关机、下—频道、上—频道、调高音量、调低音量这几个功能
 */
public class TvController1 {

    // 开机状态
    private final static int POWER_ON = 1;
    // 关机状态
    private final static int POWER_OFF = 2;
    private int mState = POWER_OFF;

    public void powerOn() {
        mState = POWER_ON;
        if (mState == POWER_OFF) {
            System.out.println("开机啦");
        }
    }

    public void powerOff() {
        mState = POWER_OFF;
        if (mState == POWER_ON) {
            System.out.println("关机啦");
        }
    }

    public void nextChannel() {
        if (mState == POWER_ON) {
            System.out.println("下—频道");
        } else {
            System.out.println("两个红灯提示没有开机");
        }
    }

    public void prevChannel() {
        if (mState == POWER_ON) {
            System.out.println("上—频道");
        } else {
            System.out.println("两个红灯提示没有开机");
        }
    }

    public void turnUp() {
        if (mState == POWER_ON) {
            System.out.println("调高音量");
        } else {
            System.out.println("两个红灯提示没有开机");
        }
    }

    public void turnDown() {
        if (mState == POWER_ON) {
            System.out.println("调低音量");
        } else {
            System.out.println("两个红灯提示没有开机");
        }
    }
}