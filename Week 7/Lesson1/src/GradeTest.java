import java.util.ArrayList;
import java.util.Scanner;

public class GradeTest
{
  public static void main(String[] args)
  {
    Scanner k=new Scanner(System.in);
    GradeList g=new GradeList();
    for (int i = 0; i < 3; i++)
    {
      System.out.print("Give me a course name: ");
      String temp=k.nextLine();
      System.out.print("Give me the grade: ");
      int grade=-1;
      grade=k.nextInt();
      while (!(grade==-3||grade==0||grade==2||grade==4||grade==7||grade==10||grade==12)){
        System.out.println("Error");
        System.out.print("Give me the grade: ");
        grade=k.nextInt();
      }
      k.nextLine();
      g.addGrade(new Grade(temp,grade));
    }
    System.out.println("Number of grades: "+ g.getNumberOfGrades());
    System.out.println("Average: "+g.getAverage());

    Grade[] array=g.getAllGradesAsArray();
    System.out.println("Array: ");
    for (int i = 0; i < array.length; i++)
    {
      System.out.println(array[i].getCourseName()+" "+array[i].getGrade());
    }
    System.out.println();
    System.out.println("List: ");
    ArrayList<Grade> list=new ArrayList<Grade>();
    list=g.getAllGrades();
    System.out.println(list);
  }
}
