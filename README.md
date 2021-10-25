# Lesson 18

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

## Object orientated programming
Object oriented programming is a paradigm used when making software. It consists of making objects that can, but does not need, state or methods. The objects can be public, private, etc depending on the accessibility needed. The way to make these objects is with a class. Inside the class all of your state and/or methods are encapsulated. These objects can interact with each other as needed within a project or can be imported from an exisiting object. For more on object oriented programming in Java <a href="https://docs.oracle.com/javase/tutorial/java/concepts/">click here</a>