package com.ajith;

import com.ajith.graph.BreadthFirstSearch;
import com.ajith.graph.Vertex;

import java.util.Arrays;

public class App
{
        public static void main( String[] args ) {
            Vertex<Integer> v0 = new Vertex<Integer>(0);
            Vertex<Integer> v1 = new Vertex<Integer>(1);
            Vertex<Integer> v2 = new Vertex<Integer>(2);
            Vertex<Integer> v3 = new Vertex<Integer>(3);
            Vertex<Integer> v4 = new Vertex<Integer>(4);
            Vertex<Integer> v5 = new Vertex<Integer>(5);
            Vertex<Integer> v6 = new Vertex<Integer>(6);

            v0.setNeighbors ( Arrays.asList ( v1,v5,v6 ) );
            v1.setNeighbors ( Arrays.asList ( v3,v4,v5));
            v4.setNeighbors ( Arrays.asList ( v2,v6));
            v6.setNeighbors ( Arrays.asList ( v0));

            BreadthFirstSearch bfs = new BreadthFirstSearch(v1);
            bfs.traverse ();
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