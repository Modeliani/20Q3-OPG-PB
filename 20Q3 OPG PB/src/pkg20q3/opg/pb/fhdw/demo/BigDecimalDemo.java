
package pkg20q3.opg.pb.fhdw.demo;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;


public class BigDecimalDemo {
    
    public static void main(String[] args){
        BigDecimal facor1 = new BigDecimal("1236578023576.90452876");
        BigDecimal facor2 = new BigDecimal("123657802357634534.134534045876");
        
        BigDecimal product = facor1.multiply(facor2);
        System.out.println(product);
        System.out.println(product.round(new MathContext(product.toBigInteger().toString().length(), RoundingMode.HALF_UP)));
    }
    
}
