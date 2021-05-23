package org.example.Termek;

import org.example.GyarFactory.GyarTerType;
import org.example.Termek.Enumok.HomersekletType;
import org.example.Termek.Enumok.Ruhatype;
import org.junit.Assert;
import org.junit.Test;

public class RuhaTest {

    @Test
    public void testGetKategoria(){
        Ruha darab = new Ruha(Ruhatype.FELSO,"55879",3400,50);

        Assert.assertEquals(Ruhatype.FELSO, darab.getKategoria());
    }

    @Test
    public void testGetCikkszam(){
        Ruha darab = new Ruha(Ruhatype.FELSO, "55478", 2600,66);

        Assert.assertEquals("55478",darab.getCikkszam());
    }

    @Test
    public void testGetAr(){
        Ruha darab = new Ruha(Ruhatype.ALSO,"44785",7500,34);

        Assert.assertEquals(7500,darab.getAr());
    }

    @Test
    public void testGetTorekeny(){
        Ruha darab = new Ruha(Ruhatype.FELSO,"44365", 2300,57);

        boolean torekenye = false;
        Assert.assertEquals(torekenye,darab.getTorekeny());
    }

    @Test
    public void testGetHomerseklet(){
        Ruha darab = new Ruha(Ruhatype.ALSO,"02145",8400,74);
        HomersekletType homerseklet = HomersekletType.SZOBA;

        Assert.assertEquals(homerseklet,darab.getHomerseklet());
    }

    @Test
    public void testSetMennyiseg(){
        Ruha darab = new Ruha(Ruhatype.ALSO,"02145",8400,74);
        int regiMennyiseg = darab.getMennyiseg();

        darab.setMennyiseg(55);
        int ujMennyiseg = darab.getMennyiseg();

        Assert.assertNotEquals(regiMennyiseg,ujMennyiseg);
    }

    @Test
    public void testGetTipus(){
        Ruha peldany = new Ruha(Ruhatype.FELSO,"44365", 2300,57);

        GyarTerType tipus = GyarTerType.RUHA;
        Assert.assertEquals(tipus,peldany.getTipus());
    }
}