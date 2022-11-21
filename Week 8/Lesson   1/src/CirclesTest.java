public class CirclesTest
{
  public static void main(String[] args)
  {
    Circle c=new Circle(2,2,5);
    Point Center=c.getCenter();
    c.moveCircle(150,0);
    Circle c1=new Circle(Center.getX(), Center.getY(),5);
    CircleList cl=new CircleList(3);
    cl.addCircle(c);
    cl.addCircle(c1);
    System.out.println(cl.getTotalArea());
    System.out.println(cl.getAverageArea());
    for (int i = 0; i < cl.getNumberOfCircles(); i++)
    {
      System.out.println(cl.getCircle(i));
    }
  }

}
