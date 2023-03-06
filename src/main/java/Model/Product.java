package Model;
public class Product {
    private String name;
    private String description;
    private Float regularValue;
    private Boolean isDiscounted;
    private Float discountedValue;

public Product(String name, String description, Float regularValue, Float discountedValue) {
    this.name = name;
    this.description = description;
    this.regularValue = regularValue;
    this.discountedValue = discountedValue;
    this.isDiscounted = false;
    }

    public void discount(Integer percent) {
    this.isDiscounted = true;
    this.discountedValue = this.regularValue - (percent/100 * this.regularValue);
    }

    public void removeDiscount() {
    this.isDiscounted = false;
    this.discountedValue = null;
    }

    public float getCurrentValue() {
        if(this.isDiscounted){
            return this.discountedValue;
        } else {
            return this.regularValue;
        }
    }

    public void changeValue(Float newValue) {
        this.regularValue = newValue;
    }
}
