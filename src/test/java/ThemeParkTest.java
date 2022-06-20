import attractions.*;
import org.junit.Before;
import org.junit.Test;
import stalls.*;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ThemeParkTest {

    ThemePark themePark;
    Dodgems dodgems;
    Park park;
    Playground playground;
    RollerCoaster rollerCoaster;
    ArrayList<Attraction> attractions;
    CandyflossStall candyflossStall;
    IceCreamStall iceCreamStall;
    TobaccoStall tobaccoStall;
    ArrayList<Stall> stalls;

    @Before
    public void before() {
        dodgems = new Dodgems("Bumper Cars", 5);
        park = new Park("Leafy Meadows", 9);
        playground = new Playground("Fun Zone", 7);
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        candyflossStall = new CandyflossStall("Candy Land", "Harry Belafonte", ParkingSpot.A1);
        iceCreamStall = new IceCreamStall("Dream Cones", "Vanilla Ice", ParkingSpot.A4);
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1);
        attractions = new ArrayList<>();
        stalls = new ArrayList<>();
        themePark = new ThemePark();
    }

    @Test
    public void hasAttractions() {
        themePark.addAttraction(dodgems);
        themePark.addAttraction(park);
        themePark.addAttraction(playground);
        themePark.addAttraction(rollerCoaster);
        assertEquals(4, themePark.getAttractions());
    }

    @Test
    public void hasStalls() {
        themePark.addStall(candyflossStall);
        themePark.addStall(iceCreamStall);
        themePark.addStall(tobaccoStall);
        assertEquals(3, themePark.getStalls());
    }

}