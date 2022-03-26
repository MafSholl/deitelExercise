 package tddTests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeTest {

    @Test
    public void turnOnTest() {
        Bike myBike = new Bike ();
        myBike.power();
        assertEquals(true, myBike.isOn());
    }
    @Test
    public void turnOffTest (){
        Bike myBike = new Bike ();
        myBike.power();
        myBike.power();
        assertEquals(false, myBike.isOn());
    }
    @Test
    public void accelerateTest(){
        Bike myBike = new Bike();
        myBike.power();
        myBike.accelerate();
        myBike.accelerate();
        myBike.accelerate();
        myBike.accelerate();
        myBike.accelerate();
        assertEquals(5, myBike.getSpeed());
    }
    @Test
    public void gearOneTest () {
        Bike myBike = new Bike();
        myBike.accelerate();
        myBike.accelerate();
        myBike.accelerate();
        myBike.accelerate();
        myBike.accelerate();
        myBike.accelerate();
        myBike.accelerate();
        myBike.accelerate();
        myBike.accelerate();
        myBike.accelerate();
        myBike.accelerate();
        myBike.accelerate();
        myBike.accelerate();
        myBike.accelerate();
        myBike.accelerate();
        myBike.accelerate();
        myBike.accelerate();
        myBike.accelerate();
        myBike.accelerate();
        myBike.accelerate();
        assertEquals("Gear 1", myBike.getGear());
    }

    @Test
    public void gearTwoTest () {
        Bike myBike = new Bike();
        myBike.accelerate();
        myBike.accelerate();
        myBike.accelerate();
        myBike.accelerate();
        myBike.accelerate();
        myBike.accelerate();
        myBike.accelerate();
        myBike.accelerate();
        myBike.accelerate();
        myBike.accelerate();
        myBike.accelerate();
        myBike.accelerate();
        myBike.accelerate();
        myBike.accelerate();
        myBike.accelerate();
        myBike.accelerate();
        myBike.accelerate();
        myBike.accelerate();
        myBike.accelerate();
        myBike.accelerate();

        myBike.accelerate();
        myBike.accelerate();
        myBike.accelerate();
        myBike.accelerate();
        myBike.accelerate();
        assertEquals("Gear 2", myBike.getGear());
    }
    @Test
    public void gearThreeTest () {
        Bike myBike = new Bike();
        myBike.accelerate();
        myBike.accelerate();
        myBike.accelerate();
        myBike.accelerate();
        myBike.accelerate();
        myBike.accelerate();
        myBike.accelerate();
        myBike.accelerate();
        myBike.accelerate();
        myBike.accelerate();
        myBike.accelerate();
        myBike.accelerate();
        myBike.accelerate();
        myBike.accelerate();
        myBike.accelerate();
        myBike.accelerate();
        myBike.accelerate();
        myBike.accelerate();
        myBike.accelerate();
        myBike.accelerate();

        myBike.accelerate();
        myBike.accelerate();
        myBike.accelerate();
        myBike.accelerate();
        myBike.accelerate();

        myBike.accelerate();
        myBike.accelerate();
        myBike.accelerate();
        myBike.accelerate();
        assertEquals("Gear 3", myBike.getGear());
    }
    @Test
    public void gearFourTest () {
        Bike myBike = new Bike();
        myBike.accelerate();
        myBike.accelerate();
        myBike.accelerate();
        myBike.accelerate();
        myBike.accelerate();
        myBike.accelerate();
        myBike.accelerate();
        myBike.accelerate();
        myBike.accelerate();
        myBike.accelerate();
        myBike.accelerate();
        myBike.accelerate();
        myBike.accelerate();
        myBike.accelerate();
        myBike.accelerate();
        myBike.accelerate();
        myBike.accelerate();
        myBike.accelerate();
        myBike.accelerate();
        myBike.accelerate();

        myBike.accelerate();
        myBike.accelerate();
        myBike.accelerate();
        myBike.accelerate();
        myBike.accelerate();

        myBike.accelerate();
        myBike.accelerate();
        myBike.accelerate();
        myBike.accelerate();

        myBike.accelerate();
        assertEquals("Gear 4", myBike.getGear());
    }
}
