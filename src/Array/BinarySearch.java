package Array;

import java.util.Arrays;

public class BinarySearch {
    //Binary search index number of element in array
    //Array has to be sorted before applying binary search
    //if the element is in the array ,it will return that index
    //if the element is not in the array it will return -1
    // possible place with negative number for that value

    public static void main(String[] args) {
        int []numbers ={5,34,3,2,7,50,200,2549};

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
       int a = Arrays.binarySearch(numbers,5);//index of number 5 is 2

        System.out.println(a);

        int noSuch_element=Arrays.binarySearch(numbers,4) ;//Since the element not in array and
        // number 4 is third number which should would be apply in array .Output -3;
        System.out.println(noSuch_element);
    }
}
