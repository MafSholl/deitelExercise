package playGrounndd;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second){
        validate(hour, minute, second);

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public Time(){

    }
    public Time(int second){
//        this.second = second;
        this(0,0, 0);
    }
    public Time(int minute, int second){
//        this.second = second;
//        this.minute = minute;
        this(0,0,0);
    }

    public void setTime(int hour, int minute, int second){
        validate(hour, minute, second);

        this.hour = hour;
        this.minute = minute;
        this.second = minute;
    }

    private void validate(int hour, int minute, int second) {
        validateSecond(second);
        validateMinute(minute);
        validateHour(hour);
    }

    private static void validateHour(int hour){
        boolean hourIsInvalid = hour < 0 || hour > 60;
        if(hourIsInvalid) throw new IllegalArgumentException("Invalid hour");
    }

    private void validateMinute(int minute){
        boolean minuteIsInvalid = minute < 0 || minute > 60;
        if(minuteIsInvalid) throw new IllegalArgumentException("Invalid hour");
    }

    private void validateSecond(int second){
        boolean secondIsInvalid = second < 0 || second > 60;
        if(secondIsInvalid) throw new IllegalArgumentException("Invalid hour");
    }
}
