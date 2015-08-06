package com.scbcn;

/**
 * Created by duber on 06/08/15.
 */
public class TamagotchiFactory {

    public static Tamagotchi CreateFullTamagotchi(){
        int initialHungry = 0;
        int initialFullness = 100;
        int initialHappiness = 0;
        int initialTiredness = 0;
        return new Tamagotchi(initialHungry,initialFullness, initialHappiness, initialTiredness);
    }

    public static Tamagotchi CreateATamagotchi(){
        int initialHungry = 50;
        int initialFullness = 50;
        int initialHappiness = 0;
        int initialTiredness = 0;
        return new Tamagotchi(initialHungry,initialFullness, initialHappiness, initialTiredness);
    }

    public static Tamagotchi CreateAFullHappinessTamagotchi() {
        int initialHungry = 0;
        int initialFullness = 0;
        int initialHappiness = 100;
        int initialTiredness = 0;
        return new Tamagotchi(initialHungry,initialFullness,initialHappiness, initialTiredness );
    }

    public static Tamagotchi CreateAFullTiredTamagotchi() {
        int initialHungry = 0;
        int initialFullness = 0;
        int initialHappiness = 100;
        int initialTiredness = 100;
        return new Tamagotchi(initialHungry,initialFullness,initialHappiness, initialTiredness);
    }
}
