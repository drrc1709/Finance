/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Employee;
import javax.swing.JOptionPane;

/**
 *
 * @author daniel.rodriguez
 */
public class EmployeeController {

    Employee e = new Employee();

    public Employee showEmployee(int id, String name, String address, long phoneNumber, long salary, String charge) {

        e.setIdEmployee(id);
        e.setName(name);
        e.setAddress(address);
        e.setPhoneNumber(phoneNumber);
        e.setSalary(salary);
        e.setCharge(charge);
        
        return e;
    }

}
