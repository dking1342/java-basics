# Lesson 24

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

## Static keyword
The static keyword or modifier is a single copy of a variable/method that is created and shared. The class "owns" the static member. For more on the static modifier in Java <a href="https://docs.oracle.com/javase/tutorial/java/javaOO/classvars.html">click here</a>