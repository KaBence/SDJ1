package Toy;

public class ToyTest
{
  public static void main(String[] args)
  {
    Toy[] t=new Toy[3];
    t[0]=new Football(20,32);
    t[1]=new Handball(20,15);
    t[2]=new Lego(99,2000);
    for (Toy item:t){
      System.out.println(item.play());
    }
  }
}
