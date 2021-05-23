package org.example.Menedzsment;

import org.example.Raktar.RaktarTer;
import org.example.Termek.Termek;

public class AruMenedzser implements Figyelo{
    RaktarTer figyelendoraktar;


    public AruMenedzser(RaktarTer ter){
        this.figyelendoraktar = ter;
    }

    @Override
    public void update(Termek termek, int ujMennyiseg) {
        System.out.println("A(z) "+termek+" mennyisége "+figyelendoraktar.getTermek(termek).getMennyiseg()+"-ről "
                +ujMennyiseg+"-re változott");
        figyelendoraktar.getTermek(termek).setMennyiseg(ujMennyiseg);
    }
}
