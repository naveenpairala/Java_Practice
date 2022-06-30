import java.util.*;
class cards{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter first card character");
    char a =sc.next().charAt(0);
    System.out.println("enter the card number");
    int n=sc.nextInt();
    System.out.println("enter the second card char");
    char b=sc.next().charAt(0);
    System.out.println("enter the second card number");
    int m=sc.nextInt();
    System.out.println("enter the thrid card char"); 
    char c= sc.next().charAt(0);
    System.out.println("enter the thrid card number");
    int p=sc.nextInt();
    if((a==b&&b==c)&&(n==m&&m==p)){
      System.out.println("double bonanza");
    }
    else if((a==b&&b==c)||(n==m&&m==p)){
      System.out.println("bonanza");
    }
    else
    {
     System.out.println("no bonanza");
    }
  }
}
    
    
    
  
