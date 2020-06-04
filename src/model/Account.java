/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author katherin.saenz
 */
public class Account {
    private long numberAccount;
    private Bank b;
    private long balance;
    private Date creationDate;
    private String owner;
    private String type;

    public Account() {
    }

    public Account(long numberAccount, Bank b, long balance, Date creationDate, String owner, String type) {
        this.numberAccount = numberAccount;
        this.b = b;
        this.balance = balance;
        this.creationDate = creationDate;
        this.owner = owner;
        this.type = type;
    }

    public long getNumberAccount() {
        return numberAccount;
    }

    public void setNumberAccount(long numberAccount) {
        this.numberAccount = numberAccount;
    }

    public Bank getB() {
        return b;
    }

    public void setB(Bank b) {
        this.b = b;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return getOwner();
    }
}
