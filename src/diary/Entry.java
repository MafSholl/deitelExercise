package diary;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Entry {

    private LocalDateTime localDateTime;
    private static String day;
    public Entry(){

    }

    public static void setLocalDateTime(){
        LocalDateTime localDateTime = LocalDateTime.now();
    }

    public static void setDay(){
        LocalDateTime day= LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d");
        String text = day.format(formatter);
        Entry.day = text;
    }

    public static String getDay(){
        return day;
    }

    public static void main(String[] args) {
//        setDay();
        System.out.println(getDay());
    }
}
