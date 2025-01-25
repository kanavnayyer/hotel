/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Whatsapp;

/**
 *
 * @author kanav
 */
public class Contact {
    private String name;
    private String mobNo;
    
    public Contact(String name, String mobNo){
    name= this.name;
    mobNo=this.mobNo;
    }

    public String getName() {
        return name;
    }

    public String getMobNo() {
        return mobNo;
    }

    @Override
    public String toString() {
        return "Contact{" + "name=" + name + ", mobNo=" + mobNo + "\n";
    }
    
    
}
