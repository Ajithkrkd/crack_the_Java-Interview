package com.ajith;

import com.ajith.abstractClassess.Cat;
import com.ajith.abstractClassess.Crows;
import com.ajith.abstractClassess.Dog;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Cat cat = new Cat();
        Dog dog = new Dog();
        dog.makeSound ();
        cat.makeSound ();
        cat.setAge ( 1 );
        System.out.println (cat.getAge () );
        Crows c = new Crows();
        c.makeSound ();
        c.commutingStyle ();
    }
}
