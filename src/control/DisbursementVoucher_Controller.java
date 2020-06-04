/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.Date;
import model.PettyCashVoucher;
import javax.swing.JOptionPane;
import model.Account;
import model.Provider;
import utils.paneColor;

/**
 *
 * @author Daniel
 */
public class DisbursementVoucher_Controller {

    private final PettyCashVoucher dv = new PettyCashVoucher();
    private final paneColor pc = new paneColor();

    public void Register_DisbursementVoucher(int idReceipt, Date date, Provider p, Account a, int value, String concept) {
        dv.setIdReceipt(idReceipt);
        dv.setDate(date);
        dv.setP(p);
        dv.setA(a);
        dv.setValue(value);
        dv.setConcept(concept);
        
        pc.getPanel(null, "Petty Cash Voucher Registred!", "Registred", JOptionPane.INFORMATION_MESSAGE);
    }

    public Object loadDisbursement() {
        Object[] o = new Object[6];
        o[0] = dv.getIdReceipt();
        o[1] = dv.getDate();
        o[2] = dv.getP();
        o[3] = dv.getA().getNumberAccount();
        o[4] = dv.getValue();
        o[5] = dv.getConcept();
        
        return o;
    }
}
