package org.example.Termek;

import org.example.GyarFactory.GyarTerType;
import org.example.Termek.Enumok.HomersekletType;
import org.example.Termek.Enumok.TejType;

public class Tej implements Termek{

    private TejType kategoria;
    private double kiszereles;
    private int ar;
    private int mennyiseg;
    private HomersekletType homerseklet;
    private double zsirtartalom;
    private GyarTerType tipus = GyarTerType.ELELMISZER;

    public Tej(TejType kategoria, double kiszereles, double zsirtartalom, int ar, int mennyiseg){
        this.kategoria = kategoria;
        this.kiszereles = kiszereles;
        this.ar = ar;
        this.mennyiseg = mennyiseg;
        this.zsirtartalom = zsirtartalom;
    }

    @Override
    public boolean getTorekeny() {
        System.out.println("A termék törékeny? "+ false);
        return false;
    }

    @Override
    public HomersekletType getHomerseklet() {
        switch (kategoria){
            case HUTOTT: this.homerseklet = HomersekletType.HUVOS;
                System.out.println("A termék ezen a hőmérsékleten lehet tárolni: "+HomersekletType.HUVOS);
            break;
            case HOKEZELT: this.homerseklet = HomersekletType.SZOBA;
                System.out.println("A termék ezen a hőmérsékleten lehet tárolni: "+HomersekletType.SZOBA);
            break;
        }
        return homerseklet;
    }

    @Override
    public GyarTerType getTipus() {
        System.out.println("A terméket ilyen gyárban lehet előállítani: "+GyarTerType.ELELMISZER);
        return tipus;
    }

    @Override
    public int getAr() {
        System.out.println("A termék egységára: "+ar);
        return ar;
    }

    @Override
    public int getMennyiseg(){
        System.out.println("A termékből elérhető mennyiség: "+ mennyiseg);
        return mennyiseg;}

    @Override
    public void setMennyiseg(int szam) {
        System.out.println("A termékből elérhető új mennyiség: "+ mennyiseg);
        this.mennyiseg = szam;
    }

    public TejType getKategoria(){
        System.out.println("A termék kategóriája: "+kategoria);
        return kategoria;
    }

    public double getKiszereles(){
        System.out.println("A termék kiszerelése: "+kiszereles);
        return kiszereles;
    }

    public double getZsirtartalom(){
        System.out.println("A termék zsírtartalma: "+zsirtartalom);
        return zsirtartalom;}

    @Override
    public String toString(){
        return String.format("Kategoria: "+getKategoria()+" Kiszerelés: "+getKiszereles()+
                " Zsírtartalom: "+getZsirtartalom()+" Egységár: "+getAr()+" Mennyiség: "+getMennyiseg());
    }
}
