package org.example.RaktarFactory;

import org.example.Raktar.RaktarTer;
import org.junit.Assert;
import org.junit.Test;

public class RaktarFactoryTest {
    @Test
    public void testKeszitSimaRaktarTer(){
       RaktarTer raktar = RaktarFactory.keszitRaktarTer(RaktarTerType.SIMA, "DI76","Tiszakécseg");

       Assert.assertEquals(raktar.getID(),"DI76");
        System.out.println("A raktártér azonosítója: "+raktar.getID());
       Assert.assertEquals(raktar.getHelyszin(), "Tiszakécseg");
        System.out.println("A raktártér helyszíne: "+raktar.getHelyszin());
    }

    @Test
    public void testKeszitHutottRaktarTer(){
        RaktarTer hutott = RaktarFactory.keszitRaktarTer(RaktarTerType.HUTOTT, "FR99","ZöldPatak");

        Assert.assertEquals(hutott.getID(),"FR99");
        System.out.println("A raktártér azonosítója: "+hutott.getID());
        Assert.assertEquals(hutott.getHelyszin(), "ZöldPatak");
        System.out.println("A raktártér helyszíne: "+hutott.getHelyszin());
    }

}