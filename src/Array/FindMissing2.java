package Array;

public class FindMissing2 {
    public static void main(String[] args) {

        int[] array = {10, 11, 12, 14, 15};
        int sum = 0;
        int sum2 = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i] + 1;
        }
        for (int i = 10; i <= 15; i++) {
            sum2 += i;

        }
        System.out.println(sum2 - sum);


    }
}

