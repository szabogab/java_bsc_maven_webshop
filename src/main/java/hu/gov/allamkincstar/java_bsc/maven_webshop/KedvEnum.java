package hu.gov.allamkincstar.java_bsc.maven_webshop;

public enum KedvEnum {

    K23("kettőt fizet, hármat kap"),
    MEGAPACK600("megapack: -6000 Ft");

    private final String kedvCode;

    KedvEnum(String kedvCode) {
        this.kedvCode = kedvCode;
    }

    public String getKedvEnumNev() {
        return this.kedvCode;
    }
}
