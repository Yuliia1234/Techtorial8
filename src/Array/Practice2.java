package Array;

import java.util.Arrays;

public class Practice2 {
    public static void main(String[] args) {
        int a[]={33,3,4,5};//another way of creating array

        int b []=new int[4];//if you don't know your values yet you can use this method

        for (int i=0; i<a.length;i++){
            System.out.println(a[i]);
            System.out.println(Arrays.toString(a));//other method to print result
        }
    }
}
