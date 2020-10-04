package hu.gov.allamkincstar.java_bsc.maven_webshop;

import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here


        TermekLista tm = new TermekLista();
        Scanner scanner = new Scanner(System.in);
        Kosar kosar = new Kosar();
        int darab;
        for (Termek termek: tm.getTermekList()) {
            System.out.println("kérem adja meg a "+termek.getNev()+" darabszámát:");
            darab = scanner.nextInt();
            kosar.add_termek(termek, darab);
        }

        kosar.kosartartalom();
        KedvSzamitas kedv = new KedvSzamitas(kosar);
        kedv.eredmeny();

    }

}
