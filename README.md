# Lesson 32

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

## Interface
An interface is a template that can be applied to a class. It is similar to inheritance, but spcifies what a class has/must do. The classes can apply more than one interface. Inheritance is limited to one super. For more on interface in Java <a href="https://docs.oracle.com/javase/tutorial/java/IandI/createinterface.html">click here</a>