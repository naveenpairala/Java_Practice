import java.util.*;
class reverse{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    System.out.println("enter the values");
    int n,reverse=0;
    n=sc.nextInt();
    while(n!=0){
      int remainder=n%10;
      reverse=reverse*10+remainder;
      n=n/10;
    }
    System.out.println("reverse order of number="+reverse);
      
  }
}
