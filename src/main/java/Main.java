import Model.Product;

public class Main {
    public static void main(String[] args) {

        Product bialko = new Product("Bialko", "Dobre bialko", 10f, 1895);
//        bialko.getBasicInfo();
//        String tekst = bialko.getBasicInfo();
//        System.out.println(tekst);
        bialko.discount(17);
        String detailedText = bialko.getDetailedInfo();
        System.out.println(detailedText);

        System.out.println("--------------------");
        String isDetailedText = bialko.getBasicInfo();
        System.out.println(isDetailedText);
    }

}
