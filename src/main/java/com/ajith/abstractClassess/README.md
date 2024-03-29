# What is Abstract classes


````
**Question:** 
What is Abstract classes ?
````
- In JAVA , abstract classes that canot be instantiated if we want to use their methods and properties we want to extend
- Abstract classes are declared using abstract keyword .
- Abstract classes contains abstract methods and and concrete methods.
- If we created a abstract method it does not have body only have declaration.
- If we declared any abstract methods in the abstract class we must impliment the method in the extended subclass.

````
Why we need a class which can't be instantiated , what is the advantage of abstract class?
````
- Using abstract classes we can define a template that must follow the inherited subclasses,for example

if we have a class Animal that have a method called makeNoice() , every animal make noice in defrent types so  i created a abstract method makeNoice
the subclasses must need to implement , I created two subclasses CAT , DOG  both of the subclasses have it own implementation deffrent noice sound but both animal must have to include this method
other wise it will show compail time error 

![screenshot](abstractDOGwarning.png)
````
 ## what is the difference between abstract class and Interface ? 
````
## abstract class
- Abstract classes  are cannot be instantiated we want to inherit to use.
- Abstract classes have constructor that will be invoked when subclass object is created
- can have abstract and concrete methods, subclasses must provide concrete implementations of these methods.
- Can have instance variables (fields) with various access modifiers.Can have public, private, or protected members.
## Interface
- cannot be instantiated implement using another class to use the methods
- do not have constructor that will not participate object creation.
- only have abstract methods and constants, implementing classes must provide concrete implementations of all the methods.
- Can only have constant fields (public static final), implicitly public, static, and final.
- All members are implicitly public (prior to Java 9). Starting from Java 9, interfaces can also have private methods

## Inheritance
- A java class can only extend one abstract class
- A Java class can implement multiple interfaces.
- Interface inheritance allows a class to implement multiple interfaces, providing flexibility in achieving multiple inheritance-like behavior.

# summary
### Abstract classes are useful for providing a common base with shared implementation,
### while interfaces define a contract for multiple unrelated classes to adhere to, allowing for more flexibility in terms of multiple inheritance.
