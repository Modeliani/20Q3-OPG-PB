
package pkg20q3.opg.pb.fhdw.demo;


public class StringBufferDemo {
    
    public static void main(String[] args){
        StringBuffer stringBuffer = new StringBuffer("text");
        stringBuffer.append(" added Text");
        System.out.println(stringBuffer);
        stringBuffer.delete(0, 4);
        System.out.println(stringBuffer);
        stringBuffer.replace(0, 1, "NewText");
        System.out.println(stringBuffer);
        stringBuffer.reverse();
        System.out.println(stringBuffer);
        String str1 = stringBuffer.toString();
    }
}
