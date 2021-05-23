package org.example.Raktar;

import org.example.Menedzsment.Figyelo;
import org.example.Termek.Enumok.HomersekletType;
import org.example.Termek.Termek;

import java.util.ArrayList;

public class SimaRaktar implements RaktarTer{
    private String id;
    private String helyszin;

    private ArrayList<Termek> termekLista;
    private ArrayList<Figyelo> menedzserLista;

    public SimaRaktar(String id, String helyszin){
        this.id = id;
        this.helyszin = helyszin;
        this.termekLista = new ArrayList<Termek>();
        this.menedzserLista = new ArrayList<Figyelo>();
    }

    @Override
    public String getID() {
        System.out.println("A raktár azonosítója: "+id);
        return id;
    }

    @Override
    public String getHelyszin() {
        System.out.println("A raktár helyszíne: "+helyszin);
        return helyszin;
    }

    @Override
    public void addTermek (Termek t) throws Exception {
        if (t.getHomerseklet() == HomersekletType.SZOBA) {
            termekLista.add(t);
            System.out.println("A termék sikeresen hozzáadva a listához.");
        }
        else
            throw new Exception("Ez a termék sajnos nem tárolható ezen a hőmérsékleten!");
    }

    @Override
    public void removeTermek(Termek t){
        termekLista.remove(t);
        System.out.println("A termék sikeresen eltávolítva a listáról");
    }

    @Override
    public Termek getTermek(Termek termek) {
        int szam = termekLista.indexOf(termek);
        System.out.println("A keresett termék: "+termek.toString());
        return termekLista.get(szam);
    }

    @Override
    public int getSzamolo() {
        return termekLista.size();
    }

    @Override
    public void addFigyelo(Figyelo figyelmes) {
        System.out.println("Új menedzserrendszer hozzáadva");
        menedzserLista.add(figyelmes);
    }

    @Override
    public void removeFigyelo(Figyelo figyelmes) {
        System.out.println("Menedzserrendszer eltávolítva");
        menedzserLista.remove(figyelmes);
    }

    @Override
    public void ertesitFigyelo(Termek termek, int szam) {
        for(Figyelo f: menedzserLista){
            f.update(termek, szam);
        }
        System.out.println("A menedzserrendszerek értesítése sor került.");
    }
}
