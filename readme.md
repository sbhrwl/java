## Programming language
- Machine Level Language: 
  - Low-level programming languages includes machine language.
  - It is also known as object code or machine code. 
  - Machine language is typically displayed in binary or hexahecimal form (base 16) form. 
  - Since computers can read machine language programmes directly, there is no need for a translator to convert the programmes.
  - Machine language has **executes code quickly** compared to high-level programming languages.
- Assembly language: 
  - Another form of low-level programming language created for certain processors is assembly language (ASM). 
  - It gives the collection of directions in a symbolic and clear manner for humans to understand. 
  - An assembler is used to translate assembly language into machine language.
  - Assembly language has the benefit of **requiring less memory and less time to execute a program**.
- High-level languages: 
  - The high-level programming language (HLL) is made for creating user-friendly web pages and software applications. 
  - The program must be converted into machine code using a **compiler or interpreter** when using this programming language.
  - A high-level language's main benefit is that it is **simple to read, write, and maintain**.
  - Python, Java, JavaScript, PHP, C#, C++, Objective C, Cobol, Perl, Pascal, LISP, FORTRAN, anh Swift are examples of high-level proframming languages.

## Introduction to Java
- Java is an object-oriented programming language developed by Sun Microsystems, and it was released in 1995h
- James Gosling initially developed Java in Sun Microsystems (which was later merged with Oracle Corporation)
- Java is a set of features of C and C++. It has obtained its format from C, and OOP features from C++
- Java programs are platform independent which means they can be run on any operating system with any processor as long as the Java interpreter is available on that system
- Java code that runs on one platform does not need to be recompiled to run on another platformi it's called **write once, run anywhere** (WORA)
- Java Virtual Machine (JVM) executes Java code, but it has been written in platform-specific languages such as C/C++/ASM, etc. 
- Java interpreter is a part of JVM

## Features of Java
- Object-Oriented - The features of object-oriented programming are supported by Java. Its object model is straight forward and flexible
- Platform independent - Because Java and C++ are platform independent, application programs created in one Operating system can run on any other Operating system. C and C++, however, are platform dependent languages, making it impossible for application programs created in one Operating system to run in any other Operating system
- Simple - Because Java incorporates many C/C++ capabilities, it is simple to understand
- Secure - Java offers a variety of defences against malware and viruses. It guarantees that neither damage nor security will be compromised
- Portable - We have the idea of portability in Java. Java allows the same software to run on various platforms
- Robust - It assists us in identifying potential errors as soon as feasible during program development
- Multi-threaded - Java's multithreading programming capability enables you to create a program that executes multiple tasks concurrently
- Distributed -Java maintains the TCP/IP protocol and is therefore suitable for distributed Internet environments.

## Main method
`public static void main(String args[])`
- The main () is the starting point for JVM to start execution of a Java program. 
- Without the main () method, JVM will not execute the program. 
- The syntax of the main () method is: 
  - public: An access specifier, that is. Before calling the main() method, we need to use the public keyword to let the JVM know where the programme is actually being executed. Before the main() method, if we use private, protected, and default, the JVM won't be able to see it.
  - static: You can make a method static by using the keyword static. We should call the main() method without creating an object. 
    - Static methods are the method which are invoked without creating the objects.
  - void: In Java, every method has the return type. Void keyword acknowledges the compiler that the main() method does not return any value.
  - main(): It is a default signature which is predefined in the JVM. It is called by JVM to execute a program line by line and end the execution after completion of this method. We can also overload the main() method.
  - String args[]: The main() method also accepts some data from the user. It accepts a group of strings, which is called a string array. It is used to hold the command line arguments in the form of string values.
    - Here, agrs[] is the array name, and it is of String type. It means that it can store a group of strings. 
    - Remember, this array can also store a group of numbers but in the form of string only. 
    - Values passed to the main() method are called arguments. These arguments are stored into an args[] array, so the name args[] is generally used for it.

## Classes and Objects
- An object is an entity with state and behaviour, such as a chair, bike, marker, pen, table, or car. It could be intellectual or physical (tangible and intangible).
  - The banking system is an illustration of an intangible entity.
- An object has three characteristics
  - State: represents an object's data (value)
  - Behavior: represents how an object behaves (or how it functions), such as when you deposit or withdraw money
  - Identity: Usually, a distinct ID is used to implement an object's identification. The external user cannot see the value of the ID. However, the JVM uses it internally to uniquely identify each object.
- Pen, for instance, is an object. Reynolds is its name; its state is noted as being white. Writing is its behaviour because it is utilized for writing.
- Different ways of Object Definition
  - An object is a real-world entity
  - An object is a runtime entity
  - The object is an entity which has state and behaviour
  - The object is an instance of a class.
- A **class serves as a model or blueprint from which new objects can be made**.
- Therefore, a class's instance (or result) is an object.
- A class includes
  - Fields
  - Methods
  - Con1tructors
  - Blocks
  - Nested class and interface


```
git remote add origin https://github.com/sbhrwl/java.git
git branch -M main
git push -u origin main
```
