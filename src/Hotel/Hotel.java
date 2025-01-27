package Hotel;


import java.util.ArrayList;
import java.util.HashMap;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kanav
 */
public class Hotel {
    private String hotelName;
    private int hotelId;
    private String location;
    private ArrayList<Room> rooms;
    private HashMap<String,Boolean>facilities;
    
  

    public Hotel(String hotelName, int hotelId,String location,HashMap<String,Boolean>facilities) {
        this.hotelName = hotelName;
        this.hotelId = hotelId;
        this.location=location;
        this.rooms= new ArrayList<>();
        this.facilities=facilities;
    }

    public String getHotelName() {
        return hotelName;
    }

    public int getHotelId() {
        return hotelId;
    }

    public String getLocation() {
        return location;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public HashMap<String, Boolean> getFacilities() {
        return facilities;
    }
    
}
