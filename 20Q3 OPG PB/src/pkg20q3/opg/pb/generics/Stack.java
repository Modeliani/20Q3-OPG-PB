package pkg20q3.opg.pb.generics;

/**
 *
 * @author katha
 */
public class Stack <T>  {

    // StackNode ist innere Klasse von Stack
    private class StackNode<T> {
        T object;
        StackNode<T> next;
        
        public StackNode(T object, StackNode<T> next){
            this.object = object;
            this.next = next;
        }
        
        public T getObject(){
            return object;
        }
        
        public void setObject(T object){
            this.object = object;
        }
        
        public StackNode<T> getNext(){
            return next;
        }
        
        public void setNext(StackNode<T> next){
            this.next = next;
        }
        
        public boolean isLast(){
            return next == null;
        }
        
        @Override
        public String toString(){
            return object.toString();
        }
    }
    
    //Beginn eigentliche Klasse Stack
    private StackNode<T> top;
    
    public Stack(){
        top = null;
    }
    
    public void push(T object){
        StackNode<T> node = new StackNode<T>(object, null);
        if(top != null){
            node.next = top;
            top = node;
        }else{
            top = node;
        }
    }
    
    public T pop(){
        if (top != null) {
            StackNode<T> node = top;
            top = top.next;
            return node.object;
        } else {
            return null;
        }
    }
    
    public boolean isEmpty(){
        return top == null;
    }

}