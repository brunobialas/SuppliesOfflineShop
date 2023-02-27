package Model;
public class Product {
    private String name;
    private String description;
    private Float regularValue;
    private Boolean isDiscounted;
    private Float discountedValue;

    private Float currentValue;

public Product(String name, String description, Float regularValue, Float discountedValue, Float currentValue) {
    this.name = name;
    this.description = description;
    this.regularValue = regularValue;
    this.discountedValue = discountedValue;
    this.currentValue = currentValue;
    this.isDiscounted = false;
    }

    public void discount(Integer percent) {
    isDiscounted = true;
    if(isDiscounted) {
        discountedValue = regularValue - (percent * regularValue);
        }
    }

    public void removeDiscount() {
    isDiscounted = false;
    discountedValue = 0f;
    }

    public float getCurrentValue() {
        if(isDiscounted == false){
            currentValue = regularValue;
        }else if(isDiscounted) {
            currentValue = discountedValue;
        } return currentValue;
    }

    public void changeValue(Float newValue) {
    regularValue = newValue;
    }
}
