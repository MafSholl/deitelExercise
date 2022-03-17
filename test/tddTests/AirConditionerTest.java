package tddTests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class AirConditionerTest {


    @Test
    public void turnOnTest() {
        AirConditioner myAirConditioner = new AirConditioner();
        myAirConditioner.turnOn(true);
        assertEquals(true, myAirConditioner.getStatus());
    }
    @Test
    public void turnOffTest(){
        AirConditioner myAirConditioner = new AirConditioner();
        myAirConditioner.turnOff(false);
        assertEquals(false, myAirConditioner.getStatus());
    }
    @Test
    public void increaseTemperatureTest(){
        AirConditioner myAirConditioner = new AirConditioner();
        myAirConditioner.increaseTemperature(100);
        assertEquals(30, myAirConditioner.getTemperature());
    }
    @Test
    public void decreaseTemperatureTest(){
        AirConditioner myAirConditioner = new AirConditioner();
        myAirConditioner.reduceTemperature(12);
        assertEquals(18, myAirConditioner.getTemperature());
    }
}
