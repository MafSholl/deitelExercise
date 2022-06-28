package diary;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.text.Format;

public class Entry {

    private LocalDateTime localDateTime;
    private static String month;
    private static String day;
    public Entry(){

    }

    public static void setLocalDateTime(){
        LocalDateTime localDateTime = LocalDateTime.now();
    }

    public static void setDay(){
        LocalDateTime day = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d");
        String text = day.format(formatter);
        Entry.day = text;
    }

    public static String getDay(){
        return day;
    }

    public static void setMonth(){
        LocalDateTime month = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M");
        String text = month.format(formatter);
        Entry.month = text;
    }
    public static String getMonth(){
        return month;
    }
    public static void textMonth(){
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("L");
        String month = date.format(formatter);
        System.out.println(month);
    }
    public static void testRun(){
        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");
        String text = date.format(formatter);
        LocalDate parsedDate = LocalDate.parse(text, formatter);
        System.out.println(parsedDate);
    }



    public static void main(String[] args) {
        setDay();
        System.out.println(getDay());
        setMonth();
        System.out.println(getMonth());
        textMonth();
    }
}
