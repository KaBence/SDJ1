public class Car
{
  private int yearModel,speed;
  private String make;
  public Car(int yM,String m){
    yearModel=yM;
    make=m;
    speed=0;
  }
  public int getYearModel(){
    return yearModel;
  }

  public int getSpeed(){
    return speed;
  }

  public String getMake(){
    return make;
  }
  public void Accelerate(){
    speed+=5;
  }
  public void Brake(){
    speed-=5;
  }
}
