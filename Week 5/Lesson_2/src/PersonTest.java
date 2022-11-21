public class PersonTest
{
  public static void main(String[] args){
    Person p1=new Person("Bence",new MyDate(6,3,2003));
    p1.setAddress("Kamtjatka");
    System.out.println(p1);
    System.out.println(p1.getAge());
  }
}
