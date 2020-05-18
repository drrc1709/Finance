/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Providers;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class Providers_Controller {
    private Providers p = new Providers();
    
    public void RegisterProviders(int id, String name, String address, int phone, String city, String mail){
        p.setId(id);
        p.setName(name);
        p.setAddress(address);
        p.setPhone(phone);
        p.setCity(city);
        p.setMail(mail);
        
        JOptionPane.showMessageDialog(null, "Provider Regisred!", "Registred", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public Object loadProvider(){
        
        Object[] o = new Object[6];
        o[0] = p.getId();
        o[1] = p.getName();
        o[2] = p.getAddress();
        o[3] = p.getPhone();
        o[4] = p.getCity();
        o[5] = p.getMail();
        
        return o;
    }
}
