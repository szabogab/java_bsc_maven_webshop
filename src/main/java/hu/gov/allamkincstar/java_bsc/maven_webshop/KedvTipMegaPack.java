package hu.gov.allamkincstar.java_bsc.maven_webshop;

public class KedvTipMegaPack extends Kedvezmeny implements KedvezmenyTipus {


    public KedvTipMegaPack(Kosar kosar) {

        super(KedvEnum.MEGAPACK600, kosar);

    }


    public int kedvAr() {
        return getEredetiAr()-getKedvSum();
    }


    public String kedvTipus() {
        return  KedvEnum.MEGAPACK600.getKedvEnumNev() ;
    }

}