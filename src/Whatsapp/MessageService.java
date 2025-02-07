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
/* Mark: MessageService
description :  responsible for sending message and getter

*/
public class MessageService {

    private HashMap<User, ArrayList<Message>> messages;

    public MessageService(HashMap<User, ArrayList<Message>> messages) {
        this.messages = new HashMap<>();
    }

    public void sendMessage(User sender, User receiver, Message message) {
        messages.putIfAbsent(receiver, new ArrayList<>());
        messages.get(receiver).add(message);

    }

    public ArrayList<Message> getMessages(User user) {
        return messages.getOrDefault(user, new ArrayList<>());
    }

}
