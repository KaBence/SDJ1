public class Person
{
  private String name;
  private String birthday;

  public Person(String N,String B){
    name=N;
    birthday=B;
  }

  public Person(){
    name="name";
    birthday="birthday";
  }

  public String toString(){
    return "Name: "+name+" Birthday: "+ birthday;
  }

  public String getName(){
    return name;
  }

  public String getBirthday(){
    return birthday;
  }

  public void setName(String n){
    name=n;
  }

  public void setBirthday(String b){
    birthday=b;
  }

}
