package com.scbcn;

/**
 * Created by duber on 06/08/15.
 */
public class Tamagotchi {
    private static final int MAX_FULLNESS = 100;
    private static final int MIN_HUNGRINESS = 0;
    public static final int MAX_HAPPINESS = 100;
    private int hungriness;
    private int fullness;
    private int happiness;


    public Tamagotchi(int initialHungry, int initialFullness, int initialHappiness) {
        this.hungriness = initialHungry;
        this.fullness = initialFullness;
        this.happiness = initialHappiness;
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

    public int getHappiness() {
        return happiness;
    }

    public void play() {
        if (!IsFullyHappy()) {
            happiness++;
        }

    }

    private boolean IsFullyHappy() {
        return happiness == MAX_HAPPINESS;
    }
}
