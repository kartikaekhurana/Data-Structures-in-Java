package com.mycompany;
public class RotatedArray {
    public static void main(String[] args){
        int[] arr = {5,7,9,2,3};
        int key = 9;
                System.out.println("The Index Element is At " + FindElementinRotated(arr,key)+ "th Position");
               
    }
    static int FindElementinRotated(int[] arr, int key){
        int i = 0;
        int j = arr.length;
        while (i < j) {
            int mid = (i +j)/ 2;
            if (arr[mid] == key) {
                return mid;
            }
            else if (arr[mid] > key) 
            {
                j = mid;
            } 
            else {
                i = mid + 1;
            }
        }
      return i;     
    }
}
