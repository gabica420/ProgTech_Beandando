package org.example.Termek;

import org.example.GyarFactory.GyarTerType;
import org.example.Termek.Enumok.FejhallgatoType;
import org.example.Termek.Enumok.HomersekletType;
import org.example.Termek.Enumok.TVType;
import org.junit.Assert;
import org.junit.Test;

public class TVTest {

    @Test
    public void testGetKategoria(){
        TV peldany = new TV(TVType.HAGYOMANYOS,"33120",45000,10);

        Assert.assertEquals(TVType.HAGYOMANYOS,peldany.getKategoria());
    }

    @Test
    public void testGetCikkszam(){
        TV peldany = new TV(TVType.OKOS,"98752",145890,32);

        Assert.assertEquals("98752",peldany.getCikkszam());
    }

    @Test
    public void testGetAr(){
        TV peldany = new TV(TVType.HAGYOMANYOS,"22640",55870,41);

        Assert.assertEquals(55870,peldany.getAr());
    }

    @Test
    public void  testGetTorekeny() {
        TV peldany = new TV(TVType.OKOS, "88970", 485000, 22);

        boolean torekenye = true;
        Assert.assertEquals(torekenye, peldany.getTorekeny());
    }

    @Test
    public void testGetHomerseklet(){
        TV peldany = new TV(TVType.HAGYOMANYOS,"12355",67900,12);

        HomersekletType homerseklet = HomersekletType.SZOBA;
        Assert.assertEquals(homerseklet,peldany.getHomerseklet());
    }

    @Test
    public void testSetMennyiseg(){
        TV peldany = new TV(TVType.HAGYOMANYOS,"12355",67900,12);
        int regiMennyiseg = peldany.getMennyiseg();

        peldany.setMennyiseg(8);
        int ujMennyiseg = peldany.getMennyiseg();

        Assert.assertNotEquals(regiMennyiseg,ujMennyiseg);
    }

    @Test
    public void testGetTipus(){
        TV peldany = new TV(TVType.HAGYOMANYOS,"33120",45000,10);

        GyarTerType tipus = GyarTerType.ELEKTRONIKUS;
        Assert.assertEquals(tipus,peldany.getTipus());
    }
}