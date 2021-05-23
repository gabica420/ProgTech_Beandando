package org.example.GyarFactory;

import org.example.Gyar.GyarTer;
import org.junit.Test;

public class GyarFactoryTest {
    @Test
    public void testKeszitElektronikusGyar(){
        GyarTer elekt = GyarFactory.keszitGyarTer(GyarTerType.ELEKTRONIKUS,"ER02");
    }

    @Test
    public void testKeszitElelmiszerGyar(){
        GyarFactory.keszitGyarTer(GyarTerType.ELELMISZER,"EL02");
    }

    @Test
    public void testKeszitRuhaGyar(){
        GyarFactory.keszitGyarTer(GyarTerType.RUHA,"DR03");
    }
}