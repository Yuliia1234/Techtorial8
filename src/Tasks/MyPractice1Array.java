package Tasks;

public class MyPractice1Array {
    public static void main(String[] args) {
        //Sort numbers
        int number[] = {3, 7, 24, 8, 9, 5};
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

