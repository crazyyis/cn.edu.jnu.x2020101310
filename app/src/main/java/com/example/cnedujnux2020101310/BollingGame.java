package com.example.cnedujnux2020101310;

public class BollingGame {
    int rolls[] = new int[21];
    int currentRoll = 0;

    public void roll(int pins) {
        rolls[currentRoll++] = pins;

    }

    public int score() {
        int score = 0;
        int frameIndex = 0;
        for (int frame = 0; frame < 10; frame++) {
            if (frameIndex < 19) {
                if (isaSpare(frameIndex)) // spare
                {
                    score += 10 + rolls[frameIndex + 2];
                    frameIndex += 2;
                } else {
                    score += rolls[frameIndex] +
                            rolls[frameIndex + 1];
                    frameIndex += 2;
                }
            }
        }
        return score;

    }

    private boolean isaSpare(int frameIndex) {
        return rolls[frameIndex] + rolls[frameIndex + 1] == 10;
    }
}
