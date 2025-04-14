class Typecon{
    public static void main(String[] args)
    {
        // int myInt = 9;
        // double myDouble = myInt; // Automatic casting: int--> double
        // System.out.println(myInt);      // Outputs 9
        // System.out.println(myDouble);   // Outputs 9.0
        double myDouble = 9.78d;
        int myInt = (int) myDouble; // Manual casting: double--> int
        System.out.println(myDouble);   // Outputs 9.78
        System.out.println(myInt);      // Outputs 9
    }
}