public class Geometry
{
  public static double area(double r){
    return Math.PI*Math.pow(r,2);
  }

  public static double area(double length,double width){
    return length*width;
  }

  public static double area(int base,int height){
    return base*height*0.5;
  }
}
