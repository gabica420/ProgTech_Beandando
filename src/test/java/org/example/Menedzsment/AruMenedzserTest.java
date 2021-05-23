package org.example.Menedzsment;

import org.example.Raktar.RaktarTer;
import org.example.Raktar.SimaRaktar;
import org.example.Termek.Enumok.Ruhatype;
import org.example.Termek.Ruha;
import org.example.Termek.Termek;
import org.junit.Test;

public class AruMenedzserTest {

    @Test
    public void testUpdate() throws Exception {
        SimaRaktar raktar = new SimaRaktar("AA99", "Liszabom");
        AruMenedzser menedzser = new AruMenedzser(raktar);
        Termek termek = new Ruha(Ruhatype.ALSO,"55678",7990, 34);
        raktar.addTermek(termek);

        menedzser.update(termek, 22);
    }
}