package Animal;

public class Dog extends Pet
{
  private String breed;

  public Dog(int age,String breed){
    super(age);
    this.breed=breed;
  }

  public String getBreed()
  {
    return breed;
  }

  public void setBreed(String breed)
  {
    this.breed = breed;
  }

  public String speak(){
    return "Woof";
  }

  public String toString(){
    return breed;
  }
}
