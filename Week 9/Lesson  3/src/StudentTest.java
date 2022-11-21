public class StudentTest
{
  public static void main(String[] args)
  {
    Student s=null;
    try
    {
      s=new Student("Bob",5);
    }
    catch (IllegalGradeException e){
      System.out.println(e);
    }
    System.out.println(s);
  }
}
