package com.ajith;


import com.ajith.tree.BinarySearchTree;
import com.ajith.trie.Trie;

import java.util.Collections;


public class App {
    public static void main (String[] args) {

        Trie trie = new Trie ( "mannan" );
        System.out.println ( trie.contains ( "manna" ) );
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