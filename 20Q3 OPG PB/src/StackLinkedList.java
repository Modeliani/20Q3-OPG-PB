/**
 *
 * @author Katharina H.
 */
import java.util.LinkedList;

public class StackLinkedList <T> {

    private LinkedList<T> list;
    
    public StackLinkedList() {
        list = new LinkedList<T>();
    }
       
    public void push(T object){
        if (list != null)
            list.push(object);
    }
    
    public T pop(){
        if(list != null){
            return list.pop();
        }
        return null;
    }
    
    public boolean isEmpty(){
        return list.isEmpty();
    }
}
