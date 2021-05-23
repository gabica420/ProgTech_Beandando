package org.example.Vevo;

import org.example.Raktar.RaktarTer;
import org.example.Raktar.SimaRaktar;
import org.example.Rendeles.Rendel;
import org.example.Rendeles.Rendeles;
import org.example.Termek.Enumok.Ruhatype;
import org.example.Termek.Ruha;
import org.example.Termek.Termek;
import org.junit.Assert;
import org.junit.Test;

public class HetkoznapiVevoTest {
    @Test
    public void testGetvevoiID(){
        HetkoznapiVevo tesztalany = new HetkoznapiVevo("AA_BB_C", "Teszt Elek","3000 Eger Leányka utca 12.",
                "tesztalany@gemailcim.hu");
        Assert.assertEquals(tesztalany.getVevoiID(),"AA_BB_C");
    }

    @Test
    public void testGetNev(){
        HetkoznapiVevo tesztalany = new HetkoznapiVevo("AA_BB_C", "Teszt Elek","3000 Eger Leányka utca 12.",
                "tesztalany@gemailcim.hu");
        Assert.assertEquals(tesztalany.getNev(),"Teszt Elek");
    }

    @Test
    public void testSetNev(){
        HetkoznapiVevo tesztalany = new HetkoznapiVevo("AA_BB_C", "Teszt Elek","3000 Eger Leányka utca 12.",
                "tesztalany@gemailcim.hu");
        String regiNev = tesztalany.getNev();
        tesztalany.modositNev("Teszt Elemér");
        Assert.assertNotEquals(tesztalany.getNev(),regiNev);
    }

    @Test
    public void testGetCim(){
        HetkoznapiVevo tesztalany = new HetkoznapiVevo("AA_BB_C", "Teszt Elek","3000 Eger Leányka utca 12.",
                "tesztalany@gemailcim.hu");
        Assert.assertEquals(tesztalany.getCim(), "3000 Eger Leányka utca 12.");
    }

    @Test
    public  void testSetCim(){
        HetkoznapiVevo tesztalany = new HetkoznapiVevo("AA_BB_C", "Teszt Elek","3000 Eger Leányka utca 12.",
                "tesztalany@gemailcim.hu");
        String regiCim = tesztalany.getCim();
        tesztalany.modositCim("3000, Eger Egészségház utca 4.");
        Assert.assertNotEquals(tesztalany.getCim(), regiCim);
    }

    @Test
    public void testGetErtesites(){
        HetkoznapiVevo tesztalany = new HetkoznapiVevo("AA_BB_C", "Teszt Elek","3000 Eger Leányka utca 12.",
                "tesztalany@gemailcim.hu");
        Assert.assertEquals(tesztalany.getErtesites(),"tesztalanyv@emailcim.hu");
    }

    @Test
    public void testSetErtesites(){
        HetkoznapiVevo tesztalany = new HetkoznapiVevo("AA_BB_C", "Teszt Elek","3000 Eger Leányka utca 12.",
                "tesztalany@gemailcim.hu");
        String regiErtesites = tesztalany.getErtesites();
        tesztalany.modositErtesites("+36703426687");
        Assert.assertNotEquals(tesztalany.getErtesites(),regiErtesites);
    }

    @Test
    public void testAddRendelesiSzam(){
        HetkoznapiVevo tesztalany = new HetkoznapiVevo("AA_BB_C", "Teszt Elek","3000 Eger Leányka utca 12.",
                "tesztalany@gemailcim.hu");
        tesztalany.addRendeles("22232426");
        Assert.assertEquals(tesztalany.getSzamolo(),1);
    }

    @Test
    public void testRemoveRendelesiSzam(){
        HetkoznapiVevo tesztalany = new HetkoznapiVevo("AA_BB_C", "Teszt Elek","3000 Eger Leányka utca 12.",
                "tesztalany@gemailcim.hu");
        tesztalany.addRendeles("22232426");
        tesztalany.removeRendeles("22232426");
        Assert.assertEquals(tesztalany.getSzamolo(),0);
    }

    @Test
    public void testGetSzamolo(){
        HetkoznapiVevo tesztalany = new HetkoznapiVevo("AA_BB_C", "Teszt Elek","3000 Eger Leányka utca 12.",
                "tesztalany@gemailcim.hu");
        tesztalany.addRendeles("22234569");
        tesztalany.addRendeles("22232426");
        Assert.assertEquals(tesztalany.getSzamolo(),2);
    }

    @Test
    public void testSetParancsRendeles() throws Exception {
        RaktarTer ter = new SimaRaktar("SS_89", "Hajdúböszörmény");
        Rendeles rend = new Rendel(ter);
        Termek termek = new Ruha(Ruhatype.FELSO,"88974",2400,24);
        ter.addTermek(termek);

        Termek megrendelt = new Ruha(Ruhatype.FELSO,"88974",2400,2);

        rend.megrendel(megrendelt);
    }

    @Test
    public void testSetParancsVisszavonas() throws Exception {
        RaktarTer ter = new SimaRaktar("SS_89", "Hajdúböszörmény");
        Rendeles rend = new Rendel(ter);
        Termek termek = new Ruha(Ruhatype.FELSO,"88974",2400,24);
        ter.addTermek(termek);

        Termek visszavon = new Ruha(Ruhatype.FELSO,"88974",2400,3);

        rend.visszavon(visszavon);
    }

}