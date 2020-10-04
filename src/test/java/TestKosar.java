
import hu.gov.allamkincstar.java_bsc.maven_webshop.KedvEnum;
import hu.gov.allamkincstar.java_bsc.maven_webshop.KedvSzamitas;
import hu.gov.allamkincstar.java_bsc.maven_webshop.Kosar;
import hu.gov.allamkincstar.java_bsc.maven_webshop.Termek;
import org.junit.Before;
import org.junit.Test;

import java.util.Iterator;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class TestKosar {

    private Kosar kosar = new Kosar();
    private Termek termek;
    @Before
    public void setUp() throws Exception
    {

        termek = new Termek("téliszalámi",2000,KedvEnum.K23);
        kosar.add_termek(termek,7);
        kosar.add_termek(new Termek("gumikacsa",3000,KedvEnum.K23),4);
        kosar.add_termek(new Termek("megapack uborka",2800,KedvEnum.MEGAPACK600),0);
        kosar.add_termek(new Termek("megapack gesztenye",1000,KedvEnum.MEGAPACK600),0);

    }


    @Test
    public void testKosar()
    {
        assertThat(kosar.getKosarMap().size(), equalTo(4));
        assertEquals(4, kosar.getKosarMap().size());
        assertThat(kosar.getKosarMap().get(termek), is(7));

        Iterator<Termek> it= kosar.getKosarMap().keySet().iterator();
        assertThat(it.next().getNev(), equalTo("téliszalámi"));


    }

    @Test
    public void testKedvezmeny()
    {
        kosar.kosartartalom();
        KedvSzamitas kedv = new KedvSzamitas(kosar);
        kedv.eredmeny();
        assertThat(kedv.getKedvList().isEmpty(),is(false));
        assertEquals(19000, kedv.getKedvList().get(0).kedvAr());

    }
}
