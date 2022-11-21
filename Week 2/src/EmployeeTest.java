public class EmployeeTest
{
  public static void main(String[] args){
    Employee e1=new Employee();
    Employee e2=new Employee();
    Employee e3=new Employee();

    e1.setName("Susan Meyers");
    e1.setIdNumber(47899);
    e1.setDepartment("Accounting");
    e1.setPosition("Vice President");

    e2.setName("Mark Jones");
    e2.setIdNumber(39119);
    e2.setDepartment("IT");
    e2.setPosition("Programmer");

    e3.setName("Joy Rogers");
    e3.setIdNumber(81774);
    e3.setDepartment("Manufacturing");
    e3.setPosition("Engineer");

    System.out.println("First Person name is: "+e1.getName()+" IdNumber: "+e1.getIdNumber()+" Department: "+e1.getDepartment()+" Position: "+ e1.getPosition());
    System.out.println("Second Person name is: "+e2.getName()+" IdNumber: "+e2.getIdNumber()+" Department: "+e2.getDepartment()+" Position: "+ e2.getPosition());
    System.out.println("Third Person name is: "+e3.getName()+" IdNumber: "+e3.getIdNumber()+" Department: "+e3.getDepartment()+" Position: "+ e3.getPosition());
  }
}
