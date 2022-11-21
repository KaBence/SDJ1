public class Person
{
  private String name;
  private Address address;
  private MyDate birthday;
  private Brain brain;

  public Person(String name, Address address, MyDate birth)
  {
    this.name = name;
    this.address = address;
    birthday = birth;
    brain=new Brain();
  }

  public Person(String name, MyDate birthday)
  {
    this.name = name;
    address = null;
    this.birthday = birthday;
    brain=new Brain();
  }

  public Person(MyDate birthday)
  {
    this.birthday = birthday;
    name = null;
    address = null;
    brain=new Brain();
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
    return address.toString();
  }

  public void setAddress(Address address)
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

  public int getIQ(){
    return brain.getIQ();
  }

  public boolean isBrainDamaged(){
    return brain.isBrainDamaged();
  }

  public boolean doYouRemember(String topic){
    return brain.recall(topic);
  }

  public void rememberThis(String topic){
    if (!(brain.recall(topic))){
      brain.remember(topic);
    }
    else brain.refreshMemory(topic);
  }

  public String whatAreYouThinkingAbout(){
    return brain.recall();
  }
}
