
    import java.util.*;
class Product
  {
    private int pid;
    private String pname;
    void setPid(int pid)
    {
      this.pid=pid;
    }
    void setPname(String pname)
    {
      this.pname=pname;
    }
    int getPid()
    {
      return this.pid;
    }
    String getPname()
    {
      return this.pname;
    }
  }
class Encap
  {
    public static void main(String args[])
    {
      Product p=new Product();
      Scanner sc=new Scanner(System.in);
      System.out.println("enter  product id");
      int pid=sc.nextInt();
      p.setPid(pid);
      p.setPname("oranges");
      System.out.println(p.getPid()+" "+p.getPname());
      
    }
  }
