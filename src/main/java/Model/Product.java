package Model;
public class Product {
    private String name;
    private String description;
    private Float regularValue;
    private Boolean isDiscounted;
    private Float discountedValue;
    private Integer quantity;

    public Product(String name, String description, Float regularValue, Integer quantity) {
        this.name = name;
        this.description = description;
        this.regularValue = regularValue;
        this.discountedValue = null;
        this.isDiscounted = false;
        this.quantity = quantity;
    }

    public void discount(Integer percent) {
        this.isDiscounted = true;
        this.discountedValue = this.regularValue - (percent / 100 * this.regularValue);
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

    private boolean isAvailable() {
        if (this.quantity == 0) {
            return false;
        }
        return true;
    }

    private String isAvailableToString() {
        if (isAvailable()) {
            return "This product is available";
        } else {
            return "This product is not available at this moment";
        }
    }

    public String getBasicInfo() {
        if (this.isDiscounted) {
            return this.name + " " + this.discountedValue + "$ Old price: " + this.regularValue + "$" + " " + isAvailableToString();
        } else {
            return this.name + " " + this.regularValue + "$" + " " + isAvailableToString();
        }
    }

    public String getDetailedInfo() {
        String text;
        text = this.name + "\nQuantity: " + this.quantity + " ";
        if (this.isDiscounted) {
            text = text + "\n Discounted price: " + this.discountedValue + "$\nOld price: " + this.regularValue + "$ " + isAvailableToString();
        } else {
            text = text + "\nRegular price: " + this.regularValue + "$ ";
        }
        text = text + "\nDescription: " + this.description + "\n" + isAvailableToString();
        return text;
    }
}
