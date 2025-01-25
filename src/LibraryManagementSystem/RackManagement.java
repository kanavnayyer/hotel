/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LibraryManagementSystem;

import java.util.HashMap;
import java.util.Map;


public class RackManagement {
    private Map<String, Rack> racks;

    public RackManagement() {
        racks = new HashMap<>();
    }

    public void addBookToRack(Book book, int rackNo) {
        racks.put(book.getBarcode(), new Rack(rackNo));
    }

    public void removeBookFromRack(Book book) {
        for (Rack rack : racks.values()) {
            racks.remove(book);
        }
    }

    public Map<String, Rack> getAllRacks() {
        return racks;
    }
}
