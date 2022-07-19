class Student
  {
    String name;
    String address;
    int rollno;
    String batch;
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
   public  String toString()
    {
      return "name : "+name+"  address: "+address+ " roll no."+rollno;
    }
  }
class Main{
   public static void main(String args[])
    {
      //object create
     
      Student st1=new Student();
      st1.name="Lalitha";
      st1.address="Vijayawada";
      st1.rollno=123;
      st1.batch="chanakaya";
    System.out.println("*student1 Information**");
        System.out.println(st1);
      st1.learn();//calling the metod//instance method
      st1.write();
      st1.read();
      Student st2=new Student();
      st2.name="Anil";
      st2.address="Hyderabad";
      st2.rollno=345;
      st2.batch="chanakaya";
          System.out.println("*student2 Information**");
      System.out.println(st2);
      st2.learn();
      st2.write();
      st2.read();
      Student st3=new Student();
      st2.name="naveen";
      st2.address="Hyderabad";
      st2.rollno=502;
      st2.batch="chanakaya";
          System.out.println("*student3 Information**");
      System.out.println(st2);
      st2.learn();
      st2.write();
      st2.read();
      
    // System.out.println(st1.name+" "+st1.address+" "+st1.rollno+" "+st1.batch);//hashcode
    // System.out.println(st2.name+" "+st2.address+" "+st2.rollno+" "+st2.batch);
    }
}