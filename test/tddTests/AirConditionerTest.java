package tddTests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class AirConditionerTest {


    @Test
    public void turnOnTest() {
        AirConditioner myAirConditioner = new AirConditioner();
        myAirConditioner.power();
        assertTrue(myAirConditioner.getPower());
    }
    @Test
    public void turnOffTest(){
        AirConditioner myAirConditioner = new AirConditioner();
        myAirConditioner.power();
        myAirConditioner.power();
        assertFalse( myAirConditioner.getPower());
    }
    @Test
    public void increaseTemperatureTest(){
        AirConditioner myAirConditioner = new AirConditioner();
        myAirConditioner.power();
        myAirConditioner.increaseTemperature();
        myAirConditioner.increaseTemperature();
        myAirConditioner.increaseTemperature();
        myAirConditioner.increaseTemperature();
        assertEquals(20, myAirConditioner.getTemperature());
    }
    @Test
    public void increasingTemperatureMoreThanThirtyPossibilityTest(){
        AirConditioner myAirConditioner = new AirConditioner();
        myAirConditioner.power();
        myAirConditioner.increaseTemperature();
        myAirConditioner.increaseTemperature();
        myAirConditioner.increaseTemperature();
        myAirConditioner.increaseTemperature();
        myAirConditioner.increaseTemperature();
        myAirConditioner.increaseTemperature();
        myAirConditioner.increaseTemperature();
        myAirConditioner.increaseTemperature();
        myAirConditioner.increaseTemperature();
        myAirConditioner.increaseTemperature();
        myAirConditioner.increaseTemperature();
        myAirConditioner.increaseTemperature();
        myAirConditioner.increaseTemperature();
        myAirConditioner.increaseTemperature();
        myAirConditioner.increaseTemperature();
        myAirConditioner.increaseTemperature();
        myAirConditioner.increaseTemperature();
        assertEquals(30, myAirConditioner.getTemperature());
    }

        @Test
    public void decreaseTemperatureTest(){
        AirConditioner myAirConditioner = new AirConditioner();
        myAirConditioner.power();
        myAirConditioner.increaseTemperature();
        myAirConditioner.increaseTemperature();
        myAirConditioner.increaseTemperature();
        myAirConditioner.increaseTemperature();
        myAirConditioner.reduceTemperature();
        assertEquals(19, myAirConditioner.getTemperature());
    }

    @Test
    public void reducingTemperatureMoreThanThirtyPossibilityTest() {
        AirConditioner myAirConditioner = new AirConditioner();
        myAirConditioner.power();
        myAirConditioner.reduceTemperature();
        myAirConditioner.reduceTemperature();
        myAirConditioner.reduceTemperature();
        assertEquals(16, myAirConditioner.getTemperature());
    }
}
