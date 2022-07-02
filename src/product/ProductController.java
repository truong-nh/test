/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package product;

import java.util.List;



/**
 *
 * @author Admin
 */
//=userservice
public class ProductController {
    private ProductManager pm;

    public ProductController() {
      pm = new ProductManager();
    }
    
    public List<Book> getListBook(){
      return pm.getListBook();
    }
    
    public Book findBook(String code){
      return pm.findBook(code);
    }
    public void addBook(Book book){
       pm.addProduct(book);
    }
    
}
