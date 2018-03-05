package java.com.jsantos.creationalpatterns.factorymethodpattern.calendarexample;

import java.util.Calendar;
import java.util.Locale;

/**
 * This is an example of the factory method pattern.
 *
 * Created by jsantos on 1/8/18.
 */
public class CalendarDemo {

    public static void main(String[] args) {

        // Note that this calls getInstance, which returns a concrete class of Calendar
        Calendar cal = Calendar.getInstance();

        // this shows what's the implementing class (e.g., GregorianCalendar)
        System.out.println(cal);

        System.out.println(cal.get(Calendar.DAY_OF_MONTH));

        // this is an example of why the design factory pattern is different than most... it's parameterized
        cal = Calendar.getInstance(Locale.ENGLISH);
    }
}
