package Tasks.MethodPractice;

import java.util.Arrays;

public class ClassA {

    public static int dublicate(int[] nums) {
        //String result = Arrays.toString(nums);
        int returning_value = 0;
        for (int i = 0; i < nums.length; i++) {
        boolean duplicate = false;
            for (int j = 0; j <nums.length ; j++) {
                if(i != j && nums[i] == nums[j]){
                duplicate = true;
                break;

            }}if(duplicate == true){
                returning_value = nums[i];
            }


        }
        return returning_value;
    }
}


