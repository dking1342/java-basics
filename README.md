# Lesson 43

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

## Java Util Function Package
Functional interfaces provide target types for lambda expressions and method references. Each functional interface has a single abstract method, called the functional method for that functional interface, to which the lambda expression's parameter and return types are matched or adapted. For more on the function package in Java <a href="https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html">click here</a>