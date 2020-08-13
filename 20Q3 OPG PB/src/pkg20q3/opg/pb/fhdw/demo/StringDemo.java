
package pkg20q3.opg.pb.fhdw.demo;

import pkg20q3.opg.pb.fhdw.model.Subject;


public class StringDemo {
    public static void main(String[] args){
        String string1 = "abcde";
        String string2 = "abcde";
        String string3 = new String("abcde");
        String string4 = "ascd";
        String string5 = null;
        
        System.out.println("str1 u str2: " + string1 == string2);
        System.out.println("str1 u str2 eql: " + string1.equals(string2));
        
        System.out.println("str1 u str3: " + string1 == string3);
        System.out.println("str1 u str3 eql: " + string1.equals(string3));
        
        System.out.println("str1 u str4: " + string1 == string4);
        System.out.println("str1 u str4 eql: " + string1.equals(string4));
        
        System.out.println("str1 u str5: " + string1 == string5);
        System.out.println("str1 u str5 eql: " + string1.equals(string5));
        
        Subject subject = Subject.BUSNESS_COMPUTER_SCIENCE;
        System.out.println(subject.toString().toUpperCase());
    }
}
