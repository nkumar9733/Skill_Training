package dateAndTime;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.util.TimeZone;

public class DateAndTimeApi {
    public static void main(String[] args) {
        
        //Experimenting with date
        LocalDate myBirthDate = LocalDate.of(1999, Month.JUNE, 25);
        System.out.println("My Birth Date is : "+myBirthDate);
        System.out.println("My Birth Year is : "+myBirthDate.getYear());
        System.out.println("My Birth Month is : "+myBirthDate.getMonth());
        System.out.println("My Birth Day is : "+myBirthDate.getDayOfMonth());
        System.out.println("My Birth Day is : "+myBirthDate.getDayOfWeek());
        LocalDate plusDays = myBirthDate.plusYears(20).plusMonths(1).plusDays(1);
        System.out.println("Added 20 Years 1 Month 1 day to My Birth Day : "+plusDays);

        //Experimenting with time 
        LocalTime time = LocalTime.of(9, 15, 34);
        System.out.println("My Madeout time is : "+time);
        System.out.println("My Madeout hour is : "+time.getHour());
        System.out.println("My Madeout minute is : "+time.getMinute());
        System.out.println("My Madeout second is : "+time.getSecond());
        LocalTime plusMinutes = time.plusHours(1).plusMinutes(15);
        System.out.println("Added 1 hour 15 minutes to time :"+plusMinutes);

        //Experimenting with date and time 
        LocalDateTime dateTime = LocalDateTime.of(myBirthDate, time);
        System.out.println("Date and Time is :"+dateTime);
        System.out.println("Year of Date and Time is :"+dateTime.getYear());
        System.out.println("Month of Date and Time is :"+dateTime.getMonth());
        System.out.println("Day of Date and Time is :"+dateTime.getDayOfMonth());
        System.out.println("Hour of Date and Time is :"+dateTime.getHour());
        System.out.println("Minute of Date and Time is :"+dateTime.getMinute());
        System.out.println("Second of Date and Time is :"+dateTime.getSecond());


        // TimeZone
        TimeZone timeZone = TimeZone.getDefault();
        System.out.println("Default Time Zone is :"+timeZone);


        // Experimenting Period
        Period period = myBirthDate.until(LocalDate.now());
        System.out.println("How old I am :"+period);
        System.out.println("My age is :"+period.getYears());


        // Checking Complexity , This is more Accurate
        long nanoTime = System.nanoTime();
        // Some random method to check its complexity
        long nanoTime2 = System.nanoTime();
        System.out.println("Time taken to Execute that method is :"+(nanoTime2-nanoTime));

        // Experimenting Duration
        Instant instant = Instant.now();
        Instant instant2 = Instant.now();
        Duration duration = Duration.between(instant, instant2);
        System.out.println("Duraiton between instant and instant2 is :"+duration.getNano());
    }
}
