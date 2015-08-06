package com.scbcn;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by duber on 06/08/15.
 */
public class GivenIHaveATamagotchiWhenIPlayWithIt {

    @Test
    public void then_Its_Happiness_Increases(){
        Tamagotchi tamagotchi = TamagotchiFactory.CreateATamagotchi();
        int initialHappiness = tamagotchi.getHappiness();

        tamagotchi.play();

        Assert.assertEquals(true, initialHappiness < tamagotchi.getHappiness());
    }

}
