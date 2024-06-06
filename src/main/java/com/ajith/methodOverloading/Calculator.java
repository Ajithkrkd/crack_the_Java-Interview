package com.ajith.methodOverloading;

public class Calculator {
    public  int sumNumber(int n1, int n2) {
        return n1 + n2;
    }


    public  int sumNumber(int n1, int n2 , int n3) {
        return n1 + n2 + n3;
    }
    int ans = sumNumber ( 2,4 );
}
