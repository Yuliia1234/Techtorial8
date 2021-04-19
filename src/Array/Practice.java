package Array;

import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        int[] studentId = new int[5];
        System.out.println(studentId[0]);
        System.out.println(studentId[1]);
        System.out.println(studentId[2]);
        System.out.println(studentId[3]);
        System.out.println(studentId[4]);

        studentId[0] = 12;
        studentId[1] = 35;
        studentId[3] = 44;
        studentId[4] = 11;

        System.out.println(Arrays.toString(studentId));
        studentId[1]=99;
        System.out.println(Arrays.toString(studentId));

       int l= studentId.length;
        System.out.println("The length of array is " +l);
    }
}
