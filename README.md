# Lesson 3

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

## Creating an expression
Inside of a class you might need to use expressions or something similar to create a program. Expressions are operands and operators. Operands are the values, variables, numbers, quantity, etc that you will create. The operators are the mathematical operators that will be used amongs the operands to perform the mathematical expression.

First create a variable if you will using a variable throughout your code to store the value of the expression. The data type is important as it will determine what your value will look like:

```
int friends = 10;
double friendz = 5;
```

Then you can perform expressions using the operators that you want to use:

```
friends = friends + 1;
friends++;

friendz = friendz / 3;
```

These will output in the data type the variable is being typed as. The friendz variable will show 3.3333 as it is the double data type whereas the int data type will only show a whole number.