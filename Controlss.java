class Controlss{
    public static void main(String[] args) {
        // int x = 10;    
        // int y = 12;    
        // if(x+y > 20) // 22>20 True
        // {   
        // System.out.println("x + y is greater than 20");
        // int x = 10;  
        // int y = 12;  
        // if(x+y < 10) //22<10 False
        // {  
        // System.out.println("x + y is less than      10");  
        // }   
        // else 
        // {  
        // System.out.println("x + y is greater than 20");  
        // }  
        // String city = "Mumbai";  
        // if(city == "Hyd") 
        // {  
        // System.out.println("city is Hyd We can eat Biryani");  
        // }
        // else if (city == "Vizag") 
        // {  
        // System.out.println("city is Vizag We can go to Beach");  
        // }
        // else if(city == "Banglore") 
        // {  
        // System.out.println("city is Banglore We can Go to Mall Road");  
        // }
        // else 
        // {  
        // System.out.println("There is no City");  
        // } 
        // int a = 10;
        // int b = 20;
        // // Outer if condition
        // if (a == 10) 
        // {
        //     // Inner if condition
        //     if (b == 10) 
        //     {
        //         System.out.println("PythonLife");
        //     }
        //     else 
        //     {  
        //     System.out.println("I am Inside Only");  
        //     } 
        // }
        // else 
        // {  
        // System.out.println("I am Outside");  
        // } 
    //Declaring a variable for switch expression  
    // int number=40;  
    //Switch expression  
    // switch(number)
    // {  
    //     //Case statements  
    //     case 10: 
    //         System.out.println("10");  
    //     break;  
    //     case 20: 
    //         System.out.println("20");  
    //     break;  
    //     case 30: 
    //         System.out.println("30 Dagara Una");  
    //     break;  
    //     //Default case statement  
    //     default:
    //         System.out.println("Not in 10, 20 or 30");  
    // }  

    // int n = 5;
    // // for loop  
    // for (int i = 1; i <= n; ++i) // 6<=5
    // {
    //     System.out.println("After Loop i=" + i);
    // }

// i=1 1<=5 2
// i=2 2<=5 3
// i=3 3<=5 4
// i=4 4<=5 5
// i=5 5<=5 6
// i=6 6<=5 // False
// int i=0;
// while (i < 5) 
// {
// System.out.println(i);// i=0,1<5,2<5,3<5,4<5,5<5
// i++;
// }
// int i = 0;
// do 
// {
// System.out.println(i);
// i++;
// }
// while (i < 0); //1<5,2<5,3<5,4<5,5<5
// for (int i = 0; i < 10; i++) { // 0<10,1<10,2<10,3<10,4<10
//     if (i == 4) {
//       break;
//     }
//     System.out.println(i);
//   }  

// for (int i = 0; i < 10; i++) {
//     if (i == 4) 
//     {
//     continue;
//     }
//     System.out.println(i);
//     }


    int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
    myNumbers[1][2] = 9;
    System.out.println(myNumbers[1][2]); // Outputs 9 instead of 7
    }}
