package lab2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

/**
 * 
 * @author Dan
 */
public class CalculateDateTimeDifference {

    public String getCalculatedDifference(String startingDateTime, String endingDateTime, String format) throws ParseException {
        
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        long endMsec = sdf.parse(endingDateTime).getTime();
        long startMsec = sdf.parse(startingDateTime).getTime();
        long difference = startMsec - endMsec;

        long hours = TimeUnit.MILLISECONDS.toHours(difference);
        difference -= TimeUnit.HOURS.toMillis(hours);
        long minutes = TimeUnit.MILLISECONDS.toMinutes(difference);

        return (hours + " hours, " + minutes+ " minutes");

    }
}
