package org.example.Termek;

import org.example.GyarFactory.GyarTerType;
import org.example.Termek.Enumok.HomersekletType;
import org.example.Termek.Enumok.TVType;

public class TV implements Termek{
    private TVType kategoria;
    private String cikkszam;
    private int ar;
    private int mennyiseg;
    private GyarTerType tipus = GyarTerType.ELEKTRONIKUS;

    public TV(TVType kategoria, String cikkszam, int ar, int mennyiseg){
        this.kategoria = kategoria;
        this.cikkszam = cikkszam;
        this.ar = ar;
        this.mennyiseg = mennyiseg;
    }

    @Override
    public boolean getTorekeny() {

        System.out.println("A termék törékeny? "+ true);
        return true;
    }

    @Override
    public HomersekletType getHomerseklet() {
        System.out.println("A termék ezen a hőmérsékleten tárolható: "+HomersekletType.SZOBA);
        return HomersekletType.SZOBA;
    }

    @Override
    public GyarTerType getTipus() {
        System.out.println("A termék ilyen gyárakban készülhet: "+GyarTerType.ELEKTRONIKUS);
        return tipus;
    }

    @Override
    public int getAr() {
        System.out.println("A termék egységára: "+ar);
        return ar;
    }

    @Override
    public int getMennyiseg() {
        System.out.println("A termékből elérhető mennyiség: "+mennyiseg);
        return mennyiseg;
    }

    @Override
    public void setMennyiseg(int szam) {
        System.out.println("A termékből elérhető új mennyiség: "+mennyiseg);
        this.mennyiseg = szam;
    }

    public TVType getKategoria(){
        System.out.println("A termék kategóriája: "+kategoria);
        return kategoria;
    }

    public String getCikkszam() {
        System.out.println("A termék cikkszáma: "+cikkszam);
        return cikkszam;
    }

    public String toString(){
        return String.format("Kategoria: "+getKategoria()+" Cikkszám: "+getCikkszam()+
                " Egységár: "+getAr()+" Mennyiség: "+getMennyiseg());
    }
}
