package Model;
public class User {
    private String name;
    private String surname;
    private Address address;
    private Integer points;
    private String email;
    private String password;

    public User(String name, String surname, Address address, Integer points, String email, String password) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.points = points;
        this.email = email;
        this.password = password;
    }
}
