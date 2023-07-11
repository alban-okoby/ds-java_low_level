# java_from_zero_to_hero 🚀

## Why learn JAVA ?
Learn Java because he is : 
- [x] Simple
- [x] Platform independent
- [x] Secure
- [x] Multithreaded,
- [x] Architecture-neutra
- [x] Portable
- [x] Object oriented
- [x] Distributed
- [x] High performance
- [x] Robust

## Requirements
 To excecute all files, you have to 
 ### 1- Install your preferred IDE 
 like Intelij, Visual Studio Code or Other you like. <br>
 [Vs code](https://code.visualstudio.com/download) <br>
[intelij idea](https://www.jetbrains.com/idea/download/#section=mac)

### 2- Install Java 8 or higher
[download_java](https://www.oracle.com/java/technologies/downloads/)

## Usage 

Download the project.
After extract it, open your editor
```
  git clone https://github.com/alban-okoby/java_from_zero_to_hero.git
```

## Chapters
### chapter 1 : The Basics of java ☕
### [00-hello_world](https://github.com/alban-okoby/java_from_zero_to_hero/tree/main/00-hello_world/src)
Write your first program in Java ☕.
```java
public class HelloWorldApplication {
    public static void main(String[] args) {
        System.out.println("Hello World! Good job, your first program is running ✅🚀");
    }
}
```

### [01-java_basics](https://github.com/alban-okoby/java_from_zero_to_hero/tree/main/01-java_basics/src)
  - [Data Types an variables](https://github.com/alban-okoby/java_from_zero_to_hero/tree/main/01-java_basics/src)
  ```java
    
public class BasicDataTypes {
    public static void main(String[] args) {

        // Java Basics and Literals example and explanation 👇👇
        /**
         * @byte
         * A byte is a unit of data storage
         * that typically represents 8 bits. It is the fundamental
         * unit of storage in computer systems, and it can hold a range
         * of values from 0 to 255 (unsigned) or -128 to 127 (signed).
         */
        // For example
        byte a = 68; // declares a variable "a" of type "byte" which store 68.
        System.out.println(a); // 68

        /**
         * @char It is a data type used to represent a single character in
         * a character set such as letters, digits, symbols, or whitespace.
         */
        // For example,
        // declare a variable "b" of type "char" which store 'B'
        char b = 'B';
        char myUnicode = '\u0001'; // declare a variable "myUnicode" of type "char" which store '\u0001'
        // SHO THE RESULTCIN CONSOLE
        System.out.println(b); // B
        System.out.println(myUnicode); // \u0001


        /**
         * "boolean" s a data type that represents a logical value. It is used to indicate whether a condition
         * is true or false. In Java, the "boolean" data type is a primitive type that can have one
         * of two values: true or false.
         */
        // For example, declare a variable "c" of type "boolean" which store "true"
        boolean javaIsStrong = true;
        System.out.println(javaIsStrong); // true


        /**
         * "byte" is a data type used to represent integer values that require a smaller range than what can be
         * accommodated by the "int" data type. In Java, the "byte" data type is a 8-bit signed integer.
         *
         * The range of values that can be represented by a "byte" variable in Java is approximately
         * from -128 to 127. This range is narrower compared to the "int" data type, which allows
         * "byte" to store smaller integer values.
         */
        // For example declare a variable "number0" of type "byte" which store "5"
        byte number0 = 5; //
        System.out.println(number0); // 5


        /**
         * "short" is a data type used to represent integer values that require a smaller range than what can be
         * accommodated by the "int" data type. In Java, the "short" data type is a 16-bit signed integer.
         *
         * The range of values that can be represented by a "short" variable in Java is approximately
         * from -32,768 to 32,767. This range is narrower compared to the "int" data type, which allows
         * "short" to store smaller integer values.
         */
        // For example declare a variable "number0" of type "short" which store "5"
        short myShortNumber = 5; //
        System.out.println(myShortNumber); // 5


        /**
         * The "int" data type is commonly used for representing and performing calculations with whole numbers.
         * The range of values that can be represented by an "int" variable in Java is approximately from
         * -2,147,483,648 to 2,147,483,647. This range is determined by the size of the data type,
         * which is 32 bits or 4 bytes.
         */
        // For exemple
        int number1 = 14; // declare a variable "number1" of type "int" which store "14"
        int octal = 0144; // declare a variable "octal" of type "int" which store "0144"
        int hex = 0x64; // declare a variable "hex" of type "int" which store "0x64"
        // SHO THE RESULT IN CONSOLE
        System.out.println(octal); // 100
        System.out.println(hex); // 100


        /**
         * The ""long" is a data type used to represent integer values that require a larger range than what can be
         * accommodated by the "int" data type. In Java, the "long" data type is a 64-bit signed integer.
         *
         * The range of values that can be represented by a "long" variable in Java is approximately
         * from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807. This expanded range allows "long" to store
         * larger integer values compared to the "int" data type
         */
        // For exemple
        long number2 = 1555555555; // declare a variable "number2" of type "long" which store "15"
        System.out.println(number2); // 1555555555


        /**
         The "float" data type is commonly used when you need to represent numbers with a fractional part
         in Java is a 32-bit value that conforms to the IEEE 754 floating-point standard
         */
        // For example
        float myFloat = 8.4f; // declare a variable "number3" of which decimal
        System.out.println(myFloat); //


        /**
         * The "double" data type is commonly used when you need to represent numbers with a fractional part
         * in Java is a 64-bit value that conforms to the IEEE 754 floating-point standard
         */
        // For example
        double cote = 8.44444; // declare a variable "number3" of which decimal
        System.out.println(cote); // 8.44444


        /**
         * "String" is a data type used to represent a sequence of characters.
         * In Java, the "String" class is provided as a built-in class to handle textual data
         */
        // For example
        String anotherUnicode = "\u0001"; // declare a variable "anotherUnicode" of type "string" which store "\u0001"
        System.out.println(anotherUnicode); // \u0001
    }

    // GREAT JOB !,  HAPPY CODIND <\🚀> ..
}
```
  - [Modifier Types](https://github.com/alban-okoby/java_from_zero_to_hero/tree/main/01-java_basics)
  
 In Java, there are two main types of modifiers:
 1. **Access Modifiers**: They determine the accessibility or visibility of classes, methods, variables, and constructors. There are four access modifiers in Java:
    - `public`: The public modifier allows the class, method, or variable to be accessible from any other class or package.
    - `private`: The private modifier restricts the accessibility of the class, method, or variable to only within the same class.
    - `protected`: The protected modifier allows access within the same class, subclasses, and the same package.
    - Default (no modifier): If no access modifier is specified, it is considered as default, allowing access within the same package only.
 
 2. **Non-Access Modifiers**: They provide additional functionalities or properties to classes, methods, variables, and constructors. Some common non-access modifiers include:
    - `final`: The final modifier indicates that a class cannot be extended, a method cannot be overridden, or a variable cannot be reassigned.
    - `static`: The static modifier is used to define class-level members (variables and methods) that can be accessed without creating an instance of the class.
    - `abstract`: The abstract modifier is used to define abstract classes and methods. An abstract class cannot be instantiated, and an abstract method must be implemented in a subclass.
    - `synchronized`: The synchronized modifier is used to control the access to shared resources in multithreaded environments.
    - `volatile`: The volatile modifier is used to indicate that a variable's value may be modified by multiple threads.
 
 #### Example
  ```java
    public class MyClass {
        // Do something
    }
    
    private class MyPrivateClass {
        // do something
        private boolean myBool = true;
    }
    
    protected class MyProtectedClass {
    }

    public static class MyStaticClass {
        private boolean myBool = true; // ✅
                myBool = false; // ❌❌
    }
```
 These are the main types of modifiers in Java. They provide control over accessibility, behavior, and properties of classes, methods, variables, and constructors.

 
 
 
 
<!-- Use the package manager [pip](https://pip.pypa.io/en/stable/) to install foobar.

```bash
pip install foobar
``` -->

<!-- ## Contributing

Pull requests are welcome. For major changes, please open an issue first
to discuss what you would like to change.

Please make sure to update tests as appropriate. -->

## License

[MIT](https://choosealicense.com/licenses/mit/)

Happy coding <\🚀> <br>  Alban
