package Model;

import java.util.Random;

public class ProductGenerator {
    private static String[] names = new String[3];
    private static String[] descriptions = new String[3];

    public static void getProduct(boolean canBeDiscounted) {
        Random generator = new Random();
        String name = names[generator.nextInt(names.length)];
        String description = descriptions[generator.nextInt(descriptions.length)];
        Float regularValue = generator.nextFloat() * 100;
        Integer quantity = generator.nextInt(9999);
    }

}


