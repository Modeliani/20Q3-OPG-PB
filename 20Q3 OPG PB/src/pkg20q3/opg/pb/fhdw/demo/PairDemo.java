
package pkg20q3.opg.pb.fhdw.demo;

import drawable.Sizeable;
import pkg20q3.opg.pb.fhdw.model.Location;
import pkg20q3.opg.pb.fhdw.model.Person;
import pkg20q3.opg.pb.fhdw.model.Role;
import pkg20q3.opg.pb.generics.Pair;


public class PairDemo {
    public static void main(String[] args){
        Pair<String> stringPair = new Pair<String>("Hans", "Lotte");
        
        System.out.println(stringPair);
        stringPair.setSecond("Hänschen");
        stringPair.swap();
        System.out.println(stringPair);
        
        Pair<Person> personPair = new Pair<Person>(new Person("Peter", null), new Person("Greta", new Location("Bandelstr", 12345, "Köln")));
        System.out.println(personPair);
        personPair.swap();
        System.out.println(personPair);
        
        Pair<Role> rolePair = new Pair<Role>(Role.VISITING_LECTURER, Role.PROFESSOR_ONLY);
        System.out.println(rolePair);
        rolePair.swap();
        System.out.println(rolePair);
        
        int[] intArray1 = {1, 2, 3};
        int[] intArray2 = {3,7,13,27};
        Pair<int[]> intArrayPair = new Pair<int[]>(intArray1, intArray2);
        
        Pair<Sizeable> sizeablePair;
        
        Pair<Integer> intPair = new Pair<Integer>(1, 2);
        System.out.println(intPair);
    }
}
