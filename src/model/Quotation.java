/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Daniel
 */
public class Quotation {

    private int no ;
    private Customer c;
    private int t ;
    private int p ;

    public Quotation() {
    }

    public Quotation(int no, Customer c, int t, int p) {
        this.no = no;
        this.c = c;
        this.t = t;
        this.p = p;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public Customer getC() {
        return c;
    }

    public void setC(Customer c) {
        this.c = c;
    }

    public int getT() {
        return t;
    }

    public void setT(int t) {
        this.t = t;
    }

    public int getP() {
        return p;
    }

    public void setP(int p) {
        this.p = p;
    }   
}
