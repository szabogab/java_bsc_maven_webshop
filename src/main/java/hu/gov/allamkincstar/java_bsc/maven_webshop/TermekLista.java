package hu.gov.allamkincstar.java_bsc.maven_webshop;

import java.util.ArrayList;
import java.util.List;


public class TermekLista {

    private List<Termek> termekList = new ArrayList<Termek>();

    public TermekLista() {

        termekList.add(new Termek("téliszalámi",2000,KedvEnum.K23));
        termekList.add(new Termek("gumikacsa",3000,KedvEnum.K23));
        termekList.add(new Termek("megapack uborka",2800,KedvEnum.MEGAPACK600));
        termekList.add(new Termek("megapack gesztenye",1000,KedvEnum.MEGAPACK600));
    }

    public List<Termek> getTermekList() {
        return termekList;
    }

    public Termek getTermek(int pageNumber) {
        return termekList.get(pageNumber);
    }

}
