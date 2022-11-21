public class Point
{
  private double x, y;

  public Point(double x,double y){
    this.x=x;
    this.y=y;
  }

  public double getX(){
    return x;
  }
  public double getY(){
    return y;
  }
  public void setX(int x){
    this.x=x;
  }
  public void setY(int y){
    this.y = y;
  }

  public void move(double xDistance,double yDistance){
    x+=xDistance;
    y+=yDistance;
  }

  public String toString(){
    return "("+x+","+ y +")";
  }

  public Point copy(){
    return new Point(x,y);
  }

  public boolean equals(Object obj){
    if (obj==null &&getClass()!=obj.getClass())return false;
    Point temp=(Point)obj;
    return temp.x==x&&temp.y==y;
  }
}
