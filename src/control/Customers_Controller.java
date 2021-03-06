/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.Customer;
import javax.swing.JOptionPane;
import utils.paneColor;

/**
 *
 * @author Daniel
 */
public class Customers_Controller {
    private final Customer c = new Customer();
    private final paneColor pc = new paneColor();

    public void RegisterCustomers(int id, String name, long phone, String address, String mail){
        c.setId(id);
        c.setName(name);
        c.setPhone(phone);
        c.setAddress(address);
        c.setMail(mail);
        pc.getPanel(null, "Customer Registred", "Regstred", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public Object loadCustomers(){
        
        Object[] o = new Object[5];
        o[0] = c.getId();
        o[1] = c.getName();
        o[2] = c.getPhone();
        o[3] = c.getAddress();
        o[4] = c.getMail();
        
        return o;
    }
}
