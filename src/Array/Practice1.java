package Array;

import java.util.Arrays;

public class Practice1 {
    public static void main(String[] args) {
        String name [] = new String[6];
        name[5]="Elsiar";
      //  name[0]=  " ";//if we are not printing value of number it will say null
        name[3]="Halil";
        name[4]="Sura";
        name[1]="James";
        name[2]="Dinara";
        System.out.println(Arrays.toString(name));

        for (int i = 0; i <name.length ; i++) {//if you want to see only 3 names you can do
            // name.lenght (-1,2,3) or i<3
            System.out.println(name[i]);

        }
    }
}
