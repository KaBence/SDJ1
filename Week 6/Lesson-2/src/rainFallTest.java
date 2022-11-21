public class rainFallTest
{
  public static void main(String[] args)
  {
    RainFall rf=new RainFall();
    System.out.println("Total rain: "+rf.totalRainFall());
    System.out.println("Most rain in: "+rf.mostRain()+". month");
    System.out.println("Least rain in: "+rf.leastRain()+". month");
    System.out.println("Average rain in: "+rf.averageRainFall()+". month");

  }
}
