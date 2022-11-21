public class Guest
{
  private String name;

  private Guest(String name){
    this.name=name;
  }

  public String getName(){
    return name;
  }

  public boolean equals(Object obj){
    if (obj==null || getClass()!=obj.getClass()) return false;
    Guest temp=(Guest)obj;
    return name==temp.name;
  }
}
