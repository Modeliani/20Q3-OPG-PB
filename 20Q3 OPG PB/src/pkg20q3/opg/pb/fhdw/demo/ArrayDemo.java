
package pkg20q3.opg.pb.fhdw.demo;


public class ArrayDemo {
    
    private static int[] copyIntArray(int[] intArray){
        if(intArray != null){
            int[] result = new int[intArray.length];
            int counter = 0;
            for (int value: intArray){
                result[counter] = value;
                counter++;
            }
            return result;
        }else{
            return null;
        }
    }
    
    public static int[] getReverse(int[] intArray){
        if(intArray != null){
            int[] result = new int[intArray.length];
            int counter = intArray.length-1;
            for (int value: intArray){
                result[counter] = value;
                counter--;
            }
            return result;
        }else{
            return null;
        }
    }
    
    private static void printIntArray(int[] intArray){
        if(intArray != null){
            System.out.print("[");
            for(int value: intArray){
                System.out.print(value + " ");
            }
            System.out.print("]\n");
        }else{
            System.out.println("*** no array available ***");
        }
    }
    
    private static boolean isEqual(int[] intArray1, int[] intArray2){
        if(intArray1 != null && intArray2 != null){
            if(intArray1.length == intArray2.length){
                for(int i = 1; i < intArray1.length; i++){
                    if(!(intArray1[i] == intArray2[i])){
                        return false;
                    }
                }
            }else{
                return false;
            }
        return true;
        }else if(intArray1 == null && intArray2 == null){
            return true;
        }else{
            return false;
        }
    }
    
    private static boolean isSymetric(int[] intArray){
        if(intArray != null){
            int size = intArray.length/2;
            for(int i = 0; i < size; i++){
                if(!(intArray[i] == intArray[intArray.length-i-1])){
                        return false;
                }
            }
            return true;
            
        }
        return true;
    }
    
    public static void main(String[] args){
        
        //options, how to generate an array
        int[] noArray = null;
        int[] intArray = new int[4]; //new array with 4 components
        int[] primes = {1, 3, 5, 7, 11, 13};
        int[] primes2 = {3, 5, 7, 11, 13, 27};
        
        int[] intArray2 = primes;
        
        int[] intArray3 = null;
        intArray3 = copyIntArray(noArray);
        printIntArray(intArray3);
        intArray3 = copyIntArray(primes);
        printIntArray(intArray3);
        
        int[][] matrix = new int[2][3];
        
        int[][] matrix2 = {{1, 2, 3},
                            {4, 5, 6}};
        
        for(int i = 0; i < matrix2.length; i++){
            for(int j = 0; j < matrix2[i].length; j++){
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }
        
        printIntArray(intArray3);
        printIntArray(getReverse(intArray3));
        
        System.out.println(isEqual(intArray3, getReverse(intArray3)));
        
        int[] intArray4 = {1, 2, 9, 2, 1};
        System.out.println(isSymetric(intArray4));
    }
}
