package pkg20q3.opg.pb.fhdw.demo;

import java.util.StringTokenizer;

/**
 *
 * @author Florian
 */
public class STDemo {
    public static void main(String[] args){
        StringTokenizer st = new StringTokenizer("Dies ist, ein kurzer Text");
        //StringTokenizer st = new StringTokenizer("Dies ist, ein kurzer Text", "i");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
            System.out.println("Anz Token:" + st.countTokens());
        }
        st = new StringTokenizer("this is a test");
        int stCount = st.countTokens();
        for (int i = 0; i < stCount; i++){
            System.out.println(st.nextToken());
        }
    }
}