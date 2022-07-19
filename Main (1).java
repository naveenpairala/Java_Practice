//Deafult
import java.util.*;
class Student
  {
    Scanner sc=new Scanner(System.in);
    String name;
    String address;
    int rollno;
    String batch;
    //constructor
    //Student(String n,String a,int r,String b )
    Student()
    {
     // String name="naveen";
    // String address="wrnhl";
      // int rollno=103;
     // batch=b;
    }
    void learn()
    {
      System.out.println(name+" Learning");
    }
    void write()
    {
      System.out.println(name+ " writing");
    }
    void read()
    {
      System.out.println(name+" reading");
    }
  // public  String toString()
   // {
     // return "name : "+name+"  address: "+address+" rollno "+rollno+" batch"+batch;
   // }//
  }
class Main{
   public static void main(String args[])
    {
      //object create
   
       
      Student st1=new Student();
      st1.name="naveen";
      
 
      Student st2=new Student();
      System.out.println(st1.name);
      System.out.println(st2);
      
    }
}