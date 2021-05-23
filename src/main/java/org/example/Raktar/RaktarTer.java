package org.example.Raktar;

import org.example.Menedzsment.Figyelo;
import org.example.Termek.Termek;

public interface RaktarTer {
    String getID();
    String getHelyszin();
    void addTermek(Termek termek) throws Exception;
    void removeTermek(Termek termek);
    Termek getTermek(Termek termek);
    int getSzamolo();
    void addFigyelo(Figyelo figyelmes);
    void removeFigyelo(Figyelo figyelmes);
    void ertesitFigyelo(Termek termek, int szam);

}
