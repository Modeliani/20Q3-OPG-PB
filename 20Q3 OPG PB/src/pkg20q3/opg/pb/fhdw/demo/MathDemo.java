
package pkg20q3.opg.pb.fhdw.demo;

import java.math.*;

public class MathDemo {
    
    public static void main(String[] args){
    //Absolut, Min, Max
    System.out.println(Math.abs(3.9));
    System.out.println(Math.max(1000, -3));
    System.out.println(Math.min(1000, -3));
    
    //Exponentialfunc
    System.out.println(Math.exp(0));
    System.out.println(Math.exp(1));
    System.out.println(Math.exp(100000000));
    System.out.println(Math.exp(-100000000));
    
    //Log
    System.out.println(Math.log(0));
    System.out.println(Math.log(1));
    
    //sqrt
    int a = 10;
    int b = 8;
    System.out.println(Math.sqrt(a*a + b*b));
    //tri
    System.out.println(Math.cos(90000000));
    }
}
