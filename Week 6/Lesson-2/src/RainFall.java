import java.util.Scanner;

public class RainFall
{
  Scanner k=new Scanner(System.in);
  private double[] rainfall=new double[12];
  private double temp=0;
  public RainFall(){
    System.out.println("tell me the 12 numbers:");
    for (int i = 0; i < rainfall.length; i++)
    {
      temp=k.nextInt();
      while (temp<0){
        System.out.println("Wrong input...\ntry again");
        temp=k.nextInt();
      }
      rainfall[i]=temp;
    }
  }

  public double totalRainFall(){
    double sum=0;
    for(double item : rainfall){
      sum+=item;
    }
    return sum;
  }

  public double averageRainFall(){
    return totalRainFall()/12;
  }

  public double mostRain(){
    double max=0;
    for(double item : rainfall){
      if (item>max) max=item;
    }
    for (double item : rainfall)
    {
      if (item == max)
      {
        return item;
      }
    }
    return -2;
  }

  public double leastRain(){
    double min=9999;
    for(double item : rainfall){
      if (item<min) min=item;
    }
    for (double item : rainfall)
    {
      if (item == min)
      {
        return item;
      }
    }
    return -2;
  }


}
