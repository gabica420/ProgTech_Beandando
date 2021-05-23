package org.example.VevoFactory;

import org.junit.Test;

import static org.junit.Assert.*;

public class VevoFactoryTest {
    @Test
    public void testKeszitHetkoznapiVevo(){
        VevoFactory.keszitVevo(VevoType.HETKOZNAPI,"SS_VV_D","Kiss Róbert","Százholdas Pagony Micimackó háza",
                "Galambposta");
    }

}