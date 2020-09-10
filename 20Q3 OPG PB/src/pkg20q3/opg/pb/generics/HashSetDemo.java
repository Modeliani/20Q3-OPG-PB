
package pkg20q3.opg.pb.generics;

import java.util.HashSet;
import java.util.Iterator;


public class HashSetDemo {
    
    public static void main(String[] args){
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("Hello ");
        hashSet.add("World");
        System.out.println(hashSet.size());
        System.out.println(hashSet);
        hashSet.add("World");
        System.out.println(hashSet);
        System.out.println(hashSet.contains("World"));
        HashSet<String> hashSet2 = new HashSet<String>();
        hashSet2.add("Hello ");
        System.out.println(hashSet.containsAll(hashSet2));
        Iterator<String> i = hashSet.iterator();
        while(i.hasNext()){
            System.out.print(i.next());
        }
    }
    
}
