package org.example.Vevo;

import org.example.Rendeles.Rendeles;

import java.util.ArrayList;

public class HetkoznapiVevo implements Vevo{
    private String VevoiID;
    private String nev;
    private String cim;
    private String ertesites;
    private ArrayList<String> rendelesiSzamLista;
    private Rendeles parancs;


    public HetkoznapiVevo(String id,String nev, String cim, String ertesites){
        this.VevoiID = id;
        this.nev = nev;
        this.cim = cim;
        this.ertesites = ertesites;
        rendelesiSzamLista = new ArrayList<String>();
    }

    @Override
    public String getVevoiID() {
        System.out.println("A vevői azonosító: "+VevoiID);
        return VevoiID;
    }

    @Override
    public void modositNev(String ujNev) {
        System.out.println("A vevő neve "+nev+"-ről"+ujNev+"-re módosult");
        this.nev = ujNev;
    }

    @Override
    public String getNev() {
        System.out.println("A vevő neve: "+nev);
        return nev;
    }

    @Override
    public void modositCim(String ujCim) {
        System.out.println("A vevő címe "+cim+"-ről"+ujCim+"-re módosult");
        this.cim = ujCim;
    }

    @Override
    public String getCim() {
        System.out.println("A vevő címe: "+cim);
        return cim;
    }

    @Override
    public void modositErtesites(String ujErtesites) {
        System.out.println("A vevő értesítési lehetősége "+ertesites+"-ről"+ujErtesites+"-re módosult");
        this.ertesites = ujErtesites;
    }

    @Override
    public String getErtesites() {
        return ertesites;
    }

    public void addRendeles(String rendelesiSzam){
        System.out.println("Rendelesi azonosító hozzáadva a vevőhöz");
        rendelesiSzamLista.add(rendelesiSzam);
    }

    public void removeRendeles(String rendelesiSzam){
        System.out.println("Rendelesi azonosító törölve a vevőnél");
        rendelesiSzamLista.remove(rendelesiSzam);
    }

    public String keresRendeles(String rendelesiszam){
        System.out.println("Keresett rendelés: "+rendelesiszam);
        int szam = rendelesiSzamLista.indexOf(rendelesiszam);
        return rendelesiSzamLista.get(szam);
    }

    public int getSzamolo(){
        return rendelesiSzamLista.size();
    }

    @Override
    public void setRendeles(Rendeles parancs) {
        this.parancs = parancs;
    }

    public String toString(){
        return String.format("Vevői azonosito: "+VevoiID+" Név: "+nev+" Cím: "+cim+" Értesítés: "+ertesites);
    }
}
