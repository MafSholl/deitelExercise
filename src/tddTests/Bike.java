package tddTests;

public class Bike {


    private boolean power;
    private int speed;
    private String gear;

    public boolean turnOn () {
        if (power == false) {
            power = true;
        /**if (status == true) {
            power = status;**/
        }
        return power;
    }

    public boolean isOn() {
        return power;
    }

    public boolean turnOff( ) {
        if (power == true) {
            power = false;

        /**if (status == false){
            power = status;*/
        }
        return power;
    }
     public void accelerate() {
         if(speed >= 40) {
             speed += 4;
         }
         if(speed >= 30  && speed < 40) {
             speed += 3;
         }
         if(speed >= 20  && speed < 30) {
             speed += 2;
         }
         if(speed >= 0 && speed < 20) {
             speed += 1;
         }
     }
    public int getSpeed(){
        return speed;
    }

    public void gear(int speed) {
        if(speed >= 0 && speed < 20) {
            gear = "Gear 1";
        }
        if(speed >= 20 && speed < 30) {
            gear ="Gear 2";
        }
        if(speed >= 30 && speed < 40) {
            gear ="Gear 3";
        }
        if(speed >= 40) {
            gear = "Gear 4";
        }
    }
    public String getGear() {
        return gear;
    }
}
