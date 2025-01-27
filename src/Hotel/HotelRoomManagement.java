package Hotel;


import java.util.ArrayList;
import java.util.HashMap;

public class HotelRoomManagement {
    
    FeedBackService feedBackService;
    private ArrayList<Room> rooms;
    private HashMap<Room, String> reservedRooms;

    public HotelRoomManagement() {
        this.rooms = new ArrayList<>();
        this.reservedRooms = new HashMap<>();
        feedBackService= new FeedBackService();
    }

     HashMap<Room, String> getReservedRooms() {
        return reservedRooms;
    }
    

    public void addRooms(ArrayList<Room> newRooms) {
        rooms.addAll(newRooms);
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public void removeRoom(Room room) {
        rooms.remove(room);
    }

    public ArrayList<Room> getAllRoom() {
        return rooms;
    }

    void releaseRoom(User user, Room room) {
        if (user.getRole().equals(Role.user)) {
            rooms.add(room);
            reservedRooms.remove(room);
        }

    }

    HashMap<Room,String>allReservations(){
    return reservedRooms;
    }
    
    public void bookHotelRoom(User user, Room room) {
        if (user.getRole().equals(Role.user)) {

            System.out.println("room  "+room.toString()+" reserved by user: "+user.getName()+"\n");
            feedBackService.feedback();
            reservedRooms.put(room, user.getId());
            rooms.remove(room);
        
        } else {
            System.out.println("only user can book");
        }
    }

    public Room getRoom(int id) {
        return rooms.get(id);
    }

}
