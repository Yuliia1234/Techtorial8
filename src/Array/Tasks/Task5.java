package Array.Tasks;

public class Task5 {
    public static void main(String[] args) {
        //Print out the number that their sum is 30
        //14,21,6,5,74,25,9,84,16

        int[]numbers = {14,21,6,5,74,25,9,84,16};

        for (int i = 0; i < numbers.length; i++) {
            for(int k =0; k<numbers.length;k++)

                if (numbers[i] +numbers[k]==30) {
                    System.out.println(numbers[i] + " and " + numbers[k] + " = " + " 30");
                }




            }

        }

    }

