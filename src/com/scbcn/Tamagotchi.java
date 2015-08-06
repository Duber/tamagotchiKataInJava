package com.scbcn;

/**
 * Created by duber on 06/08/15.
 */
public class Tamagotchi {
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
        if (fullness < 100) {
            fullness++;
        }

    }

    public int getFullness() {
        return fullness;
    }
}
