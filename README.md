# Lesson 12

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

## Wrapper class
A wrapper class provides a way to use primitive data types as reference data types. It is a reference data types that contains useful methods. It can be used with collections (i.e. ArrayList)

For more on wrapper classes in Java <a href="https://docs.oracle.com/javase/7/docs/api/java/sql/Wrapper.html">click here</a>

These are examples of the primitive and wrapper

```
primitive       wrapper
---------       -------
boolean         Boolean
char            Character
int             Integer
double          Double
```

For more info on each wrapper see below in the list
Boolean <a href="https://docs.oracle.com/javase/7/docs/api/java/lang/Boolean.html">click here</a>
Character <a href="https://docs.oracle.com/javase/7/docs/api/java/lang/Character.html">click here</a>
Integer <a href="https://docs.oracle.com/javase/7/docs/api/java/lang/Integer.html">click here</a>
Double <a href="https://docs.oracle.com/javase/7/docs/api/java/lang/Double.html">click here</a>

Autoboxing is the automatic conversion that the Java compiler makes between the primitive types and their corresponding object wrapper classes

Unboxing is the reverse of autoboxing. Automatic coversion of the wrapper class to primitive.

For more on autoboxing and unboxing in Java <a href="https://docs.oracle.com/javase/tutorial/java/data/autoboxing.html">click here</a>