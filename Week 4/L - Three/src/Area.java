public class Area
{
  public static double shapes(double r){
    return (Math.PI*Math.pow(r,2));
  }

  public static double shapes(int width,int length){
    return (width*length);
  }

  public static double shapes(double r,double h){
    return (Math.PI*Math.pow(r,2)*h);
  }
}
