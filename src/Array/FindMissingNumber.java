package Array;

public class FindMissingNumber {
    public static void main(String[] args) {
        //{}

        int[] numbers = {1, 2, 3, 4, 5, 6, 8, 9,};

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != i + 1) {
                System.out.println(i + 1);
                break;
            }

        }

    }


}

