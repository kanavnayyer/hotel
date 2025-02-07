/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Whatsapp;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author kanav
 */

/* Mark: User
description :   person who logins whatsapp

*/
public class User {

    private String name;
    private String mobNo;
    private ArrayList<Contact> contacts;
    private HashMap<User, ArrayList<Message>> messages;
    private ArrayList<Status> status;

    public User(String name, String mobNo, ArrayList<Contact> contacts,
            HashMap<User, ArrayList<Message>> messages, ArrayList<Status> status) {
        this.name = name;
        this.mobNo = mobNo;
        this.contacts = new ArrayList<>();
        this.messages = new HashMap<>();
        this.status = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getMobNo() {
        return mobNo;
    }

    public ArrayList<Contact> getContacts() {
        return contacts;
    }

    @Override
    public String toString() {
        return "User{" + "name=" + name + ", mobNo=" + mobNo + ", contacts=" + contacts + ", messages=" + messages + ", status=" + status + '}';
    }

    public HashMap<User, ArrayList<Message>> getMessages() {
        return messages;
    }

    public ArrayList<Status> getStatus() {
        return status;
    }

}
