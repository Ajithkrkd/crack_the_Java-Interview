package com.ajith;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class App
{
        public static void main( String[] args ) {
           String  s = "Test1ng-Leet=code-Q!";

            char [] arr = s.toCharArray();
            int p1 = 0;
            int p2  = arr.length - 1;

            while(p1 <= p2){
                if(arr[p1] > 63 && arr[p1] <= 122 && arr[p2] >= 63 && arr[p2] <= 122 ){
                    System.out.println (arr[p1] + " " + arr[p2] );
                    char temp = arr[p1];
                    arr[p1] = arr[p2];
                    arr[p2] = temp;
                p1++;
                p2--;
                }
                if(arr[p1] <= 63 || arr[p1] >= 122){
                    p1++;
                }
                if(arr[p2] <= 63 || arr[p2] >= 122){
                    p2--;
                }
            }

        }

}




















































//    private static void selectionSort (int[] arr) {
//        for ( int i = 0; i < arr.length - 1; i++){
//            int min = arr[i];
//            int minPosition = i;
//
//            for ( int j = i + 1; j < arr.length; j++){
//                if(arr[j] < min){
//                    min = arr[j];
//                    minPosition = j;
//                }
//            }
//            swapElements(arr,minPosition,i);
//        }
//    }
//
//    private static void swapElements (int[] arr, int minPosition, int i) {
//        int temp = arr[i];
//        arr[i] = arr[minPosition];
//        arr[minPosition] = temp;
//    }