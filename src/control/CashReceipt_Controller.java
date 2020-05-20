/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import modelo.CashRegisterReceipt;
import javax.swing.JOptionPane;

/**
 *
 * @author daniel.rodriguez
 */
public class CashReceipt_Controller {

    private CashRegisterReceipt c = new CashRegisterReceipt();

    public void CashRegisterReceipts(int no, String city, String date, String address, String received, int sum, String concept, int check,
            String bank, String branchOffice, int cash) {
        c.setNo(no);
        c.setCity(city);
        c.setDate(date);
        c.setAddress(address);
        c.setReceived(received);
        c.setSum(sum);
        c.setConcept(concept);
        c.setCheck(check);
        c.setBank(bank);
        c.setBranchOffice(branchOffice);
        c.setCash(cash);
        JOptionPane.showMessageDialog(null, "Cash Receipt registred!");
    }

    public Object loadCash() {

        Object[] o = new Object[11];
        o[0] = c.getNo();
        o[1] = c.getCity();
        o[2] = c.getDate();
        o[3] = c.getAddress();
        o[4] = c.getReceived();
        o[5] = c.getSum();
        o[6] = c.getConcept();
        o[7] = c.getCheck();
        o[8] = c.getBank();
        o[9] = c.getBranchOffice();
        o[10] = c.getCash();

        return o;

    }

}
