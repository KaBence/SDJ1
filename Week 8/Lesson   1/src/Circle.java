public class Circle
{
  private double radius;
  private Point center;

  public Circle(double x, double y,double radius){
    center=new Point(x, y);
    this.radius=radius;
  }

  public Point getCenter(){
    return center.copy();
  }

  public double getRadius()
  {
    return radius;
  }

  public void moveCircle(double dx,double dy){
    center.move(dx,dy);
  }

  public double getArea(){
    return Math.pow(radius,2)*Math.PI;
  }

  public String toString(){
    return "Radius: "+radius+" Center: "+center;
  }

  public boolean equals(Object obj){
    if (obj==null &&getClass()!=obj.getClass())return false;
    Circle temp=(Circle)obj;
    return radius==temp.radius&& center.equals(temp.center);
  }
}
