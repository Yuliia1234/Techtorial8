package Array.Tasks;

public class Taks8 {
    public static void main(String[] args) {
        //sort the given array without using sort method
        int []number = {5,23,6,8,32,1,9};
        int s;
        boolean sort = false;
        while (sort == false) {
            sort = true;

            for (int i = 0; i < number.length - 1; i++) {
                if (number[i] > number[i + 1]) {
                    s = number[i + 1];
                    number[i + 1] = number[i];
                    number[i] = s;
                    sort=false;
                }
            }

        }for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }
    }
}
