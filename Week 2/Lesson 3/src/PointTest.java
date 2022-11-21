public class PointTest
{
  public static void main(String[] args){
    Point p1=new Point(0,0);
    Point p2=new Point(5,5);
    p1.moveTo(10,10);
    p2.move(15,15);
    System.out.println(p1.toString());
    System.out.println(p2.toString());

    double xd=Math.floor(p2.getX()-p1.getX());
    double yd=Math.floor(p2.getY()-p1.getY());

    System.out.println("The distance between the two points: "+Math.sqrt((xd+yd)));
  }
}
