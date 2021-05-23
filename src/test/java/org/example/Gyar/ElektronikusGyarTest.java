package org.example.Gyar;

import org.example.Termek.Enumok.FejhallgatoType;
import org.example.Termek.Enumok.TVType;
import org.example.Termek.Fejhallgato;
import org.example.Termek.TV;
import org.example.Termek.Termek;
import org.junit.Assert;
import org.junit.Test;

public class ElektronikusGyarTest {

    @Test
    public void testAddAndGetTermek() throws Exception {
        GyarTer SonyGyar = new ElektronikusGyar("GG05");

        Termek tv = new TV(TVType.OKOS, "24583",159000,440);
        SonyGyar.addTermek(tv);
        Termek fejhallgato = new Fejhallgato(FejhallgatoType.BLUETOOTH, "33658", 28990,100);
        SonyGyar.addTermek(fejhallgato);

        Assert.assertEquals(SonyGyar.getTermek(tv),tv);
        System.out.println("Az ADD és a GET műveletek helyesen lefutottak");

    }

    @Test
    public void testRemoveTermek() throws Exception {
        GyarTer SonyGyar = new ElektronikusGyar("GG12");

        Termek tv = new TV(TVType.HAGYOMANYOS, "44585",70000,20);
        SonyGyar.addTermek(tv);
        Termek fejhallgato = new Fejhallgato(FejhallgatoType.BLUETOOTH, "33658", 28990,100);
        SonyGyar.addTermek(fejhallgato);

        SonyGyar.removeTermek(tv);
        Assert.assertEquals(SonyGyar.getSzamolo(),1);
        System.out.println("A REMOVE művelet helyesen lefutott");
    }

    @Test
    public void testGetSzamolo() throws Exception {
        GyarTer SonyGyar = new ElektronikusGyar("BB54");

        Termek tv = new TV(TVType.HAGYOMANYOS, "44585",70000,20);
        SonyGyar.addTermek(tv);
        Termek fejhallgato = new Fejhallgato(FejhallgatoType.BLUETOOTH, "33658", 28990,100);
        SonyGyar.addTermek(fejhallgato);

        Assert.assertEquals(SonyGyar.getSzamolo(),2);
        System.out.println("A gyártandó termékek listaszámlálója helyesen működik");
    }
}