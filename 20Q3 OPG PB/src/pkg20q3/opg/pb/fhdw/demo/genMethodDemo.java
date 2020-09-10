
package pkg20q3.opg.pb.fhdw.demo;


public class genMethodDemo {
    public static <T> T random(T m, T n){
        return Math.random() > 0.5 ? m : n;
    }
    
    public static void main(String[] args){
        
        String s = random("Nordsee", "Berge");
        System.out.println(s);
        
    }
    
}
