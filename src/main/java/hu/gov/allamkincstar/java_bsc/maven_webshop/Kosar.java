package hu.gov.allamkincstar.java_bsc.maven_webshop;

import java.util.LinkedHashMap;
import java.util.Map;

public class Kosar {

    //based on insertion order
    private Map<Termek,Integer> kosarMap=new LinkedHashMap<Termek,Integer>();

    private int eredetiAr=0;

    public void add_termek(Termek t, Integer p_db) {
        kosarMap.put(t,p_db);
    }

    public void kosartartalom(){

        for (Map.Entry<Termek, Integer> entry : kosarMap.entrySet()) {
            Termek termek = entry.getKey();
            Integer db = entry.getValue();
            System.out.println(termek.toString()+", darab:"+db);
            eredetiAr = eredetiAr+ (termek.getAr()* db);
        }

        System.out.println("eredeti ár:" + eredetiAr);
    }

    public Map<Termek, Integer> getKosarMap() {
        return kosarMap;
    }


    public int getEredetiAr() {
        return eredetiAr;
    }

}
