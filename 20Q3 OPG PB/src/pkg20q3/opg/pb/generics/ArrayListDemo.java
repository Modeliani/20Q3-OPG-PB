
package pkg20q3.opg.pb.generics;

import java.util.ArrayList;


public class ArrayListDemo {
    
    public static void main(String[] args){
        ArrayList<List<String>> lists = new ArrayList<List<String>> ();
        List<String> cars = new List<String>();
        cars.add("BMW");
        cars.add("VM");
        cars.add("Tesla");
        cars.add("Ford");
        cars.add("Honda");
        lists.add(cars);
        List<String> countries = new List<String>();
        countries.add("USA");
        countries.add("Germany");
        countries.add("Spain");
        countries.add("Ghana");
        lists.add(countries);
        System.out.println(lists);
        System.out.println(lists.lastIndexOf(countries));
    }
    
}
