/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LibraryManagementSystem;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author kanav
 */
public class BookManagement {

    private Map<String, Book> books;

    public BookManagement() {
        books = new HashMap<>();
    }

    public void addBook(Book book) {
        books.put(book.getBarcode(), book);
    }

    public void removeBook(String barcode) {
        books.remove(barcode);
    }

    public Book getBook(String barcode) {
        return books.get(barcode);
    }

    public Map<String, Book> getAllBooks() {
        return books;
    }
}