/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.Date;
import model.CashRegisterReceipt;
import javax.swing.JOptionPane;
import model.Customer;
import model.Account;
import utils.paneColor;

/**
 *
 * @author daniel.rodriguez
 */
public class CashReceipt_Controller {

    private final CashRegisterReceipt crc = new CashRegisterReceipt();
    private final paneColor pc = new paneColor();

    public void CashRegisterReceipts(int idReceipt, Date date, Customer c, Account a, long value, String concept) {
        crc.setIdReceipt(idReceipt);
        crc.setDate(date);
        crc.setC(c);
        crc.setA(a);
        crc.setValue(value);
        crc.setConcept(concept);
        
        pc.getPanel(null, "Cash Receipt registred!", "Registred", JOptionPane.INFORMATION_MESSAGE);
    }       

    public Object loadCash() {

        Object[] o = new Object[6];
        o[0] = crc.getIdReceipt();
        o[1] = crc.getDate();
        o[2] = crc.getC().getName();
        o[3] = crc.getA().getOwner();
        o[4] = crc.getValue();
        o[5] = crc.getConcept();
        
        return o;
    }

}
