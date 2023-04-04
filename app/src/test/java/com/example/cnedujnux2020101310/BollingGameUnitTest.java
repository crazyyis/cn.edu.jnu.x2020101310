package com.example.cnedujnux2020101310;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class BollingGameUnitTest {
    @Test
    public void test20zeros() {
        BollingGame game=new BollingGame();
        for(int i=0;i<20;i++)
        {
            game.roll(0);
        }
        assertEquals(0,game.score());
    }
    @Test
    public void test20ones() {
        BollingGame game=new BollingGame();
        for(int i=1;i<20;i++)
        {
            game.roll(0);
        }
        assertEquals(0,game.score());
    }
}