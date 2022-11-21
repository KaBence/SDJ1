public class Person
{
  private String name, address;
  private MyDate birthday;

  public Person(String name, String address, MyDate birth)
  {
    this.name = name;
    this.address = address;
    birthday = birth;
  }

  public Person(String name, MyDate birthday)
  {
    this.name = name;
    address = null;
    this.birthday = birthday;
  }

  public Person(MyDate birthday)
  {
    this.birthday = birthday;
    name = null;
    address = null;
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public String getAddress()
  {
    return address;
  }

  public void setAddress(String address)
  {
    this.address = address;
  }

  public MyDate getBirthday()
  {
    return birthday;
  }

  public int getAge()
  {
    if (birthday.isBefore(MyDate.today()))
    {
      if (MyDate.today().getMonth()<birthday.getMonth()
          || birthday.getDay() < MyDate.today().getDay()&& MyDate.today().getMonth()==birthday.getMonth())
        return (MyDate.today().getYear()-birthday.getYear() ) - 1;
      else
        return MyDate.today().getYear() - birthday.getYear() ;
    }
    else return -1;
  }

  public String toString(){
    return name+" - "+address+" - "+birthday;
  }

  public boolean equals(Object obj){
    if (obj==null || getClass()!=obj.getClass()) return false;
    Person temp=(Person)obj;
    return name.equals(temp.name)&&address.equals(temp.address)&& birthday.equals(temp.birthday);
  }
}
