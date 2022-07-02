/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package person;

/**
 *
 * @author Admin
 */
public class Customer extends Person {
   private Account account;
   private int id;
   private int point;

    public Customer(Account account, int id, int point, String name, String gender, int born) {
        super(name, gender, born);
        this.account = account;
        this.id = id;
        this.point = point;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }
   
}
