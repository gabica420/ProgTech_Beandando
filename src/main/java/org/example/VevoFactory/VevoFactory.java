package org.example.VevoFactory;

import org.example.Vevo.HetkoznapiVevo;
import org.example.Vevo.Vevo;

public class VevoFactory implements VevoF{
    public static Vevo keszitVevo(VevoType type, String id, String nev, String cim, String ertesit){
        Vevo alany = null;
        switch (type){
            case HETKOZNAPI: alany = new HetkoznapiVevo(id, nev, cim, ertesit);
                System.out.println("Új hétköznapi vevő");
                break;
        }
        return alany;
    }
}
