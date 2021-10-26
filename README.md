# Lesson 21

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

## toString method
The toString method is a special method that all objects inherit. It returns a string that "textually represents" an object. It can be used both implicitly and explicitly. For more on the toString method in Java <a href="https://www.geeksforgeeks.org/constructor-tostring-method-in-java-with-examples/">click here</a>