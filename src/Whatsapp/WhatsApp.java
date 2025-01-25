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
public class WhatsApp {
    public static void main(String[] args) {
        
        ContactService contactService= new ContactService(new ArrayList<>());
        MessageService messageService= new MessageService(new HashMap<>());
        StatusService statusService= new StatusService();
        User user1= new User("kanav","123456789",new ArrayList<>()
                ,new HashMap<>(),new ArrayList<>());
        
          User user2= new User("kanavv","213456789",new ArrayList<>()
                ,new HashMap<>(),new ArrayList<>());
          
          
          
          contactService.addUser(user2);
          contactService.addUser(user1);
          
          contactService.addContact(user2, new Contact("kanav","123456789"));
          contactService.addContact(user1, new Contact("kanavv","213456789"));
        
          messageService.sendMessage(user2, user1,
                  new Message(user2,user1,Media.audio,"aaaaaaaa"));
           
ArrayList<Message>userMessages= messageService.getMessages(user1);
        
        for (Message uMessage : userMessages) {
            System.out.println(uMessage.toString());
        }
        
        
        statusService.addStatus(new Status(user1,Media.text,"aaaffrffsd"));

   ArrayList<Status> statuses=statusService.getStatuses();
   
        for (Status statuse : statuses) {
            System.out.println("status\n"+"user "+statuse.getUser().getName()+" uploadded "+statuse.getMedia()
            +"\n content insde"+statuse.getContent()+"\n at: "+statuse.getTimeStamp());
        }
   
    }
}
