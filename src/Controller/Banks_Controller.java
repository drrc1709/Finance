/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Banks;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class Banks_Controller {

    private Banks b = new Banks();

    public void BanksRegister(int id, String name, int number, String account) {
        b.setId(id);
        b.setName(name);
        b.setNumber(number);
        b.setAccounts(account);
        JOptionPane.showMessageDialog(null, "Bank Registred!", "Registred", JOptionPane.DEFAULT_OPTION);
    }

    public Object BankLoad() {

        Object[] o = new Object[4];
        o[0] = b.getId();
        o[1] = b.getName();
        o[2] = b.getNumber();
        o[3] = b.getAccounts();

        return o;
    }

}
