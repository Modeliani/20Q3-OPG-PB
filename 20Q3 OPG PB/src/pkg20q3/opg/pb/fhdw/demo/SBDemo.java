package pkg20q3.opg.pb.fhdw.demo;

/**
 *
 * @author Florian
 */
public class SBDemo {
    public static void main(String[] args){
        // Treadsafe Access
        StringBuffer stringBuffer = new StringBuffer("text");
        String string = new String(" appended text");
        stringBuffer.append(string);
        System.out.println(stringBuffer);
        stringBuffer.replace(0, 2, "2342342345");
        System.out.println(stringBuffer);
        System.out.println("ref StringBuffer: " + Integer.toHexString(System.identityHashCode(stringBuffer)));
        System.out.println("ref String: " + Integer.toHexString(System.identityHashCode(string)));
        stringBuffer.delete(stringBuffer.length() - string.length(), stringBuffer.length());
        System.out.println(stringBuffer);
        string = "new";
        System.out.println("ref StringBuffer: " + Integer.toHexString(System.identityHashCode(stringBuffer)));
        System.out.println("ref String: " + Integer.toHexString(System.identityHashCode(string)));
    }
}