package Shape;

public class ShapeTest
{
  public static void main(String[] args)
  {
    TwoDimensionalShape[] tds= new TwoDimensionalShape[3];
    tds[0]=new Circle(4,5,5);
    tds[1]=new Rectangle(0,0,3,4);
    for (TwoDimensionalShape item: tds){
      System.out.println(item);
    }

  }
}
