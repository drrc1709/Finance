/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.Provider;
import javax.swing.JOptionPane;
import utils.paneColor;

/**
 *
 * @author Daniel
 */
public class Providers_Controller {
    private final Provider p = new Provider();
    private final paneColor pc = new paneColor();
    
    public void RegisterProviders(int id, String name, String address, long phoneNumber, String manager, String email){
        p.setId(id);
        p.setName(name);
        p.setAddress(address);
        p.setPhoneNumber(phoneNumber);
        p.setManager(manager);
        p.setEmail(email);
        
        pc.getPanel(null, "Provider Regisred!", "Registred", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public Object loadProvider(){
        
        Object[] o = new Object[6];
        o[0] = p.getId();
        o[1] = p.getName();
        o[2] = p.getAddress();
        o[3] = p.getPhoneNumber();
        o[4] = p.getManager();
        o[5] = p.getEmail();
        
        return o;
    }
}
