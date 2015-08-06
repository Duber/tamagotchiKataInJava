package com.scbcn;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by duber on 06/08/15.
 */
public class GivenIHaveATamagotchi {

    @Test
    public void when_I_Feed_It_Then_Its_Hungriness_Is_Decreased(){
        Tamagotchi tamagotchi = TamagotchiFactory.CreateATamagotchi();
        int initialHungriness = tamagotchi.getHungriness();

        tamagotchi.feed();

        Assert.assertEquals(true, initialHungriness > tamagotchi.getHungriness());
    }

    @Test
    public void when_I_Feed_It_Then_Its_Fullness_Is_Increased()
    {
        Tamagotchi tamagotchi = TamagotchiFactory.CreateATamagotchi();
        int initialFullness = tamagotchi.getFullness();

        tamagotchi.feed();

        Assert.assertEquals(true, initialFullness < tamagotchi.getFullness() );
    }

    @Test
    public void when_I_Feed_It_And_Its_Full_Then_Nothing_Happens(){
        Tamagotchi tamagotchi = TamagotchiFactory.CreateFullTamagotchi();

        tamagotchi.feed();

        Assert.assertEquals(100, tamagotchi.getFullness());
    }

    @Test
    public void when_I_Ask_For_Its_Fullness_Then_Fullness_Doesnt_Change(){

        Tamagotchi tamagotchi = TamagotchiFactory.CreateATamagotchi();

        tamagotchi.getFullness();

        Assert.assertEquals(50, tamagotchi.getFullness());

    }

    @Test
    public void when_I_Feed_It_And_Is_Not_Hungry_Then_Nothing_Happens(){
        Tamagotchi tamagotchi = TamagotchiFactory.CreateFullTamagotchi();

        tamagotchi.feed();

        Assert.assertEquals(0, tamagotchi.getHungriness());
    }
}
