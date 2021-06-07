/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author linda
 */
public class User {
    
    private String fname;
    private String lname;
    private String login;
    private String password;
    //17-05-2021
    private int id;
    private String email;
    private String image;

    public User() {
    }
    
    /*
    After 17-05 u add field email to this contructor
    */
    public User(String fname, String lname, String login, String password) {
        this.fname = fname;
        this.lname = lname;
        this.login = login;
        this.password = password;
    }

    //constructor from 17-05-2021
    public User(String fname, String lname, String login, String password, String email) {
        this.fname = fname;
        this.lname = lname;
        this.login = login;
        this.password = password;
        this.email = email;
    }
    
    

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    //code bellow is from 17-05-2021 : for datacrud
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
    
    
    
}
