package tddTests;



public class AirConditioner {

    private boolean power;
    private int temperature;

    public void turnOn(boolean status) {
        if (status == true) {
            power = status;
        }
    }

    public void turnOff(boolean status) {
        if (status == false) {
            power = status;
        }
    }

    public boolean getStatus() {
        return power;
    }

    public void setTemperature(int aTemperature) {
        if (aTemperature >= 16 && aTemperature <= 30) {
            temperature = aTemperature;
        }
    }

    public void increaseTemperature(int input) {
        int barrier = 30;
        int aTemperature = 16;
        if (aTemperature >= 16 && aTemperature <= 30) {
            if (input >= 1 && input <= 14) {
                    temperature = aTemperature + input;
            }

            if (input > 14) {
                temperature = barrier;
            }
        }
    }

    public void reduceTemperature(int input) {
        int barrier = 16;
        int aTemperature = 30;
        if (aTemperature >= 16 && aTemperature <= 30) {
            if (input >= 1 && input <= 14) {
                temperature = aTemperature - input;
            }

            if (input > 14) {
                temperature = barrier;
            }
        }
    }

    public int getTemperature() {
        return temperature;
    }
}