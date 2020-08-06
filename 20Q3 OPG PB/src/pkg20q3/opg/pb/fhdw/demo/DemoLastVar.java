
package pkg20q3.opg.pb.fhdw.demo;

public class DemoLastVar{
   
    private static void lastVar(int j, float f, String ... stringSet){
        if (stringSet != null){
            System.out.println("Ans Strings: " + stringSet.length);
            for (int i = 0; i < stringSet.length; i++){
                System.out.print(stringSet[i] + " ");
            }
        }
    }
    
    private static int [] LastInt(String text, int ... integer){
        if (integer != null){
            System.out.println("Ans Strings: " + integer.length);
            for (int j = 0; j < integer.length; j++){
                System.out.print(integer[j] + " ");
            }
        }
        return integer;
    }
    
    public static void main(String[] args){
        String nix = null;
        lastVar(5, 8f, "test");
        lastVar(5, 8f, "hier", "kommen", "viele", "Strings");
        int arr[] = LastInt("Text", 2 ,3, 4, 5, 6, 7, 8);
    }
}