// public class Example {
//     int instanceVar = 10;
//     static int staticVar = 20;
//     public static void main(String[] args) {
//         // Local variable: Only exists within the method
//         int localVar = 30;
//         // Print local variable (only inside the main method)
//         System.out.println("Local Variable: " + localVar);
//         // Print static and instance variables (can access static from anywhere)
//         Example obj1 = new Example();
//         System.out.println("Instance Variable (obj1): " + obj1.instanceVar);
//         System.out.println("Static Variable (obj1): " + Example.staticVar);
//     }
// }






// class Example {
//     public static void main(String[ ] args) {
//       int[] myNumbers = {1, 2, 3};
//       System.out.println(myNumbers[10]); // error!
//     }
//   }






// class Example {
//     public static void main(String[ ] args) {
//       try {
//         int[] myNumbers = {1, 2, 3};
//         System.out.println(myNumbers[10]);
//       } 
//       catch (Exception e) {
//         System.out.println("Something went wrong.");
//       }
//     }
//   }






// class Example {
// public static void main(String[] args) {
//   try {
//     int[] myNumbers = {1, 2, 3};
//     System.out.println(myNumbers[10]);
//   } 
//   catch (Exception e)
//    {
//     System.out.println("Something went wrong.");
//   } 
//   finally 
//   {
//     System.out.println("The 'try catch' is finished.");
//   }
// }
// }


// class Example {
//     public static void main(String[] args) {
//       try {
//         System.out.println("Something went wrong.");

//       } 
//       catch (Exception e)
//        {
//         System.out.println("Something went wrong.");
//       } 
//       finally 
//       {
//         System.out.println("The 'try catch' is finished.");
//       }
//     }
//     }
    






// The throw statement allows you to create a custom error.
// The throw statement is used together with an exception type. 
// There are many exception types available in Java: ArithmeticException, FileNotFoundException, 
// ArrayIndexOutOfBoundsExceptionetc:
// throw is used inside a method to actually throw an exception. 
// It's a way to explicitly signal that an exception has occurred
// class Example { 
//    static void checkAge(int age) 
//    {
//     if (age < 18) {
//       throw new ArithmeticException("Access denied - You must be at least 18 years old.");
//     }
//     else {
//       System.out.println("Access granted - You are old enough!");
//     }
//   }

//   public static void main(String[] args) {
//     checkAge(20); 
//   }
// }






// throws is used in a method declaration to declare that a method might throw one or more exceptions. It doesn't throw the exception itself.
public class Example {

  // This method might throw an ArithmeticException
  public static void divideByZero() throws ArithmeticException {
      int result = 10 / 0;  // This will throw ArithmeticException
      System.out.println("Result: " + result);
  }

  public static void main(String[] args) {
      try {
          // Calling the method that might throw an exception
          divideByZero();
      } catch (ArithmeticException e) {
          // Handling the exception here
          System.out.println("Error: " + e.getMessage());
      }
  }
}
