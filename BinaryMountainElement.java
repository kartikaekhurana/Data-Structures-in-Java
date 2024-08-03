package com;
public class BinaryMountainElement {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 6, 4, 2};
        System.out.println("The Mountain Element is At " + findMountainElement(arr)+ "th Position");
    }
    static int findMountainElement(int[] arr) {
        int i = 0;
        int j = arr.length;
        while (i < j) {
            int mid = (i +j)/ 2;
            if (arr[mid] > arr[mid + 1]) {
                j = mid;
            } else {
                i = mid + 1;
            }
        }
        return i;
    }
}
