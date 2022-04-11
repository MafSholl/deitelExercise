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
        int i = 1;
        while (i <= 21) {
        myBike.accelerate();
        i++;}
        assertEquals(21, myBike.getSpeed());
    }
    @Test
    public void gearOneTest () {
        Bike myBike = new Bike();
        myBike.power();
        int i = 1;
        while (i <= 20){
        myBike.accelerate();
        i++;}
        assertEquals("Gear 1", myBike.getGear());
    }

    @Test
    public void gearTwoTest () {
        Bike myBike = new Bike();
        myBike.power();
        int i = 1;
        while (i <= 25){
            myBike.accelerate();
            i++;}
        assertEquals("Gear 2", myBike.getGear());
    }
    @Test
    public void gearThreeTest () {
        Bike myBike = new Bike();
        myBike.power();
        int i = 1;
        while (i <= 29){
            myBike.accelerate();
            i++;}
        assertEquals("Gear 3", myBike.getGear());
    }
    @Test
    public void gearFourTest () {
        Bike myBike = new Bike();
        myBike.power();
        int i = 1;
        while (i <= 30){
            myBike.accelerate();
            i++;}
        assertEquals("Gear 4", myBike.getGear());
    }
}
