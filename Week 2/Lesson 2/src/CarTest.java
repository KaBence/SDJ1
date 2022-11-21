

public class CarTest
{
  public static void main(String[] args){
    Car c=new Car(2015,"Skoda");
    int i;
    for(i=0;i<5;i++){
      c.Accelerate();
      System.out.println(c.getSpeed());
    }
    for(i=0;i<5;i++){
      c.Brake();
      System.out.println(c.getSpeed());
    }
  }
}
