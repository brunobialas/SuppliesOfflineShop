package Model;
public class Product {
    private String name;
    private String description;
    private Float value;
    private Boolean isOnSale = false;

public Product(String name, String description, Float value) {
    this.name = name;
    this.description = description;
    this.value = value;
    }
}
