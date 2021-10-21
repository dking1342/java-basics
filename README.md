# Lesson 2

## Getting started
Start a new project. Go to a folder where you want to put your project and insert it. You can do this by typing:

```
shift + command + P
Java: Create Java Project
```

The project will have a src folder with a file inside which should have the following code:

```
public class App {
    public static void main(String[] args) {
        System.out.println("hello world");
    }
}
```

## Import into java file
If you want to import something into a Java file then you can do that by inserting it above the file class:

```
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);

    }
}
```

## Compile and run the program
Go to the terminal and go to the src folder then type the following:

```
javac App.java
```

This will create an App.class file in the src folder which means that the file has been compiled. Next you will run the following:

```
java App
```

This will run the file and you will be able to see it in the terminal.

If you have changed the file then you will need to save the changes the compile the file before you can run it again with the changes made.

## Making a program that uses user inputs
The program below uses the Scanner package so that a user can give inputs to the program.

```
import java.util.Scanner; // package that allows a user to input 

public class App {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name? ");
        String name = scanner.nextLine();
        System.out.println("How old are you? ");
        int age = scanner.nextInt(); // a new line is not created with this
        scanner.nextLine(); // this will create a new line
        System.out.println("What is your fav food? ");
        String food = scanner.nextLine();
        
        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("You like " + food);
    }
}
```