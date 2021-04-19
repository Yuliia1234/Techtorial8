package Array.Tasks;

import java.util.Arrays;

public class Task11 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] reversedArray = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            reversedArray[arr.length - 1 - i] = arr[i];

        }

        System.out.println(Arrays.toString(reversedArray));

        String str = "code";

        String newone = str.substring(1,str.length()-1);
        String a = str.charAt(str.length()-1) +"" + newone + "" + str.charAt(0);
        System.out.println(a);
        }






        }





