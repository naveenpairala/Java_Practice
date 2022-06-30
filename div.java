import java.util.*;
public class div{
  public static void main(String[] args){
    int n;
    Scanner sc=new Scanner(System.in);
    System.out.println("n value");
    n=sc.nextInt();
    if(n%5==0 && n%11==0){
      System.out.println("divisiable by 5 and 11="+n);
  }
    else{
      System.out.println("not divisable by 5 and 11="+n);
  } 
}
}