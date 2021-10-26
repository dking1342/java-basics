# Lesson 22

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

## Creating an array of objects
Now that we have made objects with constructors it is time to see how you can use different data types with the constructor. In this example, we will instantiate new objects and combine them into a new variable which will be an array. For more info on arrays in Java <a href="https://docs.oracle.com/javase/8/docs/api/java/lang/reflect/Array.html">click here</a>