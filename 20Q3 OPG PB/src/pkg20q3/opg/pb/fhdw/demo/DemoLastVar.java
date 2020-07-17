
package pkg20q3.opg.pb.fhdw.demo;


public class DemoLastVar {
    
    private static void testLastVar(int j, String ... strings){
        System.out.println(j + ": " + strings.length);
        for(int i = 0; i < strings.length; i++){
            System.out.print(strings[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args){
        
        testLastVar(99999, "test");
        testLastVar(99999, "Hier", "kommen", "viele", "Strings");        
    }
}
