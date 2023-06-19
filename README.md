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

### [01-java_basics](https://github.com/alban-okoby/java_from_zero_to_hero/tree/main/01-java_basics/src)
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

Happy coding <\🚀> <br>
