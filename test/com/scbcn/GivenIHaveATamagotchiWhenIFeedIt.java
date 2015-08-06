package com.scbcn;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by duber on 06/08/15.
 */
public class GivenIHaveATamagotchiWhenIFeedIt {

    @Test
    public void then_Its_Hungriness_Is_Decreased(){
        Tamagotchi tamagotchi = TamagotchiFactory.CreateATamagotchi();
        int initialHungriness = tamagotchi.getHungriness();

        tamagotchi.feed();

        Assert.assertEquals(true, initialHungriness > tamagotchi.getHungriness());
    }

    @Test
    public void then_Its_Fullness_Is_Increased()
    {
        Tamagotchi tamagotchi = TamagotchiFactory.CreateATamagotchi();
        int initialFullness = tamagotchi.getFullness();

        tamagotchi.feed();

        Assert.assertEquals(true, initialFullness < tamagotchi.getFullness() );
    }

    @Test
    public void and_Its_Full_Then_Nothing_Happens(){
        Tamagotchi tamagotchi = TamagotchiFactory.CreateFullTamagotchi();

        tamagotchi.feed();

        Assert.assertEquals(100, tamagotchi.getFullness());
    }



    @Test
    public void and_Is_Not_Hungry_Then_Nothing_Happens(){
        Tamagotchi tamagotchi = TamagotchiFactory.CreateFullTamagotchi();

        tamagotchi.feed();

        Assert.assertEquals(0, tamagotchi.getHungriness());
    }
}
