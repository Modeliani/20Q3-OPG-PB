
package pkg20q3.opg.pb.article.apps;

import pkg20q3.opg.pb.article.model.Customer;

public class CustomerApp {
    
    public static void main(String[] args){
        Customer customer = new Customer("Heinz Peter", "Adresse...");
        System.out.println(customer.toString());
    }
    
}
