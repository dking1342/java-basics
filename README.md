# Lesson 6

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

## Random numbers
The random class is used to randomly select a number, boolean, etc. You will need to import the Random class then instatiate it inside your class. From there you can use the various methods within the Random class. For the list of methods and the Random class <a href="https://docs.oracle.com/javase/8/docs/api/java/util/Random.html">click here</a>