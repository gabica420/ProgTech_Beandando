package org.example.Termek;

import org.example.GyarFactory.GyarTerType;
import org.example.Termek.Enumok.FejhallgatoType;
import org.example.Termek.Enumok.HomersekletType;
import org.junit.Assert;
import org.junit.Test;

public class FejhallgatoTest {
    @Test
    public void testGetKategoria(){
        Fejhallgato peldany = new Fejhallgato(FejhallgatoType.BLUETOOTH,"33120",32000,12);

        Assert.assertEquals(FejhallgatoType.BLUETOOTH,peldany.getKategoria());
    }

    @Test
    public void testGetCikkszam(){
        Fejhallgato peldany = new Fejhallgato(FejhallgatoType.VEZETEKES,"98752",7600,62);

        Assert.assertEquals("98752",peldany.getCikkszam());
    }

    @Test
    public void testGetAr(){
        Fejhallgato peldany = new Fejhallgato(FejhallgatoType.VEZETEKES,"22640",5200,56);

        Assert.assertEquals(55870,peldany.getAr());
    }

    @Test
    public void  testGetTorekeny(){
        Fejhallgato peldany = new Fejhallgato(FejhallgatoType.BLUETOOTH,"88970",29540,45);

        boolean torekenye = true;
        Assert.assertEquals(torekenye,peldany.getTorekeny());
    }

    @Test
    public void testGetHomerseklet(){
        Fejhallgato peldany = new Fejhallgato(FejhallgatoType.BLUETOOTH,"12355",42380,59);

        HomersekletType homerseklet = HomersekletType.SZOBA;
        Assert.assertEquals(homerseklet,peldany.getHomerseklet());
    }

    @Test
    public void testSetMennyiseg(){
        Fejhallgato peldany = new Fejhallgato(FejhallgatoType.VEZETEKES,"12355",10530,45);
        int regiMennyiseg = peldany.getMennyiseg();

        peldany.setMennyiseg(8);
        int ujMennyiseg = peldany.getMennyiseg();

        Assert.assertNotEquals(regiMennyiseg,ujMennyiseg);
    }

    @Test
    public void testGetTipus(){
        Fejhallgato peldany = new Fejhallgato(FejhallgatoType.BLUETOOTH,"12355",42380,59);

       GyarTerType tipus = GyarTerType.ELEKTRONIKUS;
        Assert.assertEquals(tipus,peldany.getTipus());
    }

}