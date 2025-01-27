package Hotel;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author kanav
 */
public class HotelsManagement {

    private HotelRoomManagement hotelRoomManagement;
    private HotelRoomManagement roomManageMent;

    HashMap<Hotel, ArrayList<Room>> hotels;

    public HotelsManagement() {

        this.hotelRoomManagement = hotelRoomManagement;
        this.hotels = new HashMap<>();
    }

    public void removeHotel(Hotel hotel, User user) {
        if (user.getRole().equals(Role.administrator)) {
            hotels.remove(hotel);
        } else {

            System.out.println("Only admin can remove sorry");
        }

    }

    public void updateHotel(Hotel hotel, User user, ArrayList<Room> room) {
        if (user.getRole().equals(Role.administrator)) {
            hotels.put(hotel, room);
        }

    }

    public void addHotel(Hotel hotel, ArrayList<Room> rooms, User user) {

        if (user.getRole().equals(Role.agent)) {
            approveRoombyAdmin(hotel, rooms);
        }

    }

    private void approveRoombyAdmin(Hotel hotel, ArrayList<Room> rooms) {
        hotels.put(hotel, rooms);
    }

    
    // search hotel rooms by location
    public ArrayList<Room> hotelRoomsByLocation(User user, String location) {
        ArrayList<Room> searchResultRooms = new ArrayList<>();
        for (Map.Entry<Hotel, ArrayList<Room>> entry : hotels.entrySet()) {
            Hotel hotel = entry.getKey();
            ArrayList<Room> rooms = entry.getValue();

            if (hotel.getLocation().equals(location)) {
                for (Room rm : rooms) {
                    searchResultRooms.add(rm);

                }
            }
        }
        return searchResultRooms;

    }

}
