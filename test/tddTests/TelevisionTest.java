package tddTests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TelevisionTest {
    @Test
    public void nameTest () {
        Television myTele = new Television();
        myTele.getName();
        assertEquals("UncleChibo", myTele.getName());
    }

    @Test
    public void setUsernameTest() {
        Television myTele = new Television();
        myTele.setUsername("Ciroma Sulaiman");
        assertEquals("Ciroma Sulaiman", myTele.getUsername());
    }

    @Test
    public void increaseBrightnessTest() {
        Television myTele = new Television();
        myTele.togglePower();
        assertTrue(myTele.isOn());
        myTele.increaseBrightness();
        assertEquals(1, myTele.getBrightness());
    }

    @Test
    public void decreaseBrightnessTest(){
        Television myTele = new Television();
        myTele.togglePower();
        myTele.increaseBrightness();
        myTele.increaseBrightness();
        myTele.decreaseBrightness();
        assertEquals(1, myTele.getBrightness());
    }

    @Test
    public void increaseContrastTest() {
        Television myTele = new Television();
        myTele.togglePower();
        assertTrue(myTele.isOn());
        myTele.increaseContrast();
        myTele.increaseContrast();
        assertEquals(2, myTele.getContrast());
    }
    @Test
    public void decreaseContrastTest() {
        Television myTele = new Television();
        myTele.togglePower();
        assertTrue(myTele.isOn());
        myTele.increaseContrast();
        myTele.increaseContrast();
        myTele.decreaseContrast();
        myTele.decreaseContrast();
        myTele.decreaseContrast();
        assertEquals(0, myTele.getContrast());
    }
    @Test
    public void increaseVolume() {
        Television myTele = new Television();
        myTele.togglePower();
        assertTrue(myTele.isOn());
        myTele.increaseVolume();
        assertEquals(1, myTele.getVolume());
    }
    @Test
    public void decreaseVolume() {
        Television myTele = new Television();
        assertFalse(myTele.isOn());
        myTele.togglePower();
        assertTrue(myTele.isOn());
        myTele.increaseVolume();
        myTele.decreaseVolume();
        myTele.decreaseVolume();
        assertEquals(0, myTele.getVolume());
    }
    @Test
    public void muteTest() {
        Television myTele = new Television();
        myTele.togglePower();
        myTele.increaseVolume();
        myTele.mute();
        assertEquals(0, myTele.getVolume());
    }
    /**@Test
    public void UnmuteTest() {
        Television myTele = new Television();
        myTele.togglePower();
        myTele.increaseVolume();
        myTele.increaseVolume();
        myTele.increaseVolume();
        myTele.mute();
        myTele.mute();
        assertEquals(3, myTele.getVolume());
    }**/
    @Test
    public void togglePowerOnTest(){
        Television myTele = new Television();
        myTele.isOn();
        assertFalse(myTele.isOn());
        myTele.togglePower();
        assertTrue(myTele.isOn());
    }
    @Test
    public void togglePowerOffTest(){
        Television myTele = new Television();
        myTele.isOn();
        myTele.togglePower();
        myTele.togglePower();
        assertFalse(myTele.isOn());
    }
    @Test
    public void setChannelTest(){
        Television myTele = new Television();
        myTele.togglePower();
        myTele.setChannel(98);
        assertEquals(98, myTele.getChannel());
    }
    @Test
    public void increaseChannelTest(){
        Television myTele = new Television();
        myTele.togglePower();
        myTele.increaseChannel();
        assertEquals(1, myTele.getChannel());
    }
    @Test
    public void decreaseChannelTest(){
        Television myTele = new Television();
        myTele.togglePower();
        myTele.increaseChannel();
        myTele.increaseChannel();
        myTele.decreaseChannel();
        assertEquals(1, myTele.getChannel());
    }
}