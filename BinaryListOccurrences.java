package com.mycompany;
public class BinaryListOccurrences {
    public static void main(String[] args) {
        int[] arr ={2,4,6,6,6,7,7,8,8,8,8,9};
        int key = 6;
        int[] result = binaryOccurrenceIndex(arr, key);
        System.out.println("First occurrence: " + result[0]);
        System.out.println("Last occurrence: " + result[1]);
    }

    public static int[] binaryOccurrenceIndex(int[] arr, int key) {
        int[] result = {-1, -1}; // Initializing result array with -1 for not found

        // Finding the first occurrence
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == key) {
                result[0] = mid; // Found the first occurrence
                high = mid - 1; // Continue searching on the left side
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        // Finding the last occurrence
        low = 0;
        high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == key) {
                result[1] = mid; // Found the last occurrence
                low = mid + 1; // Continue searching on the right side
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return result;
    }
}
