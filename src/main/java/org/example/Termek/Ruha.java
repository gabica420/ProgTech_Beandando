package org.example.Termek;

import org.example.GyarFactory.GyarTerType;
import org.example.Termek.Enumok.HomersekletType;
import org.example.Termek.Enumok.Ruhatype;

public class Ruha implements Termek{
    private Ruhatype kategoria;
    private String cikkszam;
    private int ar;
    private int mennyiseg;
    private GyarTerType tipus = GyarTerType.RUHA;

    public Ruha(Ruhatype kategoria, String cikkszam, int ar, int mennyiseg) {
        this.kategoria = kategoria;
        this.cikkszam = cikkszam;
        this.ar = ar;
        this.mennyiseg = mennyiseg;
    }

    @Override
    public boolean getTorekeny() {
        System.out.println("A termék törékeny? "+false);
        return false;
    }

    @Override
    public HomersekletType getHomerseklet() {
        System.out.println("A termék ezen a hőmérsékleten tárolható: "+HomersekletType.SZOBA);
        return HomersekletType.SZOBA;
    }

    @Override
    public GyarTerType getTipus() {
        System.out.println("A termék ilyen gyárban készülhet: "+GyarTerType.RUHA);
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
        this.mennyiseg = szam;
        System.out.println("A termékből elérhető új mennyiség: "+mennyiseg);
    }

    public String getCikkszam() {
        System.out.println("A termék cikkszáma: "+cikkszam);
        return cikkszam;
    }

    public Ruhatype getKategoria(){
        System.out.println("A termék kategóriája: "+kategoria);
        return kategoria;}

    @Override
    public String toString(){
        return String.format("Kategoria: "+getKategoria()+" Cikkszám: "+getCikkszam()+
                " Egységár: "+getAr()+" Mennyiség: "+getMennyiseg());
    }

}
