public class Grade
{
  private String courseName;
  private int grade;

  public Grade(String cn,int g){
    courseName=cn;
    grade=g;
  }

  public String getCourseName()
  {
    return courseName;
  }

  public int getGrade()
  {
    return grade;
  }

  public void setGrade(int grade)
  {
    this.grade = grade;
  }

  public void setCourseName(String courseName)
  {
    this.courseName = courseName;
  }

  public String toString(){
    return courseName+" "+grade;
  }
}
