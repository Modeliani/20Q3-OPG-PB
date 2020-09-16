package pkg20q3.opg.pb.generics;

/**
 *
 * @author katha
 */
public class StackDemo {
    
    public static void main(String[] args) {
        Stack<String> stringStack = new Stack<String>();
        stringStack.push("1");
        stringStack.push("2");
        stringStack.push("30");
        stringStack.push("4");
        stringStack.push("5");
        
        while(!stringStack.isEmpty()) {
            System.out.println(stringStack.pop());
        }
        
        StackArrayList<String> stackArrayList = new StackArrayList<String>();
        System.out.println(stackArrayList);
        System.out.println(stackArrayList.pop());
        stackArrayList.push("Hello");
        System.out.println(stackArrayList.pop());
        
        StackArrayList<String> stackArrayList2 = null;
        stackArrayList2.push("Hello");
        System.out.println(stackArrayList2.pop());
        
    }
}