package Model;
public class User {
    String name;
    String surname;
    Address address;
    Integer points;
    String email;
    String password;

    public User(String name, String surname, Address adress, Integer points, String email, String password) {
        this.name = name;
        this.surname = surname;
        this.address = adress;
        this.points = points;
        this.email = email;
        this.password = password;
    }



}
