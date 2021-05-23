package org.example.Gyar;

import org.example.Termek.Enumok.TejType;
import org.example.Termek.Tej;
import org.example.Termek.Termek;
import org.junit.Assert;
import org.junit.Test;

public class ElelmiszerGyarTest {

    @Test
    public void testAddAndGetTermek() throws Exception {
        GyarTer MizoGyar = new ElelmiszerGyar("EE99");

        Termek tej = new Tej(TejType.HUTOTT,1.0,2.8,220,500);
        System.out.println("Új termék hozzáadva a gyártandó termékek listájához: ");
        MizoGyar.addTermek(tej);
        Termek hokezelt = new Tej(TejType.HOKEZELT,1.5,1.9,235,431);
        MizoGyar.addTermek(hokezelt);

        Assert.assertEquals(MizoGyar.getTermek(tej),tej);
        System.out.println("Az ADD és a GET műveletek helyesen lefutottak");

    }

    @Test
    public void testRemoveTermek() throws Exception {
        GyarTer MizoGyar = new ElektronikusGyar("EE34");

        Termek tej = new Tej(TejType.HUTOTT,1.0,2.8,220,500);
        System.out.println("Új termék hozzáadva a gyártandó termékek listájához: ");
        MizoGyar.addTermek(tej);
        Termek hokezelt = new Tej(TejType.HOKEZELT,1.5,1.9,235,431);
        MizoGyar.addTermek(hokezelt);

        MizoGyar.removeTermek(tej);
        Assert.assertEquals(MizoGyar.getSzamolo(),1);
        System.out.println("A REMOVE művelet helyesen lefutott");
    }

    @Test
    public void testGetSzamolo() throws Exception {
        GyarTer MizoGyar = new ElektronikusGyar("RE43");

        Termek tej = new Tej(TejType.HUTOTT,1.0,2.8,220,500);
        System.out.println("Új termék hozzáadva a gyártandó termékek listájához: ");
        MizoGyar.addTermek(tej);
        Termek hokezelt = new Tej(TejType.HOKEZELT,1.5,1.9,235,431);
        MizoGyar.addTermek(hokezelt);

        Assert.assertEquals(MizoGyar.getSzamolo(),2);
        System.out.println("A gyártandó termékek listaszámlálója helyesen működik");
    }
}