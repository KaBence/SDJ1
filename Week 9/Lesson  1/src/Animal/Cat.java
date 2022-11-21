package Animal;

public class Cat extends Pet
{
  private boolean isAHouseCat;

  public Cat(int age,boolean isAHouseCat){
    super(age);
    this.isAHouseCat=isAHouseCat;
  }

  public boolean isAHouseCat()
  {
    return isAHouseCat;
  }

  public void setAHouseCat(boolean AHouseCat)
  {
    isAHouseCat = AHouseCat;
  }

  public String speak(){
    return "Meow";
  }

  public String toString(){
    if (isAHouseCat)return "It is a house cat";
    else return "No it is not a house cat";
  }
}
