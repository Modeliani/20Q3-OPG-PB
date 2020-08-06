
package pkg20q3.opg.pb.fhdw.demo;


public class DemoArray {
    
    public static void main(String[] args){
        int zahlenArr [][] = {{1,2,3,4}, {6}, null, {8,9}};
        for (int i = 0; i < 4; i++){
            System.out.print("[");
            for (int ij = 0; ij < 4; ij++){
                try {
                    System.out.print(zahlenArr [i][ij]);
                }
                catch(Exception e){
                    System.out.print(" empty cell ");
                }
                if (ij < 3){
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
    }
}
