package Animal;

public class Bee extends Animal
{
  private boolean isAHoneyBee;

  public Bee(int age, boolean isAHoneyBee){
    super(age);
    this.isAHoneyBee=isAHoneyBee;
  }

  public boolean isAHoneyBee()
  {
    return isAHoneyBee;
  }

  public void setAHoneyBee(boolean AHoneyBee)
  {
    isAHoneyBee = AHoneyBee;
  }

  public String speak(){
    return "Bzzzzz";
  }

  public String toString(){
    if (isAHoneyBee)return "It is a honeybee";
    else return "No it is not a honeybee";
  }
}
