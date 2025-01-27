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
public class UserManagement {
    private HotelRoomManagement hotelRoomManagement;
private ArrayList<User> userList;
   
   public UserManagement(){
   userList= new ArrayList<>();
   }
    
  public  void addUser(User user){
   userList.add(user);}
   
     void removeUser(User user){
   userList.remove(user);}

    @Override
    public String toString() {
        return "UserManagement{" + "hotelRoomManagement=" + hotelRoomManagement + ", userList=" + userList + '}';
    }
   
    ArrayList<User> allUsers(){
   return userList;
   }
           
    boolean userHasReservation(User user){
   
       HashMap<Room,String> allUser= hotelRoomManagement.allReservations();
   
       for (Map.Entry<Room, String> entry : allUser.entrySet()) {
         //  Room key = entry.getKey();
          String id = entry.getValue();
          
          if(id.equals(user.getId()))return true; 
       }
       return false;
   }
   
   void deleteUser(User admin, User user){
   if(admin.getRole().equals(Role.administrator)){
   userList.remove(user);
   hotelRoomManagement.getReservedRooms().remove(user);
   }
   
   }
    
}
