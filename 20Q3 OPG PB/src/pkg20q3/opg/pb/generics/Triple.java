
package pkg20q3.opg.pb.generics;


public class Triple <T> {
    
    //  1      2       3
    //first, second, third
    T first;
    T second;
    T third;
    
    public Triple(T first, T second, T third){
        this.first = first;
        this.second = second;
        this.third = third;
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
    
    public T getThird(){
        return second;
    }
    
    public void setThird(T third){
        this.third = third;
    } 
    
    @Override
    public String toString(){
        return "Pair{" + first + ", " + second + ", " + third + '}';
    }
    
    public void shiftLeft(){
        T temp;
        temp = first;
        first = second;
        second = third;
        third = temp;
    }
    
    public void shriftRight(){
        T temp;
        temp = third;
        third = second;
        second = first;
        first = temp;
    }
}