
package pkg20q3.opg.pb.generics;


public class Pair <T> {
    
    T first;
    T second;
    
    public Pair(T first, T second){
        this.first = first;
        this.second = second;
    }
    
    public T getFirst(){
        return first;
    }
    
    public void setFirst(T first){
        this.first = first;
    }
    
    public T getSecond(){
        return second;
    }
    
    public void setSecond(T second){
        this.second = second;
    }  
    
    @Override
    public String toString(){
        return "Pair{" + first + ", " + second + '}';
    }
    
    public void swap(){
        T temp;
        temp = first;
        first = second;
        second = temp;
    }
}
