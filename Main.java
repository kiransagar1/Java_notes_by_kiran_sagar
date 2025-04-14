// class Student {
//     // data member (also instance variable)
//     int id;
//     // data member (also instance variable)
//     String n;}
//     public class Main{
//         public static void main(String args[]) {
//             // creating an object of
//             // Student
//             Student s1 = new Student();
//             Student s2 = new Student();
//             Student s3 = new Student();
//             Student s4 = new Student();
//             System.out.println(s1.id);
//             System.out.println(s1.n);
//         }
//     }









// class Parent {
//     public void print_karo()
//     {
//         System.out.println("PythonLife");
//     }
// }
// class Child extends Parent {
//     public void print_for() 
//     { 
//         System.out.println("for"); 
//     }
// }
// // // Driver class
// public class Main {
//       // Main function
//     public static void main(String[] args)
//     {
//         Child g = new Child();
//         g.print_karo();
//         g.print_for();
//     }
// }


















// // MultiLevel 

// // First Parent Class 
// class Parent1 {
//     void fun1() { System.out.println("1st Layer"); }
// }

// // Child of Parent1 Class
// class Parent2 extends Parent1{
//     void fun2() { System.out.println("2nd Layer"); }
// }

// // Child of Parent2 Class
// class Parent3 extends Parent2{
//     void fun3() 
//     { 
//         System.out.println("3rd Layer"); 
//     }
// }


// // // Driver class
// public class Main {
//       // Main function
//     public static void main(String[] args)
//     {
//         Parent3 g = new Parent3();
//         g.fun1();
//         g.fun2();
//         g.fun3();
//     }
// }




// concept of Hierarchical  inheritance

// class A {
//     public void print_A() { System.out.println("Class A"); }
// }

// class B extends A {
//     public void print_B() { System.out.println("Class B"); }
// }

// class C extends A {
//     public void print_C() { System.out.println("Class C"); }
// }

// class D extends A {
//     public void print_D() { System.out.println("Class D"); }
// }

// // Driver Class
// public class Test {
//     public static void main(String[] args)
//     {
//         B obj_B = new B();
//         obj_B.print_A();
//         obj_B.print_B();

//         C obj_C = new C();
//         obj_C.print_A();
//         obj_C.print_C();

//         D obj_D = new D();
//         obj_D.print_A();
//         obj_D.print_D();
//     }
// }



// Multiple Inheritance

// class A
// {
//     public void execute()
//     {
//         System.out.println("Hi.. Executing From Class A");
//     }
// }
// class B
// {
//     public void execute()
//     {
//         System.out.println("Hi.. Executing From Class B");
//     }
// }
// class C extends A, B
// {
    
// }
// public class Main
// {
// 	public static void main(String[] args) 
// 	{
//         C obj = new C(); // creating object of class C
//         obj.execute(); // execute() method is present in both class A and B
// 	}
// }







// interface A
// {
//   public void execute(int num1);
// }
// interface B
// {
//   public void execute(int num1);
// }
// class C implements A, B
// {
//   public void execute(int num1)
//   {
//     System.out.println("Hello.. From Implementation Class!!" + num1);
//   }
// }
// public class Main
// {
//   public static void main(String[] args)
//   {
//       C obj = new C();
//       obj.execute(16);
//   }
// }












// class C
// {
//    public void disp()
//    {
// 	System.out.println("C");
//    }
// }

// class A extends C
// {
//    public void disp()
//    {
// 	System.out.println("A");
//    }
// }


// class D extends A
// {
//    public void disp()
//    {
// 	System.out.println("D");
//    }
//    public static void main(String args[]){

// 	D obj = new D();
// 	obj.disp();
//    }
// }




// class Student{
//     int rollno;  
//     String name; //data members
//     void insertRecord(int r, String n) // method defination
//     {  
//     rollno=r;  // 111 222
//     name=n; // kiran pythonlife
//     }  
//     void displayInformation()
//     {
//     System.out.println(rollno+" "+name);
//     }
//     } 
//     public class Main{  
//     public static void main(String args[])
//     {  
//         Student s1=new Student();  
//         Student s2=new Student();  
//         s1.insertRecord(111,"kiran");  // method call 
//         s2.insertRecord(222,"Pythonlife");  
//         s1.displayInformation();  
//         s2.displayInformation();  
//     }  
//     }  






















// Method Overloading : By changing no. of arguments

