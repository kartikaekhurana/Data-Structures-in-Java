package com;
import java.util.*;
public class TwoSum {
    public static void main(String[] args){
        int[] arr= {3,5,4,12,1};
        int Sum = 8;
        System.out.println(Arrays.toString(TwoSumFunction(arr,Sum)));
        
    }
static int[] TwoSumFunction(int[] arr, int Sum){
    
    for (int i=0;i<arr.length;i++){
        for (int j=1;j<arr.length;j++){
            if (arr[i] + arr[j] == Sum){
                return new int[]{i,j};
                }
            }
            
        }
        
 return new int[]{-1 -1};   }

}

