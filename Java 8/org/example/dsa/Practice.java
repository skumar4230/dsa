package org.example.dsa;

import java.util.Arrays;

public class Practice {

    public static void main(String[] args) {
        System.out.println("we have to sort the array and find the number 9 that on which index it's present");
        int[] num = {4, 5, 6, 45, 56, 68, 7, 8, 9, 10, 11, 13, 1};
        int target = 9;
        Arrays.sort(num);//to sort the array
        Arrays.stream(num).forEach(System.out::println);
        //we have to find the number 9 that on which index it's present
        //linear search(no sorting needed)
        for (int i = 0; i < num.length; i++) {
            if (num[i] == target) {
                System.out.println("the number of index is " + i);
                break;
            }
        }
        //Binary search(sorting needed)
        int index = binarySearch(num, target);
        if (index != -1) {
            System.out.println("the index is " + index);
        } else {
            System.out.println("the number is not present");
        }


    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0;//starting index of array
        int right = arr.length - 1;//last index of array
        while (left <= right) {
            int mid = (left + right) / 2;//avg index
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}

