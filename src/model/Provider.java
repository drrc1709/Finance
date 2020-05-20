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
public class Provider {
    private int id;
    private String name;
    private String address;
    private long phoneNumber;
    private String manager;
    private String email;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getPhone() {
        return phoneNumber;
    }

    public void setPhone(int phone) {
        this.phoneNumber = phone;
    }

    public String getCity() {
        return manager;
    }

    public void setCity(String city) {
        this.manager = city;
    }

    public String geteMail() {
        return email;
    }

    public void seteMail(String mail) {
        this.email = mail;
    }
}
