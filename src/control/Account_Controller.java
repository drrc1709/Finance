/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.Date;
import javax.swing.JOptionPane;
import model.Account;
import model.Bank;
import utils.paneColor;

/**
 *
 * @author Daniel
 */
public class Account_Controller {

    private final Account a = new Account();
    private final paneColor pc = new paneColor();

    public void AccountRegister(long numberAccount, Bank b, long balance, Date creationDate, String owner, String type) {
        try {
            a.setNumberAccount(numberAccount);
            a.setB(b);
            a.setBalance(balance);
            a.setCreationDate(creationDate);
            a.setOwner(owner);
            a.setType(type);
            pc.getPanel(null, "Account Registred!", "Registred", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            pc.getPanel(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public Object loadAccount() {
        Object[] o = new Object[6];
        o[0] = a.getNumberAccount();
        o[1] = a.getB().getName();
        o[2] = a.getBalance();
        o[3] = a.getCreationDate();
        o[4] = a.getOwner();
        o[5] = a.getType();

        return o;
    }
}
