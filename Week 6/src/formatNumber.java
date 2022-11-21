public class formatNumber
{
  public static void main(String[] args)
  {
    System.out.println(formatnumber(2735920));
  }

  public static String formatnumber(double n){
    if (n<1000) return String.valueOf((int)n);
    else return formatnumber(Math.floor(n/1000))+","+String.valueOf((int)n%1000);
  }
}
