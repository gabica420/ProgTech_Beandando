package org.example.RaktarFactory;

import org.example.Raktar.HutottRaktar;
import org.example.Raktar.RaktarTer;
import org.example.Raktar.SimaRaktar;

public class RaktarFactory implements RaktarF {
    public static RaktarTer keszitRaktarTer(RaktarTerType type, String id, String helyszin){
        RaktarTer ter = null;
       switch (type){
           case SIMA: ter = new SimaRaktar(id, helyszin);
               System.out.println("Új normális raktár");
           break;
           case HUTOTT: ter = new HutottRaktar(id,helyszin);
               System.out.println("Új hűtött raktár");
           break;
       }
       return ter;
    }

}
