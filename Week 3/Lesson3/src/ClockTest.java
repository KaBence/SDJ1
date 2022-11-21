public class ClockTest
{
  public static void main(String[] args){
    Clock c=new Clock(14,20,7,true);
    Clock c1=new Clock(4,10,0,false);
    c.tic();
    System.out.println(c);
    System.out.println(c.timeInSeconds(c1));
    Clock c3=c.timeTo(c1);
    System.out.println(c3);

    System.out.println(c);
    System.out.println(c1);
  }
}
