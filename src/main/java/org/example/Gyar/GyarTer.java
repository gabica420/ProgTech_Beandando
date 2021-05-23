package org.example.Gyar;

import org.example.Termek.Termek;

public interface GyarTer {
    Termek getTermek(Termek termek);
    void addTermek(Termek termek) throws Exception;
    void removeTermek(Termek termek);
    int getSzamolo();
}
