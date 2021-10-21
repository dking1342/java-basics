# Lesson 1

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

## Run the code
In VSCode you can run the code by pressing the play button in the upper right hand corner of the screen. The output will be seen in the terminal.

## Data types
There are several data types. They include:

```
*boolean true or false
byte -128 to 127
short -32,768 to 32,767
*int -2 billion to 2 billion
long -9 quntillion to 9 quintillion
float fractional number up to 6-7 digits 3.141592f
*double fractional number up to 15 digits 3.141592653589793
*char single character/letter/ASCII value 'f'
*String a sequence of characters "hello world"
```

The data types denoted with an asterik are the more common data types.

## Variables
A variable is a storage container that holds a value. The naming convention is to denote the data type then the variable name. You can choose to declare the variable then assign it like the following:

```
int x; // declaration
x = 123; // assignment
```

Or you can choose to initialize the variable in one line like this:

```
int x = 123 // initialization
```

Either way will allow you to use the variable

## Swapping variable values
In case you need to swap values of variables then you can do it by introducing a third variable to hold one of the variable values until you switch the other two. It would look like this:

```
String strx = "water";
String stry = "Kool-Aid";
String temp;

temp = strx;
strx = stry;
stry = temp;

System.out.println("strx: " + strx);
System.out.println("stry: " + stry);
```
