
package pkg20q3.opg.pb.exceptions;

import static pkg20q3.opg.pb.article.controller.ArticleSetCtr.printArticleSet;
import pkg20q3.opg.pb.article.model.ArticleSet;
import pkg20q3.opg.pb.article.utils.Console;


public class ArithmeticExceptionDemo {
    
    public static void main(String[] args){
    try{
        int a = 7;
        int b = 0;
        if (b == 0){
            throw new DivisionByZeroException("*** Teilen durch 0 geht nicht ***");
        }
        int c = a / b;
        System.out.println("C = " + c);
        
        }catch (DivisionByZeroException divisionByZeroException){
            System.out.println("*** Teilen durch 0 geht nicht ***");
        }
    }
}
