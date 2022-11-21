import java.util.Scanner;

public class GradeListTest
{
  public static void main(String[] args)
  {
    Scanner k=new Scanner(System.in);
    GradeList gl=new GradeList(5);
    System.out.println("Tell me the name and the grade:");
    for (int i = 0; i < gl.getNumberOfGrades(); i++)
    {
      String name=k.nextLine();
      int grade=k.nextInt();
      while (!(grade==-3||grade==0||grade==2||grade==4||grade==7||grade==10||grade==12)){
        System.out.println("Error");
        grade=k.nextInt();
      }
      gl.setGrade(new Grade(name,grade),i);
      k.nextLine();
    }
    System.out.println(gl);
  }
}
