package Lesson_2;

import java.io.Serializable;

public class Owner implements Serializable
{
  private String firstName,lastName;

  public Owner(String firstName, String lastName){
    this.firstName=firstName;
    this.lastName=lastName;
  }

  public void setLastName(String lastName)
  {
    this.lastName = lastName;
  }
  public String getLastName()
  {
    return lastName;
  }
  public void setFirstName(String firstName)
  {
    this.firstName = firstName;
  }
  public String getFirstName()
  {
    return firstName;
  }

  public String toString(){
    return firstName+" "+lastName;
  }

  public boolean equals(Object obj){
    if (obj==null || obj.getClass()!=getClass()) return false;
    Owner temp=(Owner) obj;
    return temp.lastName.equals(lastName)&&temp.firstName.equals(firstName);
  }
}
