package tddTests;



public class AirConditioner {

    private boolean isOn;
    private int temperature = 16;

    public void power( ) {
        if (!isOn) {
            isOn = true;
        }
        else isOn = false;
    }

    public boolean getPower() {
        return isOn;
    }

    public void setTemperature(int aTemperature) {
        if (aTemperature >= 16 && aTemperature <= 30) {
            temperature = aTemperature;
        }
    }

    public void increaseTemperature() {
        if (isOn){
            if (temperature >= 16 && temperature < 30) {
            temperature ++;
            }
            if (temperature == 30) {
                temperature = 30;
            }
        }
    }

    public void reduceTemperature() {
        if (isOn) {
            if (temperature > 16 && temperature <= 30) {
                temperature --;
            }
            if (temperature == 16) {
                temperature = 16;
            }
        }
    }

    public int getTemperature() {
        return temperature;
    }
}