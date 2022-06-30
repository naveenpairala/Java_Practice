import java.util.*;
class armstrong
{
  public static void main(String args[]){
    int n, reminder;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter number");
    n=sc.nextInt();
    int input=n, count=0, sum=0;
   while(n>0) {
     count++;
      n=n/10;
      }
    n=input;
    while(n>0){
      reminder=n%10;
      sum+=Math.pow(reminder,count);
      n=n/10;
    }
    n=input;
    if(sum==n){
      System.out.println(n+" is a armstrong number");
    }
    else{
      System.out.println(n+" is not a armstrong number");
    }
  }
}