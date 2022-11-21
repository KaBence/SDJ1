public class Car
{
  private String make,model,color,licenseNumber;
  private int year;

  public Car(String make,String model,String color,String licenseNumber,int year){
    this.make=make;
    this.model=model;
    this.color=color;
    this.licenseNumber=licenseNumber;
    this.year=year;
  }

  public Car(String make,String model,String color,int year){
    this.make=make;
    this.model=model;
    this.color=color;
    this.year=year;
    licenseNumber=null;
  }

  public Car(){
    make=null;
    model=null;
    color=null;
    year=0;
    licenseNumber=null;
  }

  public String getMake(){
    return make;
  }
  public String getModel(){
    return model;
  }
  public String getColor(){
    return color;
  }
  public String getLicenseNumber(){
    return licenseNumber;
  }
  public int getYear(){
    return year;
  }

  public void setColor(String color){
    this.color=color;
  }
  public void setLicenseNumber(String licenseNumber){
    this.licenseNumber=licenseNumber;
  }

  public Car copy(){
    return new Car(make,model,color,licenseNumber,year);
  }

  public String toString(){
    return year+" "+make+": "+model+": "+color+": "+licenseNumber;
  }

  public boolean equals(Object obj){
    if (obj==null || getClass()!=obj.getClass()) return false;
    Car temp=(Car)obj;
    return make.equals(temp.make)&&model.equals(temp.model)&&color.equals(temp.color)&&licenseNumber.equals(temp.licenseNumber)&&year==temp.year;
  }

}
