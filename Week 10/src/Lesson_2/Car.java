package Lesson_2;

import java.io.Serializable;

public class Car implements Serializable
{
  private String regNumber,make,model;
  private int year;
  private Owner owner;

  public Car(String regNumber,String make,String model,int year,Owner owner){
    this.make=make;
    this.model=model;
    this.year=year;
    this.regNumber=regNumber;
    this.owner=owner;
  }

  public int getYear()
  {
    return year;
  }
  public String getMake()
  {
    return make;
  }
  public String getModel()
  {
    return model;
  }
  public String getRegNumber()
  {
    return regNumber;
  }
  public Owner getOwner()
  {
    return owner;
  }

  public String toString(){
    return regNumber+" "+make+" "+model+" "+year+owner;
  }

  public boolean equals(Object obj){
    if (obj==null || obj.getClass()!=getClass()) return false;
    Car temp=(Car) obj;
    return make.equals(temp.make)&&model.equals(temp.model)&&year==temp.year&&regNumber.equals(temp.regNumber)&&owner.equals(temp.owner);
  }
}
