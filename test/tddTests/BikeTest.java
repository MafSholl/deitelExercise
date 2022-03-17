 package tddTests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeTest {

    @Test
    public void turnOnTest() {
        Bike myBike = new Bike ();
        myBike.turnOn ();
        assertEquals(true, myBike.isOn());
    }
    @Test
    public void turnOffTest (){
        Bike myBike = new Bike ();
        myBike.turnOff();
        assertEquals(false, myBike.isOn());
    }
    @Test
    public void accelerateTest(){
        Bike myBike = new Bike();
        myBike.accelerate();
        assertEquals(1, myBike.getSpeed());
    }
    @Test
    public void GearTest () {
        Bike myBike = new Bike();
        //myBike.setGear(21);
        myBike.gear(90);
        assertEquals("Gear 4", myBike.getGear());
    }
}
