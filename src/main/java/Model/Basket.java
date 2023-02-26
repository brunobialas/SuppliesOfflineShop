package Model;

import java.util.ArrayList;

public class Basket {
    private Float summaryValue;
    private ArrayList<Product> productList;

    public Basket(ArrayList<Product> productList) {
        this.productList = productList;
    }
}
