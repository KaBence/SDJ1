public class ApartmentTest
{
  public static void main(String[] args)
  {
    Apartment a=new Apartment("Apartment",1402);
    a.rentTo("Bob","1428756");
    System.out.println(a);
    a.evict();
    System.out.println(a);
    a.rentTo("Bob","15156156");
    a.chargeRent();
    System.out.println(a);
    a.collectRent(1000);
    System.out.println(a);
  }
}
