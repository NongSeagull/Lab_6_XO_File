/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab_6_xo_file;

/**
 *
 * @author 65160230 Piyapong
 */
public class XOPlayer {

    private char player;
    private int winTimes;
    private int loseTimes;
    private int drawTimes;

    public XOPlayer() {
        this.player = ' ';
        this.winTimes = 0;
        this.loseTimes = 0;
        this.drawTimes = 0;
    }

    public XOPlayer(char symbol) {
        this.player = symbol;
    }

    public char getSymbol() {
        return player;
    }

    public int getWinTimes() {
        return winTimes;
    }

    public int getLoseTimes() {
        return loseTimes;
    }

    public int getDrawTimes() {
        return drawTimes;
    }

    public void countWinTimes() {
        this.winTimes += 1;
    }

    public void countLoseTimes() {
        this.loseTimes += 1;
    }

    public void countDrawTimes() {
        this.drawTimes += 1;
    }

    @Override
    public String toString() {
        return "Player " + player + " - Wins: " + winTimes + ", Losses: " + loseTimes + ", Draws: " + drawTimes;
    }
}
