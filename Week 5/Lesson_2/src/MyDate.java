import java.time.LocalDate;


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

  public MyDate(MyDate obj){
    day=obj.day;
    month=obj.month;
    year= obj.year;
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

  public boolean isLeapYear(){
    //if (year%4==0) return "true";
    //else return "False";
    if (year%400==0){
      return true;
    }
    else if( year%100==0){
      return false;
    }
    else if(year%4==0){
      return true;
    }
    return false;
  }

  public int daysInMonth(){
    if(month==1||month==3||month==5||month==7||month==8||month==10||month==12){
      return 31;
    }
    else if(month==2){
      if (isLeapYear()){
        return 29;
      }
      else return 28;
    }
    else return 30;
  }

  public String getAstroSign(){
    if ((month==3&&day>=21)||(month==4&&day<=19)){
      return "Aries";
    }
    if ((month==4&&day>=20)||(month==5&&day<=20)){
      return "Taurus";
    }
    if ((month==5&&day>=21)||(month==6&&day<=20)){
      return "Gemini";
    }
    if ((month==6&&day>=21)||(month==7&&day<=22)){
      return "Cancer";
    }
    if ((month==7&&day>=23)||(month==8&&day<=22)){
      return "Leo";
    }
    if ((month==8&&day>=23)||(month==9&&day<=22)){
      return "Virgo";
    }
    if ((month==9&&day>=23)||(month==10&&day<=22)){
      return "Libra";
    }
    if ((month==10&&day>=23)||(month==11&&day<=21)){
      return "Scorpio";
    }
    if ((month==11&&day>=22)||(month==12&&day<=21)){
      return "Sagittarius";
    }
    if ((month==12&&day>=22)||(month==1&&day<=19)){
      return "Capricorn";
    }
    if ((month==1&&day>=20)||(month==2&&day<=18)){
      return "Aquarius";
    }
    if ((month==2&&day>=19)||(month==3&&day<=20)){
      return "Pisces";
    }
    else return "Wrong";
  }

  public String dayOfWeek(){
    int m=0;
    if (month==1){
      m=13;
    }
    else if(month==2)
    {
      m = 14;
    }
    else m=month;
    int k=year%100;
    int j=year/100;
    int h=7;
    if (month==1||month==2){
      h=(day+((13*(m+1))/5)+(k-1)+((k-1)/4)+(j/4)+5*j)%7;
    }
    else h=(day+((13*(m+1))/5)+k+(k/4)+(j/4)+5*j)%7;

    if (h==0){
      return "Saturday";
    }
    if (h==1){
      return "Sunday";
    }
    if (h==2){
      return "Monday";
    }
    if (h==3){
      return "Tuesday";
    }
    if (h==4){
      return "Wednesday";
    }
    if (h==5){
      return "Thursday";
    }
    if (h==6){
      return "Friday";
    }
    else return "Wrong";
  }

  public String getMonthName(){
    switch (month){
      case 1:
        return  "January";
      case 2:
        return  "February";
      case 3:
        return  "March";
      case 4:
        return  "April";
      case 5:
        return  "May";
      case 6:
        return  "June";
      case 7:
        return  "July";
      case 8:
        return  "August";
      case 9:
        return  "September";
      case 10:
        return  "October";
      case 11:
        return  "November";
      case 12:
        return  "December";
      default:
        return "Wrong";
    }
  }
  public void nextDay(){
    if (day==daysInMonth()){
      day=1;
      if (month==12){
        month=1;
        year++;
      }
      else month++;
    }
    else day++;
  }

  public boolean equals(Object obj){
    if (obj==null || getClass()!=obj.getClass()) return false;
    MyDate temp=(MyDate)obj;
    return year==temp.year&& month==temp.month&&day==temp.day;
  }

  public MyDate copy(){
    return new MyDate(day,month,year);
  }

  public void nextDay(int days){
    if (day+days>daysInMonth()){
      day=(day+days-daysInMonth());
      if (month==12){
        month=1;
        year++;
      }
      else month++;
    }
    else day++;
  }

  public static MyDate today(){
    LocalDate currentDate=LocalDate.now();
    return new MyDate(currentDate.getDayOfMonth(),currentDate.getMonthValue(),currentDate.getYear());
  }

  public boolean isBefore(MyDate date2){
    if ((year<date2.year) || (day<date2.day && (month<date2.month || year<date2.year)) || (day>date2.day && (month<date2.month || year<date2.year)) || (month<date2.month && year==date2.year || month>date2.month && year<date2.year) || (day < date2.day)){
      return true;
    }
    else return false;
  }
}
