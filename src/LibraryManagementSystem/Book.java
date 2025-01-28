/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LibraryManagementSystem;

/**
 *
 * @author kanav
 */
class Book {

    private String name;
    private String barcode;
    private String publication;
    private Category category;

    public Book(String name, String barcode, String publication, Category category) {
        this.name = name;
        this.barcode = barcode;
        this.publication = publication;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public String getBarcode() {
        return barcode;
    }

    public String getPublication() {
        return publication;
    }

    public Category getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Book{" + "name=" + name + ", barcode=" + barcode + ", publication=" + publication + ", category=" + category + '}';
    }

}
