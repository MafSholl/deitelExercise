package tddTests;

public class Bike {


    private boolean isOn;
    private int speed;
    private String gear;

    public void power () {
        if (!isOn) {
            isOn = true;
        }
        else isOn = false;
    }

    public boolean isOn() {
        return isOn;
    }

     public void accelerate() {
         if (isOn) {
             if(speed >= 40) {
             speed += 4;
             gear = "Gear 4";
             }
             if(speed >= 30  && speed < 40) {
                 speed += 3;
                 gear = "Gear 3";
             }
             if(speed >= 20 && speed < 30) {
                 speed += 2;
                 gear = "Gear 2";
             }
             if(speed >= 0 && speed < 20) {
                 speed += 1;
                 gear = "Gear 1";
             }
         }
     }
    public int getSpeed(){
        return speed;
    }

    public String getGear() {
        return gear;
    }
}
