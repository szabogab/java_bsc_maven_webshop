import hu.gov.allamkincstar.java_bsc.maven_webshop.KedvEnum;
import hu.gov.allamkincstar.java_bsc.maven_webshop.Termek;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class TestTermek {
    @Test
    public void testTermek() {

        {
            Termek termek = new Termek("téliszalámi",2000,KedvEnum.K23);
            assertThat(termek.getNev(), equalTo("téliszalámi"));

        }

    }
}
