/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import model.User;

/**
 *
 * @author linda
 */
@ManagedBean
@SessionScoped
public class UserController {
    
    public User user = new User();
    
    public List<User> usersList ;
    

    /**
     * Creates a new instance of UserController
     */
    public UserController() {
        
    }
    
    @PostConstruct
    public void init(){
        usersList = new ArrayList<>();
        usersList.add(new User("FIRST NAME", "LAST NAME", "LOGIN", ""));
        for (int i = 0; i < 10; i++) {
            usersList.add(new User("First name "+i, "Last name "+i, "Login "+i, "tdsi"));
        }
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
    public String inscription(){
        System.out.println(this.user.getFname() + " - " + this.user.getLname());
        return "";
    }
    
    public String auth(){
        if (this.user.getPassword().equals("tdsi") && this.user.getLogin().equals("tdsi")) {
            return "accueil";
        }
        return "";
    }
    
    public String accountCreation(){
        return "connection?faces-redirect=true";
    }

    public List<User> getUsersList() {
        return usersList;
    }

    public void setUsersList(List<User> usersList) {
        this.usersList = usersList;
    }
    
    
}
