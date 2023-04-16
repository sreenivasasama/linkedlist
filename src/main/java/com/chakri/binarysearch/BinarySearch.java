package com.chakri.binarysearch;

public class BinarySearch {

    public static void main(String[] args) {

        int[] sortedArray = new int[]{10, 20, 40, 50, 66, 76, 85, 98, 110, 123, 145};
        int[] sortedArray2 = new int[0];

        System.out.println("Index of element in the array is " + newBinarySearch(sortedArray, 145, 0, sortedArray.length-1));
        System.out.println("Index of element in the array using iterative binary search is " +
                iterativeBinarySearch(sortedArray, 10, 0, sortedArray.length-1));
    }

    private static int newBinarySearch(int[] sortedArray, int x, int low, int high) {
        int midPoint;
        int midPoint2;
        if(low > high) {
            return -1;
        } else {
            midPoint = low + (high - low) / 2;
            midPoint2 = (high + low) / 2 ;
            System.out.println("actual midpoint " + midPoint);
            System.out.println("dummy midpoint " + midPoint2);

            if(x == sortedArray[midPoint]) {
                return midPoint ;
            }

            if(x > sortedArray[midPoint]) {
                return newBinarySearch(sortedArray, x, midPoint +1, high);
            }

            if(x < sortedArray[midPoint]) {
                return newBinarySearch(sortedArray, x, low, midPoint-1);
            }

        }
        return -1;
    }
    private static int iterativeBinarySearch(int[] sortedArray, int x, int low, int high) {
        int midpoint = 0;
        while(high - low > 1) {
            midpoint = (low + high) / 2;
            System.out.println("actual midpoint " + midpoint);
            if(x > sortedArray[midpoint]) {
                low = midpoint + 1;
            } else {
                high = midpoint ;
            }

        }

        if(x == sortedArray[high]) {
            return high;
        } else if(x == sortedArray[low]) {
            return low;
        }else {
            return -1;
        }

    }
}
