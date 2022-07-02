/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package person;

import controller.BillController;
import controller.EmployeeController;
import controller.FinanceController;
import controller.ProductController;

/**
 *
 * @author Admin
 */
public class Manager extends Person implements ProductController, BillController, FinanceController,EmployeeController {
    private int id;

    public Manager(int id, String name, String gender, int born) {
        super(name, gender, born);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void setBorn(int born) {
        super.setBorn(born); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public int getBorn() {
        return super.getBorn(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setGender(String gender) {
        super.setGender(gender); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getGender() {
        return super.getGender(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setName(String name) {
        super.setName(name); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getName() {
        return super.getName(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    // chưa hoàn thiện

    @Override
    public void editProduct() {
    }

    @Override
    public void addProduct() {
    }

    @Override
    public void getAllProduct() {
    }

    @Override
    public void addToStock() {
    }

    @Override
    public void createBill() {
    }

    @Override
    public void updateBill() {
    }

    @Override
    public void createFinance() {
    }

    @Override
    public void addEmployee() {
    }

    @Override
    public void deleteEmployee() {
    }

    @Override
    public void editEmployee() {
    }

    @Override
    public void getAllEmployee() {
    }
    
    
}
