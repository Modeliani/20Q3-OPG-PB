
package pkg20q3.opg.pb.fhdw.demo;

import pkg20q3.opg.pb.generics.List;


public class ListDemo {
   public static void main(String[] args){
       
       List<String> stringList = new List<String>();
       System.out.println(stringList);
       System.out.println("Lenght = " + stringList.getLength());
       stringList.add("Peter");
       stringList.add("und");
       stringList.add("der");
       stringList.add("Wolf");
       stringList.add("ist ein russisches Märchen");
       System.out.println(stringList);
       System.out.println("Lenght = " + stringList.getLength());
       System.out.println(stringList.getObjectAtPosition(0));
       System.out.println(stringList.getObjectAtPosition(3));
   } 
}
