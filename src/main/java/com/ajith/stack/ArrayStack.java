package com.ajith.stack;

public class ArrayStack <T>{
        private T[] elements;
        private int top;
    public ArrayStack (int capacity){
        elements = (T[]) new Object[capacity];
        top = -1;
    }

    public void push(T item) {
        if(isFull()){
            throw new RuntimeException ( "ArrayStack is full" );
        }else{
            elements[++top] = item;
        }
    }

    public T pop() {
        if(isEmpty()){
            throw new RuntimeException ( "ArrayStack is empty" );
        }else{
           return elements[top--] ;
        }
    }
    public boolean isEmpty(){
        return top == -1;
    }
    public boolean isFull(){
        return top == elements.length -1;
    }
}
