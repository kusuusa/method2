/**
 * Notes on Objects and Classes in Java:
 *
 * 1. **Objects**:
 *    - Objects are instances of classes.
 *    - They represent real-world entities and have states (attributes) and behaviors (methods).
 *    - Objects are created using the `new` keyword followed by the class constructor.
 *    - Example: `Car myCar = new Car();`
 *
 * 2. **Classes**:
 *    - A class is a blueprint or template for creating objects.
 *    - It defines the properties (fields) and behaviors (methods) that the objects of the class will have.
 *    - Classes can include:
 *      - Fields: Variables that hold the state of the object.
 *      - Methods: Functions that define the behavior of the object.
 *      - Constructors: Special methods used to initialize objects.
 *      - Nested Classes: Classes defined within another class.
 *    - Example:
 *      ```java
 *      public class Car {
 *          String color; // Field
 *          int speed;    // Field
 *
 *          // Constructor
 *          public Car(String color, int speed) {
 *              this.color = color;
 *              this.speed = speed;
 *          }
 *
 *          // Method
 *          public void drive() {
 *              System.out.println("The car is driving.");
 *          }
 *      }
 *      ```
 *
 * 3. **Key Concepts**:
 *    - **Encapsulation**: Wrapping data (fields) and methods into a single unit (class) and restricting access using access modifiers (e.g., `private`, `public`).
 *    - **Inheritance**: Mechanism where one class (child) inherits the properties and behaviors of another class (parent).
 *    - **Polymorphism**: Ability of a method to perform different tasks based on the object that invokes it (e.g., method overloading and overriding).
 *    - **Abstraction**: Hiding implementation details and exposing only the essential features of an object.
 *
 * 4. **Access Modifiers**:
 *    - `public`: Accessible from anywhere.
 *    - `private`: Accessible only within the class.
 *    - `protected`: Accessible within the same package and by subclasses.
 *    - Default (no modifier): Accessible within the same package.
 *
 * 5. **Static Members**:
 *    - Static fields and methods belong to the class rather than any specific object.
 *    - They can be accessed using the class name.
 *    - Example: `Math.PI` or `ClassName.staticMethod()`.
 *
 * 6. **Object-Oriented Programming (OOP)**:
 *    - Java is an object-oriented programming language.
 *    - OOP principles include encapsulation, inheritance, polymorphism, and abstraction.
 */