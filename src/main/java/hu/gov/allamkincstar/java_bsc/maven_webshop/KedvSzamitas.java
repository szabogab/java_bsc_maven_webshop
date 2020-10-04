package hu.gov.allamkincstar.java_bsc.maven_webshop;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author szabogab
 */
public class KedvSzamitas {

    Kosar kosar;

    public KedvSzamitas(Kosar kosar) {
        this.kosar = kosar;
    }

    private List<KedvezmenyTipus> kedvList = new ArrayList<KedvezmenyTipus>();

    public void eredmeny(){

        KedvezmenyTipus kedvtip;
        kedvtip = new KedvTip23(this.kosar);
        kedvList.add(kedvtip);
        kedvtip = new KedvTipMegaPack(this.kosar);
        kedvList.add(kedvtip);

        KedvezmenyTipus bestKedv= kedvList.get(0);
        for (KedvezmenyTipus currentKedv : kedvList) {
            if (currentKedv.kedvAr()< bestKedv.kedvAr()){
                bestKedv=currentKedv;
            }
        }

        System.out.println("Kedvezményes ár:" + bestKedv.kedvAr());

        if (this.kosar.getEredetiAr()==bestKedv.kedvAr()){
            System.out.println("Kedvezmény tipusa: Kedvezmény nem érvényesíthető.");
        }
        else
        {
            System.out.println("Kedvezmény tipusa:" + bestKedv.kedvTipus());
        }

    }

    public List<KedvezmenyTipus> getKedvList() {
        return kedvList;
    }


}
