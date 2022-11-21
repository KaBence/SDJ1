public class MyDate
{
  private int day,month,year;

  public MyDate(int d,int m,int y){
    day=d;
    month=m;
    year=y;
  }

  public MyDate(){
    day=1;
    month=1;
    year=1950;
  }

  public String toString(){
    return day+"/"+month+"/"+year;
  }

  public int getDay(){
    return day;
  }

  public int getMonth(){
    return month;
  }

  public int getYear(){
    return year;
  }

  public void setDay(int d){
    day=d;
  }

  public void setMonth(int m){
    month=m;
  }

  public void setYear(int y){
    year=y;
  }

  public String displayDate(){
    return day+"/"+month+"/"+year;
  }

  public String isLeapYear(){
    //if (year%4==0) return "true";
    //else return "False";
    if (year%400==0){
      return "True";
    }
    else if( year%100==0){
      return "false";
    }
    else if(year%4==0){
      return "True";
    }
    return "false";
  }
}
