
package pkg20q3.opg.pb.fhdw.demo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.Year;


public class DateTimeDemo {
    public static void main(String[] args){
        LocalDate today = LocalDate.now();
        System.out.println("today: " + today);
        
        LocalDate someWeeksBefore = today.minusWeeks(5);
        System.out.println("some weeks before: " + someWeeksBefore);
        
        LocalDate in10Days = today.plusWeeks(5).plusDays(10);
        System.out.println("in 10 Days: " + in10Days);
        
        LocalDateTime in3Hours = LocalDateTime.now();
        System.out.println("in 3 hours: " + in3Hours);
        System.out.println("in 3 hours: " + in3Hours.plusHours(3));
        
        Year thisYear = Year.now();
        System.out.println("aktuelles Jahr: " + thisYear);
        
        Year anotherYear = thisYear.minusYears(2020);
        for(int i = 1; i < 2020; i++){
            if(anotherYear.isLeap()){
                System.out.println(anotherYear + " is leap year.");
            }
            anotherYear = anotherYear.plusYears(1);
        }
        LocalDate silvester = LocalDate.of(2020, Month.DECEMBER, 31);
        LocalDate holyEve = LocalDate.of(2020, Month.DECEMBER, 24);
        Period peroid = holyEve.until(silvester);
        System.out.println(peroid.getDays() + " days until Silvester from Xmas");
    }
}
