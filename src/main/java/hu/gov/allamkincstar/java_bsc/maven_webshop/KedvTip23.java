package hu.gov.allamkincstar.java_bsc.maven_webshop;

public class KedvTip23 extends Kedvezmeny implements KedvezmenyTipus{


    public KedvTip23(Kosar kosar) {

        super(KedvEnum.K23, kosar);

    }


    public int kedvAr() {
        return getEredetiAr()-getKedvSum();
    }


    public String kedvTipus() {

        return KedvEnum.K23.getKedvEnumNev();
    }

}
