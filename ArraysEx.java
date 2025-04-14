public class ArraysEx {
    public static void main(String[] args) {

        // int a[]={33,3,4,5};// array declaration
        // System.out.println(a[3]); // acessing of an element
    
      // Changing the first element to 20
    //   int a[]={33,3,4,5};
    //   System.out.println("Before" +a[0]); // a[0]=33
    //   a[0] =1222;
    //   System.out.println("After" +a[0]);//a[0]=1222
    
        // Getting the length of the array
        // int a[]={33,3,4,5};
        // int length = a.length;
        // System.out.println("Length" +length);
    
     // declares an Array of integers.
    //  int[] arr;
     // allocating memory for 5 integers.
    //  arr = new int[5];
    //  // initialize the elements of the array
    //  // first to last(fifth) element
    //  arr[0] = 10;
    //  arr[1] = 20;
    //  arr[2] = 30;
    //  arr[3] = 40;
    //  arr[4] = 50; // int[] arr={10,20,30,40,50}:
    //  // accessing the elements of the specified array  length=5
    //  for (int i = 0; i < arr.length; i++) //i=4 4<5 i=5
    //      System.out.println("Element at index "+ i + " : " + arr[i]); // 10,20,30,,40,50

    // int[][] arr = new int[3][3];
    // // Number of Rows
    // System.out.println("Rows : " + arr.length);
    // // Number of Columns
    // System.out.println("Columns : " + arr[0].length);

    // int arrr[][] = { { 2, 7, 9 }, { 3, 6, 1 }, { 7, 4, 2 } };
    // printing 2D array
    // for (int i = 0; i < 3; i++) { // i=2 2<3 3
    //     for (int j = 0; j < 3; j++) { // j=2 2<3 3
    //         System.out.print(arrr[i][j] + " "); //arrr[0][0] arrr[0][1] arrr[0][2]
    //     }                                       ////arrr[1][0] arrr[1][1] arrr[1][2]
    //                                             ////arrr[2][0] arrr[2][1] arrr[2][2]
    //     System.out.println();
    
    // String[] cars = {"Royal Enfield", "BMW", "Java", "Hero"};
    // for (int i = 0; i < cars.length; i++) {
    //         System.out.println(cars[i]);
    //     }
    //     int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };//{1,2,3,4}
    //                                                     // {5,6,7}
    //     System.out.println(myNumbers[1][2]); // Outputs 7

    int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
    myNumbers[1][2] = 9;
    System.out.println(myNumbers[1][2]);
    for (int i = 0; i < 4; i++) { // i=2 2<3 3
            for (int j = 0; j < 3; j++) { // j=2 2<3 3
                System.out.print(myNumbers[i][j] + " "); //arrr[0][0] arrr[0][1] arrr[0][2]
            }                                       ////arrr[1][0] arrr[1][1] arrr[1][2]
                                                    ////arrr[2][0] arrr[2][1] arrr[2][2]
            System.out.println();

}
// }
    }}








