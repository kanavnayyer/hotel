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
public class HmsMain {

    public static void main(String[] args) {

        UserManagement userManagement = new UserManagement();
        HotelRoomManagement hotelRoom = new HotelRoomManagement();
        User admin = new User("kanav", Role.administrator, "123443211234");
        userManagement.addUser(admin);
        User agent = new User("kartik", Role.agent, "12344444444");
        userManagement.addUser(agent);
        User user = new User("pranav", Role.user, "222211112222");
        userManagement.addUser(user);

        HotelsManagement hotelsManagement = new HotelsManagement();

        HashMap<String, Boolean> facilites = new HashMap<>();

        facilites.put(Facility.Breakfast.toString(), true);
        facilites.put(Facility.buffet.toString(), Boolean.FALSE);

        Hotel hotel = new Hotel("Taj", 12, "Punjab", facilites);

        //  public Room(int roomId, int price, RoomCategory category)
        ArrayList<Room> rooms = new ArrayList<>();

        rooms.add(new Room(001, 4000, RoomCategory.deluxe));
        rooms.add(new Room(002, 4000, RoomCategory.small));

        hotelsManagement.addHotel(hotel, rooms, agent);
        hotelRoom.bookHotelRoom(user, rooms.get(0));

        System.out.println(hotelRoom.allReservations() + "\n");

        System.out.println(hotelsManagement.hotelRoomsByLocation(user, "Punjab"));

        ArrayList<User> allUser = userManagement.allUsers();
        System.out.println(" All Registered users: \n" + allUser.toString());
    }

}
