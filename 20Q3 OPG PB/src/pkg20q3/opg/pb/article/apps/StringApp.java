package pkg20q3.opg.pb.article.apps;

@SuppressWarnings("StringBufferMayBeStringBuilder")
public class StringApp {
    public static String reverseString1(String orig) {
        char[] charArr = orig.toCharArray();

        char[] revCharArr = new char[charArr.length];

        for (int i = 0; i < charArr.length; i++) {
            revCharArr[i] = charArr[charArr.length - 1 - i];
        }

        return new String(revCharArr);
    }

    public static String reverseString2(String orig) {
        StringBuffer buffer = new StringBuffer(orig);

        return buffer.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println("Reverse of \"abcd\" (method 1): " + reverseString1("abcd"));
        System.out.println("Reverse of \"abcde\" (method 1): " + reverseString1("abcde"));
        System.out.println("Reverse of \"abcd\" (method 2): " + reverseString2("abcd"));
        System.out.println("Reverse of \"abcde\" (method 2): " + reverseString2("abcde"));
    }
}
