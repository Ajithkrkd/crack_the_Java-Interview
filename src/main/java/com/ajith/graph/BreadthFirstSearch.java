package com.ajith.graph;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch<T> {

    private final Vertex<T> startVertex;
    public BreadthFirstSearch (Vertex<T> startVertex){
        this.startVertex = startVertex;
    }

    public  void traverse(){
        Queue <Vertex<T>> queue = new LinkedList <> (  );
        queue.add ( startVertex );
        while (!queue.isEmpty ()){
            Vertex<T> currentVertex = queue.poll();
           if(!currentVertex.isVisited ()){
               currentVertex.setVisited ( true );
               System.out.println (currentVertex );
               queue.addAll ( currentVertex.getNeighbors () );
           }
        }
    }
}
