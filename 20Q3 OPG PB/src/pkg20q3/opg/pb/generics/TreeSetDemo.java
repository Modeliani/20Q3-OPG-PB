
package pkg20q3.opg.pb.generics;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
    
    public static void main(String[] args){
        
        TreeSet<Double> tree = new TreeSet<Double>();
        tree.add(1d);
        tree.add(2d);
        tree.add(4d);
        tree.add(8d);
        tree.add(16d);
        tree.add(32d);
        tree.add(0d);
        tree.add(9d);
        tree.add(-1d);
        tree.add(0.5d);
        tree.add(1d);
        tree.add(3d);
        Iterator<Double> itrDoubleTree = tree.iterator();
        while(itrDoubleTree.hasNext()){
            System.out.println(itrDoubleTree.next());
        }
    }
    
}
