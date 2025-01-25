/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Whatsapp;

import java.time.LocalDateTime;

/**
 *
 * @author kanav
 */
public class Message {
    private User Sender;
    private User Receiver;
    private Media media;
    private String content;
    private LocalDateTime timeStamp;

    public Message(User Sender, User Receiver, Media media, String content) {
        this.Sender = Sender;
        this.Receiver = Receiver;
        this.media = media;
        this.content = content;
        this.timeStamp= LocalDateTime.now();
    }

    public User getSender() {
        return Sender;
    }

    public User getReceiver() {
        return Receiver;
    }

    public Media getMedia() {
        return media;
    }

    public String getContent() {
        return content;
    }

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    @Override
    public String toString() {
        return "Message{" + "Sender=" + Sender + ", Receiver=" + Receiver +
                ", media=" + media + ", content=" + content + ", timeStamp=\n" + timeStamp + '}';
    }
    
    
}
