/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Whatsapp;

import java.util.ArrayList;

/**
 *
 * @author kanav
 */
public class ContactService {
    private ArrayList<User> users;
    
    public ContactService(ArrayList<User> users){
    this.users= new ArrayList<>();
    
    }
    
    public void addUser(User user){
    users.add(user);
    }
    
    public void addContact(User user, Contact contact){
    user.getContacts().add(contact);
    }
    
    public User getUserByNo(String mobNo){
    for(User user:users){
    if(user.getMobNo().equals(mobNo))
        return user;
    }
    return null;
    }
    
    
}
