package Hotel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kanav
 */
public   class User {

    @Override
    public String toString() {
        return "User{" + "name=" + name + ", id=" + id + ", role=" + role + '}'+"\n";
    }
    private String name;
    private String id;
    private Role role;

    public User(String name, Role role,String id) {
        this.name = name;
        this.role = role;
        this.id=id;
    }

    public String getName() {
        return name;
    }
public String getId(){
return id;
}
    public Role getRole() {
        return role;
    }
    
}
