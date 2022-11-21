public class Circle
{
  private double radius;

  public Circle(){
    radius=0;
  }

  public Circle(double radius){
    this.radius=radius;
  }

  private double getArea()
  {
    return Math.PI * radius * radius;
  }
  private double getRadius()
  {
    return radius;
  }

  public String toString(){
    return getRadius()+" "+getArea();
  }

  public boolean equals(Object obj){
    if (obj==null || getClass()!=obj.getClass()) return false;
    Circle temp=(Circle)obj;
    return radius==temp.radius;
  }

  public boolean greaterThan(Circle obj){
    return radius>obj.radius;
  }
}
