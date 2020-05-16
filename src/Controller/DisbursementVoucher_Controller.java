/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.DisbursementVoucher;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class DisbursementVoucher_Controller {

    private DisbursementVoucher dv = new DisbursementVoucher();

    public void Register_DisbursementVoucher(String bank, String branch, int cash, int check, int code, String concept, String debit, int no, int value, String date) {
        dv.setBank(bank);
        dv.setBranch(branch);
        dv.setCash(cash);
        dv.setCheck(check);
        dv.setCode(code);
        dv.setConcept(concept);
        dv.setDebit(debit);
        dv.setNo(no);
        dv.setValue(value);
        dv.setDate(date);
        JOptionPane.showMessageDialog(null, "Disbursement Voucher Registred!");
    }

    public Object loadDisbursement() {
        Object[] o = new Object[10];
        o[0] = dv.getDate();
        o[1] = dv.getNo();
        o[2] = dv.getCode();
        o[3] = dv.getConcept();
        o[4] = dv.getValue();
        o[5] = dv.getCheck();
        o[6] = dv.getBank();
        o[7] = dv.getBranch();
        o[8] = dv.getDebit();
        o[9] = dv.getCash();

        return o;
    }
}
