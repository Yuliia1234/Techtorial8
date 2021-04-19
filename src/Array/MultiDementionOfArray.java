package Array;

import java.util.Arrays;

public class MultiDementionOfArray {
    public static void main(String[] args) {
        int []arr ={1,3,5,7};

        int [][] multi = {{2,4,6},{5,6,7},{1,3},{9,65,33,44}};

        System.out.println(multi[3][2]);

        System.out.println(Arrays.toString(multi[3]));//if you need to print only one index
        System.out.println(Arrays.deepToString(multi));//This will print everything from multi array


    }
}
