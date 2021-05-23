package org.example.Vevo;

import org.example.Rendeles.Rendeles;

public interface Vevo {
    String getVevoiID();
    void modositNev(String ujNev);
    String getNev();
    void modositCim(String ujCim);
    String getCim();
    void modositErtesites(String ujErtesites);
    String getErtesites();
    void addRendeles(String rendelesiszam);
    void removeRendeles(String rendelesiszam);
    String keresRendeles(String rendelesiszam);
    int getSzamolo();
    void setRendeles(Rendeles parancs);
}
