import java.util.ArrayList;

public class GradeList
{
  private ArrayList<Grade> lista;

  public GradeList(){
    lista=new ArrayList<Grade>();
  }

  public int getNumberOfGrades(){
    return lista.size();
  }

  public ArrayList<Grade> getAllGrades(){
    ArrayList<Grade> temp=new ArrayList<Grade>();
    for(Grade item : lista){
      temp.add(item);
    }
    return temp;
  }

  public Grade[] getAllGradesAsArray(){
    Grade[] temp=lista.toArray(new Grade[lista.size()]);
    return temp;
  }

  public void addGrade(Grade grade){
    lista.add(grade);
  }

  public double getAverage(){
    double sum=0;
    for (Grade item : lista){
      sum+=item.getGrade();
    }
    return sum/lista.size();
  }

  public String toString(){
    String temp="";
    for (Grade item : lista){
      temp+=item;
    }
    return temp;
  }

}
