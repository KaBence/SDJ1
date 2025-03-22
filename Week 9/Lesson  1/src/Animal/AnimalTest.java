package Animal;

public class AnimalTest
{
  public static void main(String[] args)
  {
    Animal[] a=new Animal[4];
    a[0]=new Frog(4,"Green");
    a[1]=new Dog(5,"Golden Retriever");
    a[2]=new Cat(0,true);
    a[3]=new Bee(1,true);
    for (Animal item : a){
      System.out.println(item.speak());
    }

  }
}
