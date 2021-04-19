package HomeWork.Homework10;

public class Project {
    public static void main(String[] args) {
        // *
        //	 * Write a method that takes an array of integers and returns a boolean.
        //	 * Return true if the array contains 1 and 2 later somewhere in the array,
        //	 * and 1 has to come before 2.
        //	 *
        //	 * contains12([1, 3, 2]) -> true
        //	 * contains12([3, 1, 2]) -> true
        //	 * contains12([3, 1, 4, 5, 2]) -> true
        //	 * contains12([3, 2, 4, 5, 1]) -> false
        //	 *

        int[] nums = {3, 2, 4, 5, 1};

        boolean result = false;
        int numberOne =1;

        for (int i = 0; i < nums.length-1; i++) {

            if (numberOne==nums[i]){////if you find a 1 set the boolean values for them
                result=true;
                break;

            }if(numberOne+1 ==nums[i])////if we found both break out of the loop

            break;
        }
        System.out.println(result);
    }
}
