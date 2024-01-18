package com.ajith.abstractClassess;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Animal {
    int age;
    String  name;

    public abstract void makeSound ( );
    public abstract void commutingStyle();
}
