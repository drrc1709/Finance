/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.Bank;
import javax.swing.JOptionPane;
import utils.paneColor;

/**
 *
 * @author Daniel
 */
public class Banks_Controller {

    private final Bank b = new Bank();
    private final paneColor pc = new paneColor();

    public void BanksRegister(int id, String name, long number, String manager, String address, String webSite) {
        b.setId(id);
        b.setName(name);
        b.setPhoneNumber(number);
        b.setManager(manager);
        b.setAddress(address);
        b.setWebSite(webSite);
        pc.getPanel(null, "Bank Registred!", "Registred", JOptionPane.INFORMATION_MESSAGE);
    }

    public Object BankLoad() {

        Object[] o = new Object[9];
        o[0] = b.getId();
        o[1] = b.getName();
        o[2] = b.getPhoneNumber();
        o[3] = b.getManager();
        o[4] = b.getAddress();
        o[5] = b.getWebSite();

        return o;
    }

}
