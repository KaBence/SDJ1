import java.util.Scanner;

public class GradeList
{
  Scanner k=new Scanner(System.in);
  private Grade[] grades;
  public GradeList(int numberOfGrades){
    grades=new Grade[numberOfGrades];
  }

  public int getNumberOfGrades(){
    return grades.length;
  }

  public Grade getGrade(int index){
    return grades[index];
  }

  public void setGrade(Grade grade,int index){
    grades[index] = grade;
  }

  public double getAverage(){
    double sum=0;
    int counter=0;
    for(Grade item : grades){
      if (item!=null){
        sum+=item.getGrade();
        counter++;
      }
    }
    return sum/counter;
  }

  public String toString(){
    String temp="";
    for (Grade item : grades){
      temp+= item+" ";
    }
    return "Grades: "+temp;
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
