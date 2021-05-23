package org.example.Raktar;

import org.example.Menedzsment.AruMenedzser;
import org.example.Menedzsment.Figyelo;
import org.example.Termek.*;
import org.example.Termek.Enumok.HomersekletType;
import org.example.Termek.Enumok.TejType;
import org.junit.Assert;
import org.junit.Test;

public class HutottRaktarTest {

    @Test
    public void testGetID(){
        HutottRaktar hutott = new HutottRaktar("AD44","Stuttgard");

        Assert.assertEquals("AD44",hutott.getID());
    }

    @Test
    public void testGetHelyszin(){
        HutottRaktar hutott = new HutottRaktar("FR55","Kishartyán");

        Assert.assertEquals("Kishartyán",hutott.getHelyszin());
    }

    @Test
    public void testGetHomerseklet() throws Exception {
        HutottRaktar hutott = new HutottRaktar("GT44","Almáshegy");

        hutott.setHomerseklet(HomersekletType.HUVOS);
        Assert.assertEquals(HomersekletType.HUVOS,hutott.getHomerseklet());
    }

    @Test
    public void testAddTermek() throws Exception {
        HutottRaktar hutott = new HutottRaktar("AA33", "Tokaj");

        hutott.setHomerseklet(HomersekletType.HUVOS);

        Termek proba = new Tej(TejType.HUTOTT,1.0,1.5,245,250);
        hutott.addTermek(proba);

        Assert.assertEquals(proba,hutott.getTermek(proba));
    }

    @Test
    public void testRemoveTermek() throws Exception {
        HutottRaktar hutott = new HutottRaktar("JI88","Hamburg");

        hutott.setHomerseklet(HomersekletType.HUVOS);

        Termek proba = new Tej(TejType.HUTOTT,1.5,2.8,279,124);
        hutott.addTermek(proba);
        Termek proba2 = new Tej(TejType.HUTOTT,2.0,3.2,355,230);
        hutott.addTermek(proba2);
        int szamolo = hutott.getSzamolo();
        hutott.removeTermek(proba);
        int szamolo2 = hutott.getSzamolo();

        Assert.assertNotEquals(szamolo,szamolo2);
    }

    @Test
    public void testGetTermek() throws Exception {
        HutottRaktar hutott = new HutottRaktar("DE01", "München");
        hutott.setHomerseklet(HomersekletType.HUVOS);

        Termek proba = new Tej(TejType.HUTOTT,0.7,1.5,224,124);
        hutott.addTermek(proba);
        Termek proba2 = new Tej(TejType.HUTOTT,1.0,2.8,300,230);
        hutott.addTermek(proba2);
        Termek proba3 = new Tej(TejType.HUTOTT,1.0,3.2,750,50);
        hutott.addTermek(proba3);
        Termek proba4 = new Tej(TejType.HUTOTT,1.5,3.2,356,34);
        hutott.addTermek(proba4);
        Termek proba5 = new Tej(TejType.HUTOTT,2.0,1.5,478,45);
        hutott.addTermek(proba5);

        Assert.assertEquals(proba4,hutott.getTermek(proba4));

    }

    @Test
    public void testGetSzamlalo() throws Exception {
        HutottRaktar hutott = new HutottRaktar("DE01", "München");

        hutott.setHomerseklet(HomersekletType.HUVOS);

        Termek proba = new Tej(TejType.HUTOTT,0.7,1.5,224,124);
        hutott.addTermek(proba);
        Termek proba2 = new Tej(TejType.HUTOTT,1.0,2.8,300,230);
        hutott.addTermek(proba2);
        Termek proba3 = new Tej(TejType.HUTOTT,1.0,3.2,750,50);
        hutott.addTermek(proba3);
        Termek proba4 = new Tej(TejType.HUTOTT,1.5,3.2,356,34);
        hutott.addTermek(proba4);
        Termek proba5 = new Tej(TejType.HUTOTT,2.0,1.5,478,45);
        hutott.addTermek(proba5);

        Assert.assertEquals(5,hutott.getSzamolo());
    }

    @Test
    public void testAddFigyelo() throws Exception {
        HutottRaktar hutott = new HutottRaktar("ED11","Kiskőrös");
        hutott.setHomerseklet(HomersekletType.HIDEG);
        Figyelo figyelmes = new AruMenedzser(hutott);

        hutott.addFigyelo(figyelmes);
    }

    @Test
    public void testRemoveFigyelo(){
        HutottRaktar hutott = new HutottRaktar("ED11","Kiskőrös");
        Figyelo figyelmes = new AruMenedzser(hutott);

        hutott.addFigyelo(figyelmes);

        Figyelo figyelo = new AruMenedzser(hutott);
        hutott.addFigyelo(figyelo);

        hutott.removeFigyelo(figyelmes);
    }

    @Test
    public void testErtesitFigyelo() throws Exception {
        HutottRaktar hutott = new HutottRaktar("ED11","Kiskőrös");
        Figyelo figyelmes = new AruMenedzser(hutott);
        hutott.setHomerseklet(HomersekletType.HUVOS);

        hutott.addFigyelo(figyelmes);

        Termek termek = new Tej(TejType.HUTOTT,0.5,2.8,220,600);
        hutott.addTermek(termek);
        hutott.ertesitFigyelo(termek, 400);
    }
}