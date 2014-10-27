package jdk8.api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

public class Demo2 {
    public static void main(String[] args) {
        // Get current date and time
        LocalDateTime date = LocalDateTime.now();
        
        System.out.println("Current date/time with built-in LocalDateTime class format: " + date);
        
        // Now use new DateTimeFormatter class
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MMM d yyyy  hh:mm a");
        String strDate = date.format(format);
        System.out.println("Current date/time with custom format provided by DateTimeFormatter: " + strDate);

        // Just get Dates without time values and calculate payday
        format = DateTimeFormatter.ofPattern("MMM d yyyy");
        LocalDate today = LocalDate.now();
        LocalDate payday1 = today.with(TemporalAdjusters.lastDayOfMonth());
        LocalDate payday2 = today.with(TemporalAdjusters.lastDayOfMonth()).minusDays(2);
        System.out.println("Pretend Payday is at the end of this month: " + payday1.format(format));
        System.out.println("Pretend Payday is at the end of this month, less two days: " + payday2.format(format));
        
        // What else can you do? Do some research and share with class. You have one hour!
        
        //LocalDateTime.parse("2:30:47");
        LocalTime now = LocalTime.now();
        
        System.out.println(LocalTime.parse("02:30:47"));
    }
}