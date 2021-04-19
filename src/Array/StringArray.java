package Array;

import java.util.Arrays;

public class StringArray {
    public static void main(String[] args) {
        String[]colors = {"Blue","red","brown","Orange","Pink","Yellow"};
        Arrays.sort(colors);
        System.out.println(Arrays.toString(colors));
    //   String [] newarray =new String [colors.length];

        for (int i = 0; i <colors.length ; i++) {
            colors[i]=colors[i].toUpperCase();
        }

        Arrays.sort(colors);

        System.out.println(Arrays.toString(colors));
    }
}
