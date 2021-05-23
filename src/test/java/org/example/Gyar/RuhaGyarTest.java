package org.example.Gyar;

import org.example.Termek.Enumok.Ruhatype;
import org.example.Termek.Ruha;
import org.example.Termek.Termek;
import org.junit.Assert;
import org.junit.Test;

public class RuhaGyarTest {
    @Test
    public void testAddAndGetTermek() throws Exception {
        GyarTer HM = new RuhaGyar("AM88");

        Termek ruha = new Ruha(Ruhatype.RUHA,"44268",6899,85);
        System.out.println("Új termék hozzáadva a gyártandó termékek listájához: ");
        HM.addTermek(ruha);
        Termek polo = new Ruha(Ruhatype.FELSO,"33587",2599,22);
        HM.addTermek(polo);

        Assert.assertEquals(HM.getTermek(polo),polo);
        System.out.println("Az ADD és a GET műveletek helyesen lefutottak");

    }

    @Test
    public void testRemoveTermek() throws Exception {
        GyarTer HM = new RuhaGyar("HM88");

        Termek ruha = new Ruha(Ruhatype.RUHA,"44268",6899,85);
        System.out.println("Új termék hozzáadva a gyártandó termékek listájához: ");
        HM.addTermek(ruha);
        Termek polo = new Ruha(Ruhatype.FELSO,"33587",2599,22);
        HM.addTermek(polo);

        HM.removeTermek(ruha);
        Assert.assertEquals(HM.getSzamolo(),1);
        System.out.println("A REMOVE művelet helyesen lefutott");
    }

    @Test
    public void testGetSzamolo() throws Exception {
        GyarTer HM = new RuhaGyar("AM88");

        Termek ruha = new Ruha(Ruhatype.RUHA,"44268",6899,85);
        System.out.println("Új termék hozzáadva a gyártandó termékek listájához: ");
        HM.addTermek(ruha);
        Termek polo = new Ruha(Ruhatype.FELSO,"33587",2599,22);
        HM.addTermek(polo);

        Assert.assertEquals(HM.getSzamolo(),2);
        System.out.println("A gyártandó termékek listaszámlálója helyesen működik");
    }
}