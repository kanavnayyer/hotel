package Hotel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kanav
 */
public class Room {
    private int roomId;
    private int price;
    private RoomCategory category;

    public Room(int roomId, int price, RoomCategory category) {
        this.roomId = roomId;
        this.price = price;
        this.category = category;
    }

    
    
    public int getPrice() {
        return price;
    }

    public RoomCategory getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Room{" + "price=" + price + ", category=" + category + '}';
    }
    
    
}
