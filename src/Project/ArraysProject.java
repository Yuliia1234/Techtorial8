package Project;

import java.util.Arrays;

public class ArraysProject {
    public static int[] removeDuplicates(int[] nums) {  // 8
            //Write a method switchPairs that switches the order of values in an Array of Strings in a pairwise fashion.
            //	  * Your method should switch the order of the first two values,
            //	  * then switch the order of the next two, switch the order of the next two, and so on.
            //	  *
            //	  * {"four", "score", "and", "seven", "years", "ago"}-> return {"score", "four", "seven", "and", "ago", "years"}
            //	  * {"to", "be", "or", "not", "to", "be", "hamlet"} -> return {"be", "to", "not", "or", "be", "to", "hamlet"}
            //	  *
            //	  * Method that is using String[]
            //	  * @param Array
            //	  * @return switched pairs array


            int length = lengthWithoutDuplicates(nums); //6
            int[] result = new int[length];
            for(int indexOfNums=0, indexOfResult=0; indexOfNums<nums.length; indexOfNums++) { // {3,6,8,3,2,7,9,9}
                boolean firstOne = true;
                for(int q=0; q<indexOfNums; q++) {  // {3,6,8,3,2,7,9,9}
                    if(nums[indexOfNums] == nums[q]) {
                        firstOne = false;
                        break;
                    }
                }
                if(firstOne) {
                    result[indexOfResult++] = nums[indexOfNums];
                }
            }
            return result;
        }
    /*
        1. Create count, to track length
        2. For loop it
        3. If we didn't met thi number before, add 1 to our count, if we met it, just skip it
     */
        public static int lengthWithoutDuplicates(int[] nums) {
            int count = 0;
            for(int i=0; i<nums.length; i++) { // {3,6,8,3,2,7,9,9} //8
                boolean firstOne = true;
                for(int q=0; q<i; q++) { //i = 3
                    if(nums[i] == nums[q]) {
                        firstOne = false;
                        break;
                    }
                }
                if(firstOne) {
                    count++; //  6
                }
            }
            return count;
        }
        public static void main(String[] args) {
            int[] example = {3,6,8,3,2,7,9,9};
            int[] example2 = {-1,5,8,-1,-55,55,0};
            int[] result = removeDuplicates(example);
            int[] result2 = removeDuplicates(example2);
            System.out.println(Arrays.toString(result));
            System.out.println(Arrays.toString(result2));


        }


    }



