package org.example.Gyar;

import org.example.GyarFactory.GyarTerType;
import org.example.Termek.Termek;

import java.util.ArrayList;

public class ElektronikusGyar implements GyarTer {
    private ArrayList<Termek> gyartandoTermekList;
    private GyarTerType tipus = GyarTerType.ELEKTRONIKUS;
    private String id;

    public ElektronikusGyar(String id){
        this.id = id;
        this.gyartandoTermekList = new ArrayList<Termek>();

    }
    @Override
    public Termek getTermek(Termek termek) {
        int szam = gyartandoTermekList.indexOf(termek);
        System.out.println("A keresett termék: "+gyartandoTermekList.get(szam).toString());
        return gyartandoTermekList.get(szam);
    }

    @Override
    public void addTermek(Termek termek) throws Exception {
        if(termek.getTipus() == GyarTerType.ELEKTRONIKUS) {
            gyartandoTermekList.add(termek);
            System.out.println("A termék sikeresen hozzá lett adva a listához.");
        }
        else throw new Exception("Ebben a gyárban nem gyárthatnak ilyen terméket!");
    }

    @Override
    public void removeTermek(Termek termek) {
        gyartandoTermekList.remove(termek);
        System.out.println("A termék sikeresen kikerült a listáról.");
    }

    @Override
    public int getSzamolo() {
        return gyartandoTermekList.size();
    }
}
