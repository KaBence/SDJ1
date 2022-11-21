import java.util.Scanner;

public class Temperature
{
  Scanner k=new Scanner(System.in);
  private double ftemp;
  public Temperature(double ftemp){
    this.ftemp=ftemp;
  }
  public Temperature(){
    System.out.println("Tell me a Fahrenheit value");
    ftemp=k.nextDouble();
  }
  public void setFahrenheit(double ftemp){
    this.ftemp=ftemp;
  }
  public double getFahrenheit(){
    return ftemp;
  }
  public double getCelsius(){
    return (5.0/9)*(ftemp-32);
  }

  public double getKelvin(){
    return ((5.0/9)*(ftemp-32))+273;
  }
}
