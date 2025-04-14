// class Final_Ex {
//     public final void print() {
//         System.out.println("This method cannot be overridden by any subclass");
//     }
// }

// public class SubClass extends Final_Ex {
//     // Compiler error - cannot override final method
//     public void print() {
//         System.out.println("This will generate a compiler error");
//     }
// }








// public class SubClass {
//     public static void main(String[] args) {
//         final int MY_CONSTANT = 100;
//         MY_CONSTANT = 200; // This will cause a compilation error
//         System.out.println(MY_CONSTANT);

//     }

// }




//Static
// class Counter {
//     static int count = 0; //static variable

//   static void increment() { // static method
//         count++;
//     }
// }
// public class StaticVariableExample {
//     public static void main(String[] args) {
//         Counter.increment(); // classname.static method
//         System.out.println(Counter.count); // 1
//         Counter.increment();
//         System.out.println(Counter.count); // classname.static variable
//     }
// }
