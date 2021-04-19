package Utillities;

import java.util.Arrays;

public class Resusable_methods {

    public String name = "blue";
    public int a = 10;

    Resusable_methods() {
        this.a = 20;

    }


    public static String reversed_string(String reversed) {

        String b = "";
        for (int i = reversed.length() - 1; i >= 0; i--) {
            b += reversed.charAt(i);
        }
        return b;
    }

    public static int dublicate(int[] nums) {
        int returning_value = 0;
        for (int i = 0; i < nums.length; i++) {
            boolean duplicate = false;
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] == nums[j]) {
                    duplicate = true;
                    break;

                }
            }
            if (duplicate == true) {
                returning_value = nums[i];
            }


        }
        return returning_value;
    }

    public static int[] check(int[] nums) {
        int n = nums.length;

        int[] a = new int[(n + 1) / 2];
        int[] b = new int[n - a.length];

        for (int i = 0; i < n; i++) {
            if (i < a.length)
                a[i] = nums[i];
            else
                b[i - a.length] = nums[i];
        }

        return a;
    }

    public static int[] check1(int[] numbers) {
        int n = numbers.length;

        int[] a = new int[(n + 1) / 2];
        int[] b = new int[n - a.length];

        for (int i = 0; i < n; i++) {
            if (i < a.length)
                a[i] = numbers[i];
            else
                b[i - a.length] = numbers[i];
        }

        return b;
    }



            }















