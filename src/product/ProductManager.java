/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package product;


import config.JDBCConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.prefs.Preferences;
/**
 *
 * @author Admin
 */

//= userdao
public class ProductManager {

    public ProductManager() {
    }
     
    
     public List<Book> getListBook(){
        List<Book> bookList = new ArrayList<>();
        Connection connection = JDBCConnection.getJDBCConnection();
        PreparedStatement pst= null;
        
        String sql =" SELECT * FROM book";
        
        try {
            pst= connection.prepareStatement(sql);
            ResultSet rs= pst.executeQuery();
            
            while(rs.next()){
            Book book= new Book();
            
            book.setId(rs.getString("ID"));
            book.setCode(rs.getString("CODE"));
            book.setName(rs.getString("Name"));
            book.setPurchasePrice(rs.getInt("purcharPrice"));
            book.setSalePrice(rs.getInt("SalePrice"));
            book.setRemaining(rs.getInt("Remaining"));
            book.setAddDate(rs.getTimestamp("AddDate"));
            book.setUpdateDate(rs.getTimestamp("UpdateDate"));
            //book.setUpdater();
            book.setProductPlacemernt(rs.getString("ProductPlacement"));
            book.setCategory(rs.getString("Category"));
            book.setPublisher(rs.getString("Publisher"));
            book.setAuthor(rs.getString("Author"));
            
            bookList.add(book);
        }
            
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (pst != null) {
                try {
                    pst.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }        
        return bookList;
    }
    
    
    public Book findBook(String code){
        Connection connection = JDBCConnection.getJDBCConnection();
        PreparedStatement pst = null;

        String sql = "SELECT * FROM book WHERE code = ?";

        try {
            pst = connection.prepareStatement(sql);
            pst.setString(1, code);
            ResultSet rs = pst.executeQuery();

            while(rs.next()){
            Book book= new Book();
            
            book.setId(rs.getString("ID"));
            book.setCode(rs.getString("CODE"));
            book.setName(rs.getString("Name"));
            book.setPurchasePrice(rs.getInt("purcharPrice"));
            book.setSalePrice(rs.getInt("SalePrice"));
            book.setRemaining(rs.getInt("Remaining"));
            book.setAddDate(rs.getTimestamp("AddDate"));
            book.setUpdateDate(rs.getTimestamp("UpdateDate"));
            //book.setUpdater(updater);
            book.setProductPlacemernt(rs.getString("ProductPlacement"));
            book.setCategory(rs.getString("Category"));
            book.setPublisher(rs.getString("Publisher"));
            book.setAuthor(rs.getString("Author"));
            
            return book;
        }

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (pst != null) {
                try {
                    pst.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
        return null;
    }
    
        public void addProduct(Book book) {
        Connection connection = JDBCConnection.getJDBCConnection();
        PreparedStatement pst = null;
        String sql = "INSERT INTO book (Code, Name, PurcharPrice, SalePrice, Remaining, AddDate, UpdateDate, Updater,ProductPlacement, Category, Publisher, Author) "
                + "VALUE(?,?,?,?,?,?,?,?,?,?,?,?)";
 
        try {
            pst = connection.prepareStatement(sql);
            pst.setString(1,book.getCode() );
            pst.setString(2,book.getName() );
            pst.setInt(3, (int) book.getPurchasePrice());
            pst.setInt(4, (int) book.getSalePrice());
            pst.setInt(5,book.getRemaining() );
            pst.setTimestamp(6, (Timestamp) book.getAddDate());
            pst.setTimestamp(7, (Timestamp) book.getUpdateDate());
            pst.setInt(8,book.getUpdater().getId() );
            pst.setString(9,book.getProductPlacement() );
            pst.setString(10,book.getCategory() );
            pst.setString(11,book.getPublisher() );
            pst.setString(12,book.getAuthor() );

            int rs = pst.executeUpdate();
            System.out.println(rs);

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (pst != null) {
                try {
                    pst.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
    
        
        
}
