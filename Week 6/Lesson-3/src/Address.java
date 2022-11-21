public class Address
{
  private String street,number,postalCode,city,country;

  private Address(String st,String no,String pc,String ci,String co){
    setAddress(st,no,pc,ci,co);
  }
  public void setAddress(String st,String no,String pc,String ci,String co){
    street=st;
    number=no;
    postalCode=pc;
    city=ci;
    country=co;
  }

  public String getStreet(){
    return street;
  }
  public void setStreet(String street)
  {
    this.street = street;
  }
  public String getCity()
  {
    return city;
  }
  public void setCity(String city)
  {
    this.city = city;
  }
  public String getCountry()
  {
    return country;
  }
  public void setCountry(String country)
  {
    this.country = country;
  }
  public String getNumber()
  {
    return number;
  }
  public void setNumber(String number)
  {
    this.number = number;
  }
  public String getPostalCode()
  {
    return postalCode;
  }
  public void setPostalCode(String postalCode)
  {
    this.postalCode = postalCode;
  }

  public String toString(){
    return  country+" "+postalCode+" "+city+" "+street+" "+number;
  }

  public boolean equals(Object obj){
    if (obj==null || getClass()!=obj.getClass()) return false;
    Address temp=(Address)obj;
    return toString().equals(temp);
  }
}
