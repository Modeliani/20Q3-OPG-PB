/**
 *
 * @author Katharina H.
 */
package pkg20q3.opg.pb.generics;

import java.util.ArrayList;

public class StackArrayList <T> {

    private ArrayList<T> list;
    
    public StackArrayList() {
        list = new ArrayList<T>();
    }
       
    public void push(T object){
        if(list != null){
            list.add(object);
        }
    }
    
    public T pop(){
        if(list != null && !list.isEmpty()){
            T temp = list.get(list.size()-1);        
            list.remove(temp);
            return temp;
        }
        return null;
    }
    
    public boolean isEmpty(){
        return list.isEmpty();
    }
}
