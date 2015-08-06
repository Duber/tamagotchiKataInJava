package com.scbcn;

/**
 * Created by duber on 06/08/15.
 */
public class Tamagotchi {
    private static final int MAX_FULLNESS = 100;
    private static final int MIN_HUNGRINESS = 0;
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
        if (IsHungry()) {
            hungriness--;
        }

        if (CanEatMore()) {
            fullness++;
        }

    }

    private boolean CanEatMore() {
        return fullness < MAX_FULLNESS;
    }

    private boolean IsHungry() {
        return hungriness > MIN_HUNGRINESS;
    }

    public int getFullness() {
        return fullness;
    }
}
