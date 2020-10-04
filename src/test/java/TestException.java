import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import hu.gov.allamkincstar.java_bsc.maven_webshop.Kosar;
import hu.gov.allamkincstar.java_bsc.maven_webshop.Termek;
import hu.gov.allamkincstar.java_bsc.maven_webshop.KedvEnum;

/**
 *
 * @author szabogab
 */
public class TestException {
    @Rule
    public final ExpectedException expectedException = ExpectedException.none();

    @Test
    public void testNumberFormatException() {
        expectedException.expect(NumberFormatException.class);
        //expectedException.expectMessage("Invalid darab: blabla");
        Kosar kosar = new Kosar();
        String s = "blabla";
        kosar.add_termek(new Termek("gumikacsa",3000,KedvEnum.K23),Integer.valueOf(s));

    }

}