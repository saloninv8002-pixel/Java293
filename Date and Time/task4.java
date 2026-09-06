import java.util.Date;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.Period;
import java.time.Duration;
import java.util.Calendar;


public class task4{
    public static void main (String args[]){
        Date today =new Date();
        System.out.println(today);//Todays date (date)

        //Java.time.LocalDate
        LocalDate date=LocalDate.now();
        System.out.println("---LOCALDATE---");
        System.out.println();
        System.out.println("---DATE---");
        System.out.println();
        System.out.println("Today's Date : "+date);//yyyy-mm-dd
        System.out.println("Today's Date (d) : "+date.getDayOfMonth());//d
        System.out.println("Today's Date +20 (yyyy-mm-dd) : "+date.plusDays(20));//adds n days to current day
        System.out.println("Today's Date -20 (yyyy-mm-dd) : "+date.minusDays(20));//minus n days
        System.out.println();

        System.out.println("---MONTH---");
        System.out.println();
        System.out.println("Month (month) : "+date.getMonth());//month
        System.out.println("Month (M) : "+date.getMonthValue());//m
        System.out.println("Month + 3 (yyyy-mm-dd) : "+date.plusMonths(3));//adds n months to current day
        System.out.println("Month - 2 (yyyy-mm-dd) : "+date.minusMonths(2));//minus n months
        System.out.println();

        System.out.println("---YEAR---");
        System.out.println();
        System.out.println("Years (yyyy) : "+date.getYear());//yyyy
        System.out.println("Year + 3 (yyyy-mm-dd) : "+date.plusYears(3));//adds n year to current day
        System.out.println("Year - 2 (yyyy-mm-dd) : "+date.minusYears(2));//minus n year
        System.out.println();

        //Java.time.LocalTime
        System.out.println("---LOCALTIME---");
        System.out.println();
        LocalTime time = LocalTime.now();
        System.out.println("Time (HH:mm:ss:ms) : "+time);
        System.out.println();
        System.out.println("---HOUR---");
        System.out.println();
        System.out.println("Hour (HH) : "+time.getHour());
        System.out.println("Hour +3 : "+time.plusHours(3));//Adds 3 hrs to current hr
        System.out.println("Hour -3 : "+time.minusHours(3));//Sub 3 hrs to current hr
        System.out.println();

        System.out.println("---MINUTES---");
        System.out.println();
        System.out.println("Minute (MM) : "+time.getMinute());
        System.out.println("Minutes +20 : "+time.plusMinutes(20));//adds 20 mins
        System.out.println("Minutes -45 : "+time.minusMinutes(45));//minus 45 mins 
        System.out.println();

        System.out.println("---SECOND---");
        System.out.println();
        System.out.println("Second (SS) : "+time.getSecond());
        System.out.println("Seconds +45 : "+time.plusSeconds(45));//add 45 seconds
        System.out.println("Seconds -30 : "+time.minusSeconds(30));//sub 30 sec
        System.out.println();
        
        //LocalDateTime
        System.out.println("---LOCAL DATE AND TIME---");
        System.out.println();
        LocalDateTime date_and_time=LocalDateTime.now();
        System.out.println("Date and Time : "+date_and_time);
        System.out.println("Date (d) : "+date_and_time.getDayOfMonth());
        System.out.println("Month (MONTH) : "+date_and_time.getMonth());
        System.out.println("Year (yyyy) : "+date_and_time.getYear());
        System.out.println("Hours (hh) : "+date_and_time.getHour());
        System.out.println("Minutes (mm) : "+date_and_time.getMinute());
        System.out.println("Second (ss) : "+date_and_time.getSecond());
        System.out.println();

        //DateTimeformatter
        System.out.println("---DATE AND TIME FORMATTER---");
        LocalDateTime answer = LocalDateTime.now();
        DateTimeFormatter display = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        System.out.println("Format 1 : "+answer.format(display));

        DateTimeFormatter display1 = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");
        System.out.println("Format 2 : "+answer.format(display1));

        DateTimeFormatter display2 = DateTimeFormatter.ofPattern("dd MM yyyy HH:mm:ss");
        System.out.println("Format 3 : "+answer.format(display2));

        DateTimeFormatter display3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm a");
        System.out.println("Format 4 : "+answer.format(display3));

        DateTimeFormatter display4 = DateTimeFormatter.ofPattern("EEEE dd/MM/yyyy HH:mm:ss");
        System.out.println("Format 5 : "+answer.format(display4));

        DateTimeFormatter display5 = DateTimeFormatter.ofPattern("dd MM yyyy HH:mm a");
        System.out.println("Format 5 : "+answer.format(display5));

        DateTimeFormatter display6 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm a");
        System.out.println("Format 6 : "+answer.format(display6));

        DateTimeFormatter display7 = DateTimeFormatter.ofPattern("EEEE dd MM yyyy HH:mm:ss");
        System.out.println("Format 7 : "+answer.format(display7));

        DateTimeFormatter display8 = DateTimeFormatter.ofPattern("EEEE dd-MM-yyyy HH:mm:ss");
        System.out.println("Format 8 : "+answer.format(display8));
        System.out.println();

        //period-between-year
        System.out.println("---PERIOD---");
        LocalDate start=LocalDate.of(2008,07,04);
        LocalDate end=LocalDate.now();
        Period Year=Period.between(start,end);
        System.out.println("Years from 2008 to 2026 : "+Year.getYears());

        //Duration
        System.out.println("---DURATION---");
        LocalTime T1=LocalTime.of(8,02);
        System.out.println(T1);
        LocalTime T2=LocalTime.of(10,30);
        System.out.println(T2);
        Duration Ans=Duration.between(T1,T2);
        System.out.println("Duration in Hours : "+Ans.toHours());
        System.out.println("Duration in Minutes : "+Ans.toMinutes());
        System.out.println();

        //Calendar
        System.out.println("---CALENDAR---");
        Calendar cal = Calendar.getInstance();
        System.out.println("Date and Time : "+cal.getTime());
        System.out.println("Hour : "+(cal.get(Calendar.HOUR_OF_DAY)));
        System.out.println("Minute : "+cal.get(Calendar.MINUTE));
        System.out.println("Second : "+cal.get(Calendar.SECOND));
        System.out.println("Year : "+cal.get(Calendar.YEAR));
        System.out.println("Month : "+(cal.get(Calendar.MONTH)+1));
        System.out.println("Date : "+cal.get(Calendar.DAY_OF_MONTH));
        System.out.println();

        //set
        System.out.println("---SET CALENDAR---");
        cal.set(2008,Calendar.JULY,4);
        System.out.println(cal.getTime());
        System.out.println();

        //add
        System.out.println("---ADD CALEDAR---");
        cal.add(Calendar.MONTH,2);
        System.out.println(cal.getTime());
        System.out.println();

        //sub
        System.out.println("---SUB CALEDAR---");
        cal.add(Calendar.DAY_OF_MONTH,-2);
        System.out.println(cal.getTime());
        System.out.println();

        System.out.println("---BASIC---");
        System.out.println();
        System.out.println("Today's Date : "+date);//yyyy-mm-dd
        System.out.println("Time (HH:mm:ss:ms) : "+time);
        System.out.println("Date and Time : "+date_and_time);
        System.out.println("Year (yyyy) : "+date_and_time.getYear());
        System.out.println("Month (MONTH) : "+date_and_time.getMonth());
        System.out.println();

        System.out.println("---INTERMEDIATE---");

        LocalDate date3=LocalDate.now();
        DateTimeFormatter display9 = DateTimeFormatter.ofPattern("EEEE ");
        System.out.println("Day : "+date3.format(display9));
        System.out.println();

        LocalDate date1 = LocalDate.of(2026, 8, 6);
        System.out.println("Day Number in the Year : "+date1.getDayOfYear());
        System.out.println();


        LocalDate date2 = LocalDate.of(2008, 7, 4);
        System.out.println("Birth Day Date : "+date2);
        System.out.println();

        System.out.println("Today's Date +30 (yyyy-mm-dd) : "+date.plusDays(30));
        System.out.println("Today's Date -15 (yyyy-mm-dd) : "+date.minusDays(15));
        System.out.println();
        
        cal.set(2026,Calendar.AUGUST,6);
        cal.add(Calendar.MONTH,+6);
        System.out.println("+6 Months to Today's Day : "+cal.getTime());
        System.out.println();

        cal.set(2026,Calendar.AUGUST,6);
        cal.add(Calendar.YEAR,+2);
        System.out.println("+2 Years to Today's Day : "+cal.getTime());
        System.out.println();

        System.out.println("Date and Time : "+cal.getTime());
        DateTimeFormatter display10 = DateTimeFormatter.ofPattern("dd/MM/yyyy ");
        System.out.println("dd/MM/yyyy : "+answer.format(display10));
        System.out.println();

        DateTimeFormatter display11 = DateTimeFormatter.ofPattern("dd MM yyyy HH:mm:ss");
        System.out.println("dd MM yyyy HH:mm:ss : "+answer.format(display11));
        System.out.println();

        System.out.println("---ADVANCED---");

        LocalDate Date1=LocalDate.of(2008,7,4);
        LocalDate Date2=LocalDate.now();
        System.out.println("Date 1 : "+Date1);
        System.out.println("Date 2 : "+Date2);
        System.out.println();

        System.out.println("Is Date1 Before Date2 ? : "+Date1.isBefore(Date2));
        System.out.println("Is Date1 After Date2 ? : "+Date1.isAfter(Date2));
        System.out.println("Is both Dates Are equal ? : "+Date1.isEqual(Date2));
        System.out.println();

        System.out.println("Employee Joining Date : "+date);
        LocalDate date5=date.plusYears(1);
        System.out.println("After 1.6 Years : "+date5.plusMonths(6));
        System.out.println();

        System.out.println("---STUDENT AGE CALCULATOR---");
        LocalDate date_1 = LocalDate.of(2008, 7, 4);
        System.out.println("Birth Day Date : "+date_1);
        LocalDate date_2=LocalDate.now();
        System.out.println("Current Date : "+date_2);
        Period Year_1=Period.between(date_1,date_2);
        System.out.println("Years from 2008 to 2026 : "+Year_1.getYears());
        System.out.println("Current Week Day : "+date_2.getDayOfWeek());
        DateTimeFormatter display_1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println("Format (dd-MM-YYYY): "+date_1.format(display_1));
        System.out.println();        
    }
}
