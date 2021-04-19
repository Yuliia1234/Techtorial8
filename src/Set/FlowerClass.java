package Set;

import java.util.HashSet;
import java.util.Set;

public class FlowerClass {
    public static void main(String[] args) {
        Set<Flower> flowers = new HashSet<>();


        Flower flower1 = new Flower("Roses", "Red");
        Flower flower2 = new Flower("Lilies", "Purple");
        Flower flower3 = new Flower("Orchids", "White");
        Flower flower4 = new Flower("Gardenias", "Green");
        Flower flower5 = new Flower("Aster", "Blue");


        flowers.add(flower1);
        flowers.add(flower2);
        flowers.add(flower3);
        flowers.add(flower4);
        flowers.add(flower5);
        System.out.println(flowers +"!!");

        for (Flower flower : flowers) {
            System.out.println(flower);
        }

    }
}
