public class MyDateTest
{
  public static void main(String[] args)
  {
    try
    {
      MyDate d1=new MyDate(32,1,1999);
    }
    catch (IllegalDateException e){
      System.out.println(e);
    }
  }
}
