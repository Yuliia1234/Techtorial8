package Array.Tasks;

import java.util.Arrays;

public class Task9 {
    public static void main(String[] args) {
        //Find average of all int of array
        int[] arr;//Array declaration
        arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
        int sum = 0;
        for (int a : arr) {
            sum += a;

        }
        int avarage = sum / arr.length;
        System.out.println(avarage);
    }
}
