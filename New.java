import java.util.*;
class New{
  public static void main(String[] args){
    int n;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the array size");
     n=sc.nextInt();
      System.out.println("enter the array element");
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
      
    }
    System.out.println("enter the index value");
    int index=sc.nextInt();
    for(int i=index-1; i<arr.length-1; i++){
      arr[i]=arr[i+1];
    }
    System.out.println("after deletion");
    for(int i=0;i<arr.length-1;i++)
      {
    
      
    System.out.println(arr[i]);
  }
  }
}