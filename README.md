# Lesson 34

## Getting started
To make a project use the following:

```
shift + command + P
Java: Create Java Project
```

You will select a folder to house your project then VSCode will generate a project there.

The project will have a class that contains everything. The class is generally named the same as the file name such as App.java

Within the class you will have a main class that will be needed for Java to run this program. This is necessary and the file will not run unless it has it. The completed first classes look like this:

```
public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

## Dynamic polymorphism
Overriding would be an example of dynamic polymorphism. Because, in case of overloading, at compile time the compiler knows which method to link to the call. However, it is determined at runtime for dynamic polymorphism. For more on dynamic polymorphism in Java <a href="https://stackoverflow.com/questions/20783266/what-is-the-difference-between-dynamic-and-static-polymorphism-in-java">click here</a>