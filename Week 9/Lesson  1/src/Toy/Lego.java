package Toy;

public class Lego extends Toy
{
  private int numberOfBricks;

  public Lego(int suitableage,int numberOfBricks){
    super(suitableage);
    this.numberOfBricks=numberOfBricks;
  }

  public String play(){
    return "Build";
  }
}
