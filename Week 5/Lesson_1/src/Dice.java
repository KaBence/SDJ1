public class Dice
{
  public static void main(String[] args){
    Person p1=new Person("Bob");
    Person p2=new Person("Martha");
    int counter=1;
    while (p1.getPoints()>1&&p2.getPoints()>1){
      if (counter%2==1) {
        System.out.println("P1");
        p1.game();
      }
      else {
        System.out.println("P2");
        p2.game();
      }
      counter++;
    }
}
}
