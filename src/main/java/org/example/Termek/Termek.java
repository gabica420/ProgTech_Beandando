package org.example.Termek;

import org.example.GyarFactory.GyarTerType;
import org.example.Termek.Enumok.HomersekletType;

public interface Termek {
    boolean getTorekeny();
    HomersekletType getHomerseklet();
    GyarTerType getTipus();
    int getAr();
    int getMennyiseg();
    void setMennyiseg(int szam);
}
