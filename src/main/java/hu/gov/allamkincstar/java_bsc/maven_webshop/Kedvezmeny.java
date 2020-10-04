package hu.gov.allamkincstar.java_bsc.maven_webshop;

import java.util.Map;

public class Kedvezmeny {
    private int kedvSum=0;
    private final int eredetiAr;

    public int getKedvSum() {
        return kedvSum;
    }

    public Kedvezmeny(KedvEnum kedvenum, Kosar kosar) {

        this.eredetiAr=kosar.getEredetiAr();

        for (Map.Entry<Termek, Integer> entry : kosar.getKosarMap().entrySet()) {
            Termek termek = entry.getKey();
            Integer db = entry.getValue();
            if (termek.getKedv() == kedvenum) {
                int i;
                switch (kedvenum) {
                    case K23:
                        i = (db/ 3) * termek.getAr();
                        break;
                    case MEGAPACK600:
                        i = (db / 12) * KedvezmenyTipus.MEGAKEDV;
                        break;
                    default:
                        i=0;
                }

                //System.out.println(termek.getNev()+": "+ i);
                kedvSum = kedvSum + i;
            }
        }
    }

    public int getEredetiAr() {
        return eredetiAr;
    }
}
