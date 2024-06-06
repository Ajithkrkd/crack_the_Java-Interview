package com.ajith.graph;

import lombok.Data;
import lombok.ToString;

import java.util.LinkedList;
import java.util.List;

@Data
public class Vertex <T>{

    private final T data;
    private boolean isVisited;

    @ToString.Exclude
    private List <Vertex<T>> neighbors = new LinkedList <> (  );

}



