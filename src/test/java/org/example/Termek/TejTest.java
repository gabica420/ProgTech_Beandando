package org.example.Termek;


import org.example.GyarFactory.GyarTerType;
import org.example.Termek.Enumok.FejhallgatoType;
import org.example.Termek.Enumok.HomersekletType;
import org.example.Termek.Enumok.Ruhatype;
import org.example.Termek.Enumok.TejType;
import org.junit.Assert;
import org.junit.Test;

public class TejTest {

    @Test
    public void testGetKategoria(){
        Tej kostolo = new Tej(TejType.HOKEZELT,1.0,1.5,230,60);

        Assert.assertEquals(TejType.HOKEZELT,kostolo.getKategoria());
    }

    @Test
    public void testGetTorekeny(){
        Tej kostolo = new Tej(TejType.HUTOTT, 1.5,3.2,300,40);

        boolean torekenye = false;
        Assert.assertEquals(torekenye,kostolo.getTorekeny());
    }

    @Test
    public void testGetHomerseklet(){
        Tej kostolo = new Tej(TejType.HOKEZELT,2.0,3.2,320,76);

        HomersekletType homerseklet = HomersekletType.SZOBA;
        Assert.assertEquals(homerseklet,kostolo.getHomerseklet());
    }

    @Test
    public  void testGetAr(){
        Tej kostolo = new Tej(TejType.HUTOTT,0.5,1.5,190,30);

        Assert.assertEquals(190,kostolo.getAr());
    }

    @Test
    public void testGetMennyiseg(){
        Tej kostolo = new Tej(TejType.HOKEZELT,0.75,2.8,210,60);

        Assert.assertEquals(60,kostolo.getMennyiseg());
    }

    @Test
    public void testGetKiszereles(){
        Tej kostolo = new Tej(TejType.HOKEZELT,2.5,2.8,250,70);

        Assert.assertEquals(2.5,kostolo.getKiszereles(),0);
    }

    @Test
    public void testGetZsirtartalom(){
        Tej kostolo = new Tej(TejType.HOKEZELT,2.5,3.2,280,10);

        Assert.assertEquals(3.2,kostolo.getZsirtartalom(),0);
    }

    @Test
    public void testSetMennyiseg(){
        Tej kostolo = new Tej(TejType.HOKEZELT,2.5,3.2,280,10);
        int regiMennyiseg = kostolo.getMennyiseg();

        kostolo.setMennyiseg(20);
        int ujMennyiseg = kostolo.getMennyiseg();

        Assert.assertNotEquals(regiMennyiseg,ujMennyiseg);
    }

    @Test
    public void testGetTipus(){
        Tej kostolo = new Tej(TejType.HUTOTT,0.5,1.5,190,30);

        GyarTerType tipus = GyarTerType.ELELMISZER;
        Assert.assertEquals(tipus,kostolo.getTipus());
    }
}