package hu.gov.allamkincstar.java_bsc.maven_webshop;

public class Termek {
    private String nev;
    private int ar;

    //kőnnyen bővíthető
    private KedvEnum kedv; //boolean megapack;


    public Termek(String nev, int ar, KedvEnum kedv) {
        this.nev = nev;
        this.ar = ar;
        this.kedv = kedv;

    }

    public String getNev() {
        return nev;
    }

    public int getAr() {
        return ar;
    }

    public KedvEnum getKedv() {
        return kedv;
    }



    @Override
    public String toString() {
        return "név:"+this.nev+", ár:"+this.ar+", kedvezmény:"+this.kedv.getKedvEnumNev();
    }

}
