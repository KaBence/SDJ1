import java.util.Scanner;

public class GradeList
{
  private int[] grades;
  public GradeList(int numberOfGrades){
    grades=new int[numberOfGrades];
    for (int i = 0; i < grades.length; i++)
    {
      grades[i]=-1;
    }
  }

  public int getNumberOfGrades(){
    return grades.length;
  }

  public int getGrade(int index){
    return grades[index];
  }

  public void setGrade(int grade,int index){
    grades[index]=grade;
  }

  public double getAverage(){
    double sum=0;
    int counter=0;
    for(int item : grades){
      if (item!=-1){
        sum+=item;
        counter++;
      }
    }
    return sum/counter;
  }

  public String toString(){
    System.out.print("Grades: ");
    String temp="";
    for (int item : grades){
      temp+= item+" ";
    }
    return temp;
  }

  public boolean equals(Object obj){
    if (obj==null || getClass()!=obj.getClass())return false;
    GradeList temp=(GradeList)obj;
    if (grades.length!=temp.grades.length)return false;
    else {
      for (int i = 0; i < grades.length; i++)
      {
        if (grades[i]!=temp.grades[i]){
          return false;
        }
      }
      return true;
    }
  }
}
