/* JFM1T5_Assignment3:

   Write a program to store the temperature of your city for last 7 days and print the lowest temperature of the week.
   Prompt the user input from the terminal.
   
   Sample Input:
   Enter number of days 
   3
   Enter the temperature of Day :1
   88
   Enter the temperature of Day :2
   34
   Enter the temperature of Day :3
   0 
   
   Expected Output:
   The lowest temperature of the week 3 is 0.0 celsius

*/


import java.util.Scanner;

public class Temperature{

//Define the main method
  public static void main(String[] args){
  

//Declare the variables and initialize
    int n, i,week=1;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the days");
    n=sc.nextInt();
    float a[]=new float[n];
    for(i=0;i<n;i++){
      System.out.println("enter the temparature days="+(i+1));
      a[i]=sc.nextFloat();
    }
    Float lowest_temperature=a[0];
    for(i=0;i<n;i++){
      if(a[i]<lowest_temperature)
      {
    lowest_temperature=a[i];
        week=i+1;
    }
    }

//Take temperature of 7 days as a input from user

//Calculate the lowest temperature

//Print the result

System.out.println("lowest temperature of the week "+week+" is "+lowest_temperature);

}
}