
package pkg20q3.opg.pb.fhdw.demo;

import java.util.ArrayList;


public class WrapperDemo {
    
    public static void main(String[] args){
        int i = 123;
        Integer j = new Integer(123);
        
        String sInt = "10";
        int x = Integer.parseInt(sInt);
        System.out.println(x);
        
        Integer intWrapper = new Integer(5); //Boxing
        
        System.out.println(intWrapper.intValue()); //unboxing
        
        System.out.println(intWrapper); //autoboxing
        
        int y = intWrapper;
        
        //Collection Framework
        
        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.add(new Integer(10));
        numberList.add(100);
        System.out.println(numberList.get(0));
        System.out.println(numberList.get(1));
    }
    
}
