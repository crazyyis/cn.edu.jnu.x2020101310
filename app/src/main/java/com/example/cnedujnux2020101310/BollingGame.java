package com.example.cnedujnux2020101310;

public class BollingGame {
    int score=0;
    public void roll(int pins) {
        score+=pins;
    }

    public int score() {
        return score;
    }
}
