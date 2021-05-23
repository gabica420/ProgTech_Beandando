package org.example.GyarFactory;

import org.example.Gyar.ElektronikusGyar;
import org.example.Gyar.ElelmiszerGyar;
import org.example.Gyar.GyarTer;
import org.example.Gyar.RuhaGyar;

public class GyarFactory implements GyarF{
    public static GyarTer keszitGyarTer(GyarTerType type, String id){
        GyarTer ter = null;
        switch (type){
            case ELEKTRONIKUS: ter = new ElektronikusGyar(id);
                System.out.println("Új eletronikus gyár");
                break;
            case ELELMISZER: ter = new ElelmiszerGyar(id);
                System.out.println("Új élelmiszer gyár");
                break;
            case RUHA: ter = new RuhaGyar(id);
                System.out.println("Új ruhagyár");
        }
        return ter;
    }
}
