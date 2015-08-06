package com.scbcn;

/**
 * Created by duber on 06/08/15.
 */
public class Tamagotchi {
    private static final int MAX_FULLNESS = 100;
    private int hungriness;
    private int fullness;


    public Tamagotchi(int hungriness, int fullness) {
        this.hungriness = hungriness;
        this.fullness = fullness;
    }

    public int getHungriness() {
        return hungriness;
    }

    public void feed() {
        hungriness--;
        if (fullness < MAX_FULLNESS) {
            fullness++;
        }

    }

    public int getFullness() {
        return fullness;
    }
}
