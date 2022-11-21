import java.util.Random;

public class Person
{
  Random r=new Random();
  private String name;
  private int points;

  public Person(String name,int points){
    this.name=name;
    this.points=points;
  }
  public Person(String name){
    this.name=name;
    points=50;
  }

  public void game(){
    int random=r.nextInt(7);
    if (points-random<1) points+=random;
    else if (points-random==1)
    {
      System.out.println("You have won!");
      points-=random;
    }
    else points-=random;
    System.out.println("Your dice value was: "+random);
    System.out.println("Your points: "+points);
  }

  public int getPoints(){
    return points;
  }
}
