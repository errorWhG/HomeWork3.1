package com.company;

import java.util.Arrays;

public class Main {
    private static void sortBubble(int[] array, int ind1, int ind2) {
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }

    public static void main(String[] args) {
        double[] numbers = {1.5, -2.5, 1.5, -82.5, 1.5, 42.5, 3.5, 12.5, 1.5, 22.5, 1.5, 32.5, 1.5, 3.5, 4.0};//
        double result = 0;//3.6
        boolean isOtr = false;
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
//                System.out.println(numbers[i]);//-2.5 - 82.5
                isOtr = true;
            } else if (isOtr && numbers[i] > 0) {
                count++;
                result += numbers[i];
            }
        }
        System.out.println(result);//128.5/10.708333333333334
        System.out.println(result / count);//10.708333333333334

        int nums [] = {-4,-66,-8, -2, 2, 88, 5,3, 6, 8};

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                sortBubble(nums, i, i-1);
            }
        System.out.println(Arrays.toString(nums));
        }

    }
}
