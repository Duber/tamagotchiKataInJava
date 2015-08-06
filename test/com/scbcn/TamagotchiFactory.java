package com.scbcn;

/**
 * Created by duber on 06/08/15.
 */
public class TamagotchiFactory {

    public static Tamagotchi CreateFullTamagotchi(){
        return new Tamagotchi(0, 100);
    }

    public static Tamagotchi CreateATamagotchi(){
        return new Tamagotchi(50, 50);
    }
}
