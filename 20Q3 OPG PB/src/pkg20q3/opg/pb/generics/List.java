
package pkg20q3.opg.pb.generics;

public class List<T> {
    
    // ListNote ist innere Klasse von List
    private class ListNote<T> {
        T object;
        ListNote<T> next;
        
        public ListNote(T object, ListNote<T> next){
            this.object = object;
            this.next = next;
        }
        
        public T getObject(){
            return object;
        }
        
        public void setObject(T object){
            this.object = object;
        }
        
        public ListNote<T> getNext(){
            return next;
        }
        
        public void setNext(ListNote<T> next){
            this.next = next;
        }
        
        public boolean isLast(){
            return next == null;
        }
        
        public String toString(){
            return object.toString();
        }
    }
    
    //Beginn eigentliche Klasse Note
    ListNote<T> first;
    ListNote<T> last;
    
    public List(){
        first = null;
        last = null;
    }
    
    public void add(T object){
        ListNote<T> node = new ListNote<T>(object, null);
        if(first != null){
            last.setNext(node);
        }else{
            first = node;
        }
        last = node;
    }
    
    public int getLength(){
        int length = 0;
        for(ListNote<T> node = first; node!=null; node = node.next ){
            length++;
        }
        return length;
    }
    
    public T getObjectAtPosition(int position){
        if(position >= 0 && position < getLength()){
            ListNote<T> node = first;
            for(int i = 0; i < position; i++){
                node = node.next;
            }
            return node.getObject();
        }
        return null;
    }
    
    public String toString(){
        String result = "{";
        for(ListNote<T> node = first; node!=null; node = node.next){
            result += node.getObject().toString();
            if(!node.isLast()){
                result += ",";
            }
        }
        //result += "}";
        result = result + "}";
        return result;
    }
}
