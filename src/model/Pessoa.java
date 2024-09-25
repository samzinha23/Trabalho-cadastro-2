package model;

import java.io.Serializable;

public class Pessoa implements Serializable {
    private int id;
    private String name;

    public Pessoa(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public void setname(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void exibir() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}
