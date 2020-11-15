import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PizzeriaTest {

    @Test
    public void twoChocolateBoilersMightBlowTheFactory() {
        Pizzeria boutiqueBrest = new Pizzeria();
        Pizza miam = boutiqueBrest.commanderPizza("cheese");
        Pizzeria boutiqueStrasbourg = new Pizzeria();
        Pizza miam2 = boutiqueStrasbourg.commanderPizza ("Greek");
        assertFalse(miam == null);
        assertFalse(miam.equals(miam2));
    }
}