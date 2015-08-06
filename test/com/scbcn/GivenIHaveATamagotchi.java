package com.scbcn;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by duber on 06/08/15.
 */
public class GivenIHaveATamagotchi {

    @Test
    public void when_I_Feed_It_Then_Its_Hungriness_Is_Decreased(){
        Tamagotchi tamagotchi = new Tamagotchi();
        int initialHungriness = tamagotchi.getHungriness();

        tamagotchi.feed();

        Assert.assertEquals(true, initialHungriness > tamagotchi.getHungriness());
    }

    @Test
    public void when_I_Feed_It_Then_Its_Fullness_IsIncreased()
    {
        Tamagotchi tamagotchi = new Tamagotchi();
        int initialFullness = tamagotchi.getFullness();

        tamagotchi.feed();

        Assert.assertEquals(true, initialFullness < tamagotchi.getFullness() );
    }
}
