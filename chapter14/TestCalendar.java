package chapter14;

import java.util.*;

public class TestCalendar {

    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar();
        System.out.println("Current time is " + new Date());
        System.out.println("YEAR:\t" + calendar.get(Calendar.YEAR));
        System.out.println("MONTH:\t" + calendar.get(Calendar.MONDAY));
        calendar.set(Calendar.MONTH, 2);
        System.out.println("number of month" + calendar.getMaximum(Calendar.DAY_OF_MONTH));
        System.out.println("MONTH:\t" + calendar.get(Calendar.MONTH));
    }

}
