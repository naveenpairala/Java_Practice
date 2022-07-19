class Empolyee{
  String empName;
  String empAddress;
  int empId;
  int empSalary;
  public String toString(){
    return "name :" + empName + "Address :" + empAddress + "Id:"
      + empId;
  }
  void displInfo(){
    System.out.println(empName + empAddress + empId);
  }
  void dispSalary(){
    System.out.println(empSalary);
  }
  
}
class Main1{
  public static void main(String[] args){
    Empolyee e1 = new Empolyee();
    e1.empName = "Tejesh";
    e1.empAddress = "Vijayawada";
    e1.empSalary = 20000;
    e1.empId = 1;
    e1.displInfo();
    e1.dispSalary();
  }
}