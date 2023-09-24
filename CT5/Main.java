package CT5;
import java.util.Scanner;

 class Main {



public static void main(String[] args)

{

int[] arrray = new int[5]; // variable declaration

Scanner s = new Scanner(System.in); // scanner declaration

System.out.print("Enter five numbers:");

for(int i=0;i<5;i++) // Loop runs from 0 to 4 total 5 times

arrray[i] = s.nextInt(); // Accept array elements

System.out.println("Multiplication of 5 numbers is "+multiply(arrray,4)); // calling function

}

public static int multiply(int x[], int count) // Called function

{

if(count<0)

return 1; // It return 1

return x[count] * multiply(x, --count); // recursive calling

}

}