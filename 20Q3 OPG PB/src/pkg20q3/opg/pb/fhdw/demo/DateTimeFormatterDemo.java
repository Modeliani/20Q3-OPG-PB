
package pkg20q3.opg.pb.fhdw.demo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class DateTimeFormatterDemo {
    public static void main(String[] args){
        LocalDateTime locaDate = LocalDateTime.now();
        System.out.println(locaDate);
        
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.YYYY");
        System.out.println(dateTimeFormatter.format(locaDate));
        
        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("HH:mm");
        System.out.println(dateTimeFormatter2.format(locaDate));
        
        DateTimeFormatter dateTimeFormatter3 = DateTimeFormatter.ofPattern("EEEE");
        System.out.println(dateTimeFormatter3.format(locaDate));
    }
}
