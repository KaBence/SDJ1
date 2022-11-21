public class Employee
{
  private String name, department,position;
  private int idNumber;

  public String getName(){
    return name;
  }

  public String getDepartment(){
    return department;
  }

  public String getPosition(){
    return position;
  }

  public int getIdNumber(){
    return idNumber;
  }

  public void setName(String n){
    name=n;
  }

  public void setDepartment(String n){
    department=n;
  }

  public void setPosition(String n){
    position=n;
  }

  public void setIdNumber(int n){
    idNumber=n;
  }
}
