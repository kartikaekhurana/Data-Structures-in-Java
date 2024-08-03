package com.JavaPractical;
public class SecondLargestWithoutSorting {
    public static void main(String[] args){
        int[] arr = { 1,3,51,4,42,52,12,33};
        System.out.println(FindTarget(arr));
    }
    static int FindTarget(int[] arr){
        int max = arr[0];
        int secondMax = arr[0];
       for (int i = 0 ;  i <= arr.length-1 ; i++){
              if(arr[i] > max){
                  secondMax = max;
                  max = arr[i];
              }   
              }
               return secondMax;
  }
    } 
    
