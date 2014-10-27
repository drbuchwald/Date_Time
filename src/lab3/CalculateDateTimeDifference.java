package lab3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

/**
 * 
 * @author Dan
 */
public class CalculateDateTimeDifference {

    public String getCalculatedDifference(String startingDateTime, String endingDateTime, DateTimeFormatter formatter) throws DateTimeParseException {

        try {
            LocalDateTime start = LocalDateTime.parse(startingDateTime, formatter);
            LocalDateTime end = LocalDateTime.parse(endingDateTime, formatter);
            long differenceInHours = java.time.Duration.between(end, start).toHours();
            long differenceInMinutes = java.time.Duration.between(end, start).toMinutes();
            differenceInMinutes -= (differenceInHours * 60);
            return (differenceInHours + " hours, " + differenceInMinutes + " minutes");
        } catch (DateTimeParseException dateTimePE) {
            throw new DateTimeParseException("Error: " + dateTimePE.getMessage(), startingDateTime , 0);
        }
    }
}
