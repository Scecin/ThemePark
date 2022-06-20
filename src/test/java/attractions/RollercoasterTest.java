package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor1;
    Visitor visitor2;
    Visitor visitor3;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor1 = new Visitor(28, 2.05, 40.0);
        visitor2 = new Visitor(10, 1.48, 50.0);
        visitor3 = new Visitor(13, 1.2, 30.0);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void canRideOnRollerCoaster() {
        assertEquals(true, rollerCoaster.isAllowedTo(visitor1));
    }

    @Test
    public void CanNotRideOnRollerCoasterBecauseAge() {
        assertEquals(false, rollerCoaster.isAllowedTo(visitor2));
    }

    @Test
    public void CanNotRideOnRollerCoasterBecauseHeight() {
        assertEquals(false, rollerCoaster.isAllowedTo(visitor3));
    }
    @Test
    public void hasDefaultPrice() {
        assertEquals(8.40, rollerCoaster.defaultPrice(),0.0);
    }

    @Test
    public void canChargesTallPeople() {
        assertEquals(16.8, rollerCoaster.priceFor(visitor1), 0.0);
    }
}
