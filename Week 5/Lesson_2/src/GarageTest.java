public class GarageTest
{
  public static void main(String[] args){
    Garage g1=new Garage();
    g1.park(new Car("Ferrari","something","red",2020),1);
    g1.park(new Car("Skoda","SuperB","White",2015),2);
    Garage g2=new Garage();
    g2.park(new Car("Ferrari","something","red",2020),1);
    g2.park(new Car("Skoda","SuperB","White",2015),2);
    System.out.println(g1.equals(g2));
    System.out.println(g1);
    System.out.println(g2);
    System.out.println(g1.leaveGarage(1));
  }
}
