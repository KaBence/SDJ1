public class Car extends Vehicle
{
  private String regNo;
  public Car (String owner,double price,String regNo){
    super(owner, price);
    this.regNo=regNo;
  }

  public String getRegistrationNumber()
  {
    return regNo;
  }
  public void setRegistrationNumber(String regNo)
  {
    this.regNo = regNo;
  }

  public String toString(){
    return super.toString()+"RegNo: "+regNo;
  }

  public boolean equals(Object obj){
    if (obj==null &&getClass()!=obj.getClass())return false;
    Car temp=(Car)obj;
    return super.equals(temp)&&regNo.equals(temp.regNo);
  }

}
