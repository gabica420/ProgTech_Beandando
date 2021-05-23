package org.example;

import org.example.Menedzsment.AruMenedzser;
import org.example.Menedzsment.Figyelo;
import org.example.Raktar.RaktarTer;
import org.example.RaktarFactory.RaktarFactory;
import org.example.RaktarFactory.RaktarTerType;
import org.example.Rendeles.Rendel;
import org.example.Rendeles.Rendeles;
import org.example.Termek.Enumok.FejhallgatoType;
import org.example.Termek.Fejhallgato;
import org.example.Termek.Termek;
import org.example.Vevo.Vevo;
import org.example.VevoFactory.VevoFactory;
import org.example.VevoFactory.VevoType;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception {
        Vevo elso = VevoFactory.keszitVevo(VevoType.HETKOZNAPI,"VV_NN_L","Kiss Béla","Eger Virág utca 11.",
                "kiss.bela@email.cim");
        RaktarTer egyszeru = RaktarFactory.keszitRaktarTer(RaktarTerType.SIMA,"AA44","TiszaHarcsány");

        egyszeru.addTermek(new Fejhallgato(FejhallgatoType.BLUETOOTH,"55889",19990,10));
        Termek rendelt = new Fejhallgato(FejhallgatoType.BLUETOOTH,"55889",19990,1);
        Figyelo Arus = new AruMenedzser(egyszeru);
        Rendeles parancs = new Rendel(egyszeru);

        elso.addRendeles("44778899");
        elso.setRendeles(parancs.megrendel(rendelt));

    }
}
