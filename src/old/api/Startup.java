package old.api;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Startup {

    public static void main(String[] args) throws ParseException {
        Demo1 demo1 = new Demo1();
        Calendar calendar = demo1.getCurrentCalendar();
        Date date = demo1.getCurrentDateTime();
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy h:mm a");
        System.out.println(sdf.format(date));
        System.out.println(sdf.format(calendar.getTime()));

        String s = "10/20/2014 6:19 PM";  // must match sdf format exactly
        Date date2 = sdf.parse(s);
        System.out.println(date2);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(date2);
        System.out.println(calendar2);
        
        Calendar startDate = Calendar.getInstance();
        startDate.set(2014, Calendar.JANUARY, 1);
        startDate.roll(Calendar.YEAR, -2);
        Calendar endDate = Calendar.getInstance();
        endDate.set(2014, Calendar.JANUARY, 15);
        
        long startMsec = startDate.getTimeInMillis();
        long endMsec = endDate.getTimeInMillis();
        
        long diff = endMsec - startMsec;
        long days = (diff/1000/60/60/24);
        System.out.println(days);
        
    }

}
