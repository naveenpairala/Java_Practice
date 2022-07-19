
    class Car
    {
      //Variables
      String color="red";
      void run()
      {
        System.out.println("car is Running");
      }
    }
class Bike extends Car{​
 String color="black";
  void displayColor()
  {
    System.out.println(super.color);
  }
  void run()
  {
   super.run();
    System.out.println("Bike is running");
  }
}
class Superkeyword
  {
    public static void main(String args[])
    {
      Bike b=new Bike();
      b.run();
      System.out.println(b.color);
      b.displayColor();
    }
  }