// class Adder {    
//     // Method to add two integers    
//     static int add(int a, int b) {    
//         return a + b;    
//     }    
//     // Method to add three integers    
//     static int add(int a, int b, int c) {    
//         return a + b + c;    
//     }    
// }    
// public class Main {    
//     public static void main(String[] args) {    
//         // Calling the add method with two integers    
//         System.out.println(Adder.add(11, 11)); // Output: 22    
//         // Calling the add method with three integers    
//         System.out.println(Adder.add(11, 11, 11)); // Output: 33    
//     }    
// }    























    // // //Java Program to create and call a default constructor  
    // class Bike{  
    //     //creating a default constructor  
    //     Bike()
    //     {
    //         System.out.println("Bike is created");
    //     }  
    // }
    // public class Main{
    //     //main method  
    //     public static void main(String args[]){  
    //         //calling a default constructor  
    //         Bike b=new Bike();  
    //     }  
    // }  










    // class Student{  
    //     int id;  
    //     String name;  
    //     //creating a parameterized constructor  
    //     Student(int i,String n){  
    //     id = i;  
    //     name = n;  
    //     }  
    //     //method to display the values  
    //     void display(){System.out.println(id+" "+name);}  
    // }
    // //Main class to create objects and class methods
    // public class Main{
    //     public static void main(String args[]){  
    //     //creating objects and passing values  
    //     Student s1 = new Student(111,"Joseph");  
    //     Student s2 = new Student(222,"Sonoo");  
    //     //calling method to display the values of object  
    //     s1.display();  
    //     s2.display();  
    // }  
    // }  





    //  //Java program to overload constructors  
    //  class Student{  
    //     int id;  
    //     String name;  
    //     int age;  
    //         //creating two arg constructor  
    //     Student(int i,String n){  
    //         id = i;  
    //         name = n;  
    //         }  
    //         //creating three arg constructor  
    //     Student(int i,String n,int a){  
    //         id = i;  
    //         name = n;  
    //         age=a;  
    //         }  
    //         //creating method to display values
    //     void display()
    //     {
    //         System.out.println(id+" "+name+" "+age);
    //         }  
    //     }
    // //creating a Main class to create instance and call methods
    // public class Main{
    //     public static void main(String args[]){  
    //     Student s1 = new Student(111,"Karan");  
    //     Student s2 = new Student(222,"Aryan",25);  
    //     s1.display();  
    //     s2.display();  
    // }  
    // } 



// // Before This keyword
// class Student{  
//     int rollno;  
//     String name;  
//     float fee;  

//     Student(int rollno,String name,float fee){  
//         rollno=rollno;  
//         name=name;  
//         fee=fee;  
//     }  
//     void display(){System.out.println(rollno+" "+name+" "+fee);}  
//     }  

//     public class Main{  
//     public static void main(String args[]){  
//     Student s1=new Student(111,"ankit",5000f);  
//     Student s2=new Student(112,"sumit",6000f);  
//     s1.display();  
//     s2.display();  
//     }}  


    // After This keyword
    // class Student{  
    //     int rollno;  
    //     String name;  
    //     float fee;  
    //     Student(int rollno,String name,float fee){  
    //     this.rollno=rollno;  
    //     this.name=name;  
    //     this.fee=fee;  
    //     }  
    //     void display(){System.out.println(rollno+" "+name+" "+fee);}  
    //     }  
    //     public class Main{  
    //     public static void main(String args[]){  
    //     Student s1=new Student(111,"ankit",5000f);  
    //     Student s2=new Student(112,"sumit",6000f);  
    //     s1.display();  
    //     s2.display();  
    //     }}  




    // class A{  
    //     void m()
    //     {
    //         System.out.println("hello m");
    //     }  
    //     void n()
    //     {  
    //     System.out.println("hello n");  
    //     //m();//same as this.m()  
    //     this.m();  
    //     }  
    //     }  
    // public class Main{  
    // public static void main(String args[]){  
    // A a=new A();  
    // a.n();  
    // }}



    // class A{  

    //     A()
    //     {
    //         System.out.println("hello a");
    //     }  
    //     A(int x)
    //     {  
    //         this();  
    //         System.out.println(x);  
    //     }  
    // }  
    // public class Main{  
    //     public static void main(String args[]){  
    //         A a=new A(10);  
    //     }
    // } 







































// // Method Overloading : By changing data type of arguments
// class Adder {    
//     // Method to add two integers    
//     static int add(int a, int b) {    
//         return a + b;    
//     }    
//     // Method to add two doubles    
//     static double add(double a, double b) {    
//         return a + b;    
//     }    
// }    
// public class Main {    
//     public static void main(String[] args) {    
//         // Calling the add method with two integers    
//         System.out.println(Adder.add(11, 11)); // Output: 22         
//         // Calling the add method with two doubles    
//         System.out.println(Adder.add(12.3, 12.6)); // Output: 24.9    
//     }    
// }    










// // Method OverRiding
// class Animal {
//     public void displayInfo() {
//        System.out.println("I am an animal.");
//     }
//  }
//  class Dog extends Animal {
//     public void displayInfo() {
//        super.displayInfo();
//        System.out.println("I am a dog.");
//     }
//  }
//  class Main {
//     public static void main(String[] args) {
//        Dog d1 = new Dog();
//        d1.displayInfo();
//     }
//  }
 












// // Private

// class A {
//     private void display() {
//         System.out.println("GeeksforGeeks");
//     }
// }
// // Class B
// class B {
//     public static void main(String args[]) {
//         A obj = new A();
      
//         // Trying to access private method
//         // of another class
//         obj.display();
//     }
// }




// Private Variable

// class Data {
//     // private variable
//     private String name;
// }

// public class Main {
//     public static void main(String[] main){

//         // create an object of Data
//         Data d = new Data();

//         // access private variable and field from another class
//         d.name = "PythonLife";
//     }
// }



// Protected 

// class Animal {
//    protected String name;
//    protected void makeSound() {
//        System.out.println(name + " makes a sound");
//    }
// }

// class Dog extends Animal {
//    Dog(String name) 
//    { this.name = name; 
//    }
//    void bark() { 
//       makeSound(); 
//       System.out.println(name + " barks"); }
// }

// public class Main {
//    public static void main(String[] args) {
//        Dog dog = new Dog("Buddy");
//        dog.bark();  // Accessing protected members in subclass
//    }
// }
