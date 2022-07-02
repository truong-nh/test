/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package product;

import person.Account;
import person.Employee;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        Account account=new Account("usernam", "password", "0949144961");
        Employee ep= new Employee( account, 1241, 4123, "121", "no", 19);
        ProductManager pm = new ProductManager();
        //pm.getListBook();

//       pm.findBook("12").display();
//        Book b= new Book("cate","pub", "bn", "123","code", "name", 0, 0, 0, null,null , ep, "kho");
//        pm.addProduct(b);
//        
                for(Book book:pm.getListBook() ){
            book.display();
        }
        
        
    }
}
