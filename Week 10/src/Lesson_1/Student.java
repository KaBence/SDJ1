package Lesson_1;

import java.io.Serializable;

public class Student implements Serializable
{
  private String firstName,lastName,country;

  public Student(String firstName,String lastName, String country){
    this.country=country;
    this.firstName=firstName;
    this.lastName=lastName;
  }

  public String getFirstName()
  {
    return firstName;
  }
  public void setFirstName(String firstName)
  {
    this.firstName = firstName;
  }
  public String getLastName()
  {
    return lastName;
  }
  public void setLastName(String lastName)
  {
    this.lastName = lastName;
  }
  public String getCountry()
  {
    return country;
  }
  public void setCountry(String country)
  {
    this.country = country;
  }

  public String toString(){
    return firstName+" "+lastName+" "+country;
  }

  public boolean equals(Object obj){
    if (obj==null|| getClass()!=obj.getClass()) return false;
    Student temp=(Student)obj;
    return temp.country.equals(country) &&temp.lastName.equals(lastName)&&temp.firstName.equals(firstName);
  }
}
