
package pkg20q3.opg.pb.fhdw.demo;

import java.util.StringTokenizer;


public class StringTokenizerDemo {
    public static void main(String[] args){
        StringTokenizer st = new StringTokenizer("Dies ist ein kurzer Text.");
        System.out.println("Anz Token: " + st.countTokens());
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
            System.out.println("Anz Token: " + st.countTokens());
        }
        StringTokenizer st2 = new StringTokenizer("this is a test");
        int tokenCount = st2.countTokens();
        for(int i = 0; i < tokenCount; i++){
            System.out.println(st2.nextToken());
        }
    }
}
