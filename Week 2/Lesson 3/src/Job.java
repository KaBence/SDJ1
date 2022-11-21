public class Job
{
  private String title;
  private double salary;
  private Person employee;

  public Job(String t,double s,Person employee){
    title=t;
    salary=s;
    this.employee=new Person(employee.getName(), employee.getBirthday());
  }

  public Job(String t,double s){
    title=t;
    salary=s;
    employee=null;
  }

  public String getTitle(){
    return title;
  }

  public double getSalary(){
    return salary;
  }

  public Person getEmployee()
  {
    return employee;
  }

  public void setTitle(String t){
    title=t;
  }

  public void setSalary(double s){
    salary=s;
  }

  public void setEmployee(Person p){
    employee=p;
  }

  public void givePercentageRaise(double percentage){
    salary*=(1+percentage);
  }

  public String toString(){
    if (employee==null)
    {
      return title + " " + salary;
    }
    else return title + " " + salary + " " + employee.getName() + " " + employee.getBirthday();
  }
}
