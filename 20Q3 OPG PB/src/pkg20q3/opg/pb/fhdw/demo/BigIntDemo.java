
package pkg20q3.opg.pb.fhdw.demo;

import java.math.BigInteger;


public class BigIntDemo {
    
    public static void main(String[] agrs){
        BigInteger factor1 = new BigInteger("1234567890123456789");
        BigInteger factor2 = new BigInteger("1234566778897657354634645683657");
        BigInteger product = factor1.multiply(factor2);
        System.out.println(product);
        product = factor1.pow(3);
        System.out.println(product);
        System.out.println(factor2.max(product));
    }
    
}
