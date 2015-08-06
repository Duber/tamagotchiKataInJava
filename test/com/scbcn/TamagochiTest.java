package com.scbcn;

import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by duber on 06/08/15.
 */
public class TamagochiTest {

    @Test
    public void DummyTest(){
        Assert.assertTrue(true);
    }

    @Test
    public void when_I_Ask_For_Its_Fullness_Then_Fullness_Doesnt_Change(){

        Tamagotchi tamagotchi = TamagotchiFactory.CreateATamagotchi();

        tamagotchi.getFullness();

        org.junit.Assert.assertEquals(50, tamagotchi.getFullness());

    }

}
