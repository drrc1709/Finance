/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author daniel.rodriguez
 */
public class CashRegisterReceipt {

    private int idReceipt;
    private Date date;
    private Customer c;
    private Account a;
    private long value;
    private String concept;

    public CashRegisterReceipt() {
    }

    public CashRegisterReceipt(int idReceipt, Date date, Customer c, Account a, long value, String concept) {
        this.idReceipt = idReceipt;
        this.date = date;
        this.c = c;
        this.a = a;
        this.value = value;
        this.concept = concept;
    }

    public int getIdReceipt() {
        return idReceipt;
    }

    public void setIdReceipt(int idReceipt) {
        this.idReceipt = idReceipt;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Customer getC() {
        return c;
    }

    public void setC(Customer c) {
        this.c = c;
    }

    public Account getA() {
        return a;
    }

    public void setA(Account a) {
        this.a = a;
    }

    public long getValue() {
        return value;
    }

    public void setValue(long value) {
        this.value = value;
    }

    public String getConcept() {
        return concept;
    }

    public void setConcept(String concept) {
        this.concept = concept;
    }
}
