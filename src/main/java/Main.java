import Model.Product;

public class Main {
    public static void main(String[] args) {

        Product bialko = new Product("Bialko", "Dobre bialko", 10f, 0);
//        bialko.getBasicInfo();
//        String tekst = bialko.getBasicInfo();
//        System.out.println(tekst);

        bialko.getDetailedInfo();
        String detailedText = bialko.getDetailedInfo();
        System.out.println(detailedText);


    }

}
