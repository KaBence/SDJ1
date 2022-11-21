public class testPerson
{
  public static void main(String[] args){
    Person p1=new Person();
    Person p2=new Person();
    Person p3=new Person("Bence","2000.01.05");

    p1.setBirthday("2000.04.01");
    p1.setName("Kala Pál");

    p2.setBirthday("1995.08.02");
    p2.setName("Vicc Elek");

    System.out.println("First person name is "+p1.getName()+" and his birthday is "+p1.getBirthday());
    System.out.println("Second person name is "+p2.getName()+" and his birthday is "+p2.getBirthday());

    System.out.println(p3);
  }
}
