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
public class Bank {

    private int id;
    private String name;
    private long phoneNumber;
    private String manager;
    private String address;
    private String webSite;

    public Bank() {
        id=0;
        name="no name";
        phoneNumber=0;
        manager="John Doe";
        address="no addres";
        webSite="www.bank.com";
        
    }

    public Bank(int id, String name, long number, String manager, String address, String webSite) {
        this.id = id;
        this.name = name;
        this.phoneNumber = number;
        this.manager = manager;
        this.address = address;
        this.webSite = webSite;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    
}
