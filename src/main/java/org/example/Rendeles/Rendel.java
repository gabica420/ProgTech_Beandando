package org.example.Rendeles;

import org.example.Raktar.RaktarTer;
import org.example.Termek.Termek;

import java.util.ArrayList;

public class Rendel implements Rendeles{
    private RaktarTer fogadoRaktar;
    private ArrayList<Termek> megrendeltTermek;

    public Rendel(RaktarTer ter){
        this.fogadoRaktar = ter;
        this.megrendeltTermek = new ArrayList<Termek>();
    }

    @Override
    public void megrendel(Termek termek) throws Exception {
        megrendeltTermek.add(termek);
        fogadoRaktar.ertesitFigyelo(termek, termek.getMennyiseg());
    }

    @Override
    public void visszavon(Termek termek) {
        megrendeltTermek.remove(termek);
        fogadoRaktar.ertesitFigyelo(termek, termek.getMennyiseg());
    }
}
