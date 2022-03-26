package tddTests;

import java.util.Scanner;

public class Television {

    private boolean isOn;
    private String name = "UncleChibo";
    private String userName;
    private int brightness;
    private int contrast;
    private int volume;
    private int resolution;
    private int channel;

    public void togglePower() {
        if (!isOn) {
            isOn = true;
        } else {
            isOn = false;
        }
    }

    public boolean isOn() {
        return isOn;
    }

    public String getName() {
        return name;
    }

    public void setUsername(String userName) {
        Scanner newName = new Scanner(System.in);
        System.out.println("Set up your Username.");
        //userName = newName.nextLine();
        this.userName = userName;
    }

    public String getUsername() {
        return userName;
    }

    public void increaseBrightness() {
        if (isOn) {
            if (brightness >= 0 && brightness < 100) {
                brightness++;
            }
        }
    }

    public void decreaseBrightness() {
        if (isOn)
            if (brightness >= 0 && brightness < 100) {
                brightness--;
            }
    }

    public int getBrightness() {
        return brightness;
    }

    public void increaseContrast() {
        if (isOn) {
            if (contrast >= 0 && contrast < 100) {
                contrast = contrast + 1;
            }
            if (contrast == 100) {
                contrast = 100;
            }
        }
    }

    public void decreaseContrast() {
        if (isOn) {
            if (contrast > 0 && contrast <= 100) {
                contrast = contrast - 1;
            }
            if (contrast == 0) {
                contrast = 0;
            }
        }
    }

    public int getContrast() {
        return contrast;
    }

    public void increaseVolume() {
        if (isOn) {
            if (volume > 0 && volume < 100) {
                volume = volume + 1;
            }
             else {
                volume = volume;
            }
        }
    }

    public void decreaseVolume() {
        if (isOn) {
            if (volume > 0 && volume < 100) {
                volume = volume - 1;
            }
            else {
                volume = volume;
            }
        }
    }

    public int getVolume() {
        return volume;
    }
    public void setChannel(int channel) {
        //Scanner input = new Scanner(System.in);
        //channel = input.nextInt();
        if (isOn) {
            if (channel > 0 && channel <= 100) {
                this.channel = channel;
            }
        }
    }
    public void increaseChannel(){
        if (isOn) {
            if (channel >= 0 && channel < 100) {
                channel++;
            }
        }
    }
    public void decreaseChannel(){
        if(isOn) {
            if (channel >= 0 && channel < 100){
                channel --;
            }
        }
    }

    public int getChannel() {
        return channel;
    }
}
