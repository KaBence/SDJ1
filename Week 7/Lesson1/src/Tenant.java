public class Tenant
{
  private String name,phone;
  private double rentDue;
  public Tenant(String name,String phone){
    this.name=name;
    this.phone=phone;
    rentDue=0;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public void setPhone(String phone)
  {
    this.phone = phone;
  }

  public void setRentDue(double rentDue)
  {
    this.rentDue = rentDue;
  }

  public String getName()
  {
    return name;
  }

  public String getPhone()
  {
    return phone;
  }

  public double getRentDue()
  {
    return rentDue;
  }

  public Tenant copy(){
    Tenant temp=new Tenant(name,phone);
    temp.setRentDue(rentDue);
    return temp;
  }

  public String toString(){
    return name+" "+phone+" "+rentDue;
  }

}
