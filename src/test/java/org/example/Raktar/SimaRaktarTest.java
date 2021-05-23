package org.example.Raktar;


import org.example.Menedzsment.AruMenedzser;
import org.example.Menedzsment.Figyelo;
import org.example.Termek.*;
import org.example.Termek.Enumok.*;
import org.junit.Assert;
import org.junit.Test;

public class SimaRaktarTest {

    @Test
    public void testGetID(){
        SimaRaktar raktar = new SimaRaktar("JU02","Stockholm");

        Assert.assertEquals("JU02",raktar.getID());
    }

    @Test
    public void testGetHelyszin(){
        SimaRaktar raktar = new SimaRaktar("DE77","Brema");

        Assert.assertEquals("Brema",raktar.getHelyszin());
    }

    @Test
    public void testAddTermek() throws Exception {
        SimaRaktar raktar = new SimaRaktar("EW30","Szentpétervár");

        Ruha darab = new Ruha(Ruhatype.RUHA,"55789",8700,35);
        raktar.addTermek(darab);

        Assert.assertEquals(darab,raktar.getTermek(darab));
    }

    @Test
    public void testRemoveTermek() throws Exception {
        SimaRaktar raktar = new SimaRaktar("EC09","Marosvásárhely");

        Ruha darab = new Ruha(Ruhatype.RUHA,"55789",8700,35);
        raktar.addTermek(darab);
        TV uj = new TV(TVType.OKOS,"57896",195780,40);
        raktar.addTermek(uj);
        TV regi = new TV(TVType.HAGYOMANYOS,"22476",85000,20);
        raktar.addTermek(regi);
        int szamolo = raktar.getSzamolo();
        raktar.removeTermek(regi);
        int szamolo2 = raktar.getSzamolo();

        Assert.assertNotEquals(szamolo,szamolo2);
    }

    @Test
    public void testGetTermek() throws Exception {
        SimaRaktar raktar = new SimaRaktar("EC09","Marosvásárhely");

        Ruha darab = new Ruha(Ruhatype.RUHA,"55789",8700,35);
        raktar.addTermek(darab);
        TV uj = new TV(TVType.OKOS,"57896",195780,40);
        raktar.addTermek(uj);
        TV regi = new TV(TVType.HAGYOMANYOS,"22476",85000,20);
        raktar.addTermek(regi);
        Tej hokezelt = new Tej(TejType.HOKEZELT,0.5,1.8,220,30);
        raktar.addTermek(hokezelt);

        Assert.assertEquals(regi,raktar.getTermek(regi));
    }

    @Test
    public void testGetSzamlalo() throws Exception {
        SimaRaktar raktar = new SimaRaktar("EC09","Marosvásárhely");

        Ruha darab = new Ruha(Ruhatype.RUHA,"55789",8700,35);
        raktar.addTermek(darab);
        TV uj = new TV(TVType.OKOS,"57896",195780,40);
        raktar.addTermek(uj);
        TV regi = new TV(TVType.HAGYOMANYOS,"22476",85000,20);
        raktar.addTermek(regi);
        Tej hokezelt = new Tej(TejType.HOKEZELT,0.5,1.8,220,30);
        raktar.addTermek(hokezelt);

        Assert.assertEquals(4,raktar.getSzamolo());
    }

    @Test
    public void testAddFigyelo(){
        SimaRaktar raktar = new SimaRaktar("EC09","Marosvásárhely");
        Figyelo figyelmes = new AruMenedzser(raktar);

        raktar.addFigyelo(figyelmes);
    }

    @Test
    public void testRemoveFigyelo(){
        SimaRaktar raktar = new SimaRaktar("EC09","Marosvásárhely");

        Figyelo figyelmes = new AruMenedzser(raktar);
        raktar.addFigyelo(figyelmes);

        Figyelo figyelo = new AruMenedzser(raktar);
        raktar.addFigyelo(figyelo);

        raktar.removeFigyelo(figyelmes);
    }

    @Test
    public void testErtesitFigyelo() throws Exception {
        SimaRaktar raktar = new SimaRaktar("EC09","Marosvásárhely");
        Figyelo figyelmes = new AruMenedzser(raktar);

        raktar.addFigyelo(figyelmes);

        Termek termek = new Fejhallgato(FejhallgatoType.BLUETOOTH,"89632", 22000, 220);
        raktar.addTermek(termek);
        raktar.ertesitFigyelo(termek, 20);
        raktar.getTermek(termek).getMennyiseg();
    }

}