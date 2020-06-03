/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import javax.swing.JOptionPane;
import model.Customer;
import model.Quotation;
import utils.paneColor;

/**
 *
 * @author Daniel
 */
public class Quotation_Controller {

    private final Quotation q = new Quotation();
    private final paneColor pc = new paneColor();

    public void registerQuotation(int no, Customer c, int t, int p) {
        q.setC(c);
        q.setNo(no);
        q.setT(t);
        q.setP(p);
        pc.getPanel(null, "Quotation Registred!", "Registred", JOptionPane.INFORMATION_MESSAGE);
    }

    public Object loadQuotation() {
        Object[] o = new Object[4];
        o[0] =q.getNo();
        o[1] =q.getC();
        o[2] =q.getP();
        o[3] =q.getT();

        return o;
    }

}
