/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LibraryManagementSystem;

import java.util.ArrayList;

/**
 *
 * @author kanav
 */
public class Rack {
private int rackNo;
private ArrayList<Book> books;

    public Rack(int rackNo) {
        this.rackNo = rackNo;
        this.books = new ArrayList<>();
    }

//    public void addBook(Book book) {
//        books.add(book);
//    }
//
//    public void removeBook(Book book) {
//        books.remove(book);
//    }
//
//    public ArrayList<Book> getBooks() {
//        return books;
//    }
//
//    public int getRackNumber() {
//        return rackNo;
//    }

}
