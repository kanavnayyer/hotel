/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LibraryManagementSystem;

/**
 *
 * @author kanav
 */
abstract class User {
    private int id;
    private Role role;
    
    public User(Role role, int id){
    this.role=role;
    this.id=id;
    }
    
    abstract String userDetails();

    public int getId() {
        return id;
    }

    public Role getRole() {
        return role;
    }
}
