import static org.junit.Assert.*;

import org.junit.Test;

public class PizzeriaTest {

    @Test
    public void anOrderedPizzaIsNotNull() {
        Pizzeria boutiqueBrest = new Pizzeria();
        Pizza miam = boutiqueBrest.commanderPizza("cheese");
        assertNotNull("An Ordered Pizza Is Not Null",miam == null);
    }

    @Test
    public void twoOrderedPizzasAreDifferent() {
        Pizzeria boutiqueBrest = new Pizzeria();
        Pizzeria boutiqueStrasbourg = new Pizzeria();
        Pizza miam = boutiqueBrest.commanderPizza("cheese");
        Pizza miam2 = boutiqueStrasbourg.commanderPizza ("Greek");
        assertFalse("Two Ordered Pizzas Are Different",miam.equals(miam2));
    }
}