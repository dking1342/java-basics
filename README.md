# Lesson 38

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

## File reader
A file reader class reads the content of a file as a stream of characters. One by one it reads it. The read() method returns an into value which contains the byte value. When the read() method returns a value of -1, then there is no more data to be read. For more on the file reader class in Java <a href="https://docs.oracle.com/javase/7/docs/api/java/io/FileReader.html">click here</a>