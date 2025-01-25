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
public class Status {
    
    private User user;
    private Media media;
    private String content;
    private LocalDateTime timeStamp;
    
    public Status(User user, Media media, String Content){
   this.content=content;
   this.media=media;
   this.timeStamp=LocalDateTime.now();
   this.user=user;
    
    }

    public User getUser() {
        return user;
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
    
}
