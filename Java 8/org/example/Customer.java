package org.example;

import java.util.List;

public class Customer {
    private int id;
    private String name;
    private String email;
    private List<Double> phone;

    public Customer() {
    }

    public Customer(int id, String name, String email, List<Double> phone) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
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

    public List<Double> getPhone() {
        return phone;
    }

    public void setPhone(List<Double> phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}