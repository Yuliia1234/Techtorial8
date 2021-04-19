package Array;

import java.util.Arrays;

public class MultiDemention2 {
    public static void main(String[] args) {
        String[][] productBrands = {{"Mac", "Lg", "Lenovo", "MSI", "HP"}, {"Samsung", "Sony"}, {"Google", "Alexa", "GBL"}};
        System.out.println(productBrands[0][4]);
        System.out.println(Arrays.toString(productBrands[2]));//Only speakers

        double[][] price = {{1400.99, 800.50, 600, 950,1500}, {1999.99, 1500}, {200, 99, 150}};


        for (int i = 0; i < price.length; i++) {
            for (int k = 0; k < price[i].length; k++) {

             //   System.out.println(price[i][k]);
                System.out.println(productBrands[i][k] + " is $ " + price[i][k]);
            }
        }
    }

}