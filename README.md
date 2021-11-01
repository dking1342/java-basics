# Lesson 45

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

## Java streams
A sequence of elements supporting sequential and parallel aggregate operations. The following example illustrates an aggregate operation using Stream and IntStream:

```
int sum = widgets.stream()
                .filter(w -> w.getColor() == RED)
                .mapToInt(w -> w.getWeight())
                .sum();
 ```

 For more on java streams in Java <a href="https://docs.oracle.com/javase/8/docs/api/?java/util/stream/Stream.html">click here</a>