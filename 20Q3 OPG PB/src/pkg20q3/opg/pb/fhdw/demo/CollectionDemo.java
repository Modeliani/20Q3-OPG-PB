
package pkg20q3.opg.pb.fhdw.demo;

import java.util.LinkedList;

public class CollectionDemo {
   public static void main(String[] args){
       
       LinkedList<String> list = new LinkedList<String>();
       System.out.println(list);
       System.out.println("Size = " + list.size());
       list.add("Peter");
       list.add("und");
       list.add("der");
       list.add("Wolf");
       list.add("ist ein russisches Märchen");
       System.out.println(list);
       System.out.println("Size = " + list.size());
       list.remove("Wolf");
       System.out.println("Size = " + list.size());
       printStringList(list);
       
   } 
   private static void printStringList(LinkedList<String> list){
       int size = list.size();
       int i = 0;
       for(String entry: list){
           if(i != 0 && size > i){
               entry = "-" + entry;
           }
           System.out.print(entry);
           i++;
       }
       System.out.println();
   }
}
