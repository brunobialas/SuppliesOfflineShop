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
        this.discountedValue = this.regularValue - ((float) percent / 100 * this.regularValue);
    }

    public void removeDiscount() {
        this.isDiscounted = false;
        this.discountedValue = null;
    }

    public float getCurrentValue() {
        if (this.isDiscounted) {
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

    private String availableToString() {
        if (isAvailable()) {
            return "Available";
        } else {
            return "Not available";
        }
    }

    public String getBasicInfo() {
        if (this.isDiscounted) {
            return String.format("%s %.2f$ Old price: %.2f$ %s", this.name, this.discountedValue, this.regularValue, availableToString());
        } else {
            return String.format("%s %.2f$ %s", this.name, this.regularValue, availableToString());
        }
    }

    public String getDetailedInfo() {
        String text;
        text = String.format("%s\nQuantity: %d ", this.name, this.quantity);
        if (this.isDiscounted) {
            text += String.format("\nDiscounted price: %.2f$\nOld price: %.2f$ ", this.discountedValue, this.regularValue);
        } else {
            text += String.format("\nRegular price: %.2f$ ", this.regularValue);
        }
        text += String.format("\nDescription: %s\n%s", this.description, availableToString());
        return text;
    }

}
