package Animal;

public abstract class Animal
{
  private int age;

  public Animal(int age){
    this.age=age;
  }

  public abstract String speak();
}
