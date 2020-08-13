
package pkg20q3.opg.pb.fhdw.demo;

import java.text.DecimalFormat;


public class DecFormaterDemo {
    
    public static void main(String[] args){
        String pattern = "###,###.###";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);
        
        double zahl = 123.24d;
        String formated1 = decimalFormat.format(zahl);
        System.out.println("Zahl: " + formated1);
        
        String pattern2 = "0%";
        DecimalFormat decimalFormat2 = new DecimalFormat(pattern2);
        
        String formated2 = decimalFormat2.format(1.12);
        System.out.println("Prozentsatz: " + formated2);
    }
}
