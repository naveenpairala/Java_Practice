//exception handling using try and catch
    import java.util.*;
class Handling {
  public static void main(String args[]) {
    System.out.println("hello");
    String name = "naveen123";
    try {
      System.out.println(Integer.parseInt(name));
    }
    catch (Exception e) {
      System.out.println(e);
    }
  }
}