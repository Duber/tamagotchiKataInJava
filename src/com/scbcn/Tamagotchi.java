package com.scbcn;

/**
 * Created by duber on 06/08/15.
 */
public class Tamagotchi {
    private int hungriness;
    private int fullness;

    public int getHungriness() {
        return hungriness;
    }

    public void feed() {
        hungriness--;

    }

    public int getFullness() {
        return fullness++;
    }
}
