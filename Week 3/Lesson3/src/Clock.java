public class Clock
{
  private int hour,minute,second;
  private boolean timeFormat24;

  public Clock(int h,int m,int s,boolean format){
    hour=h;
    minute=m;
    second=s;
    timeFormat24=format;
  }

  public Clock(int totalTimeInSeconds){
    hour=totalTimeInSeconds/3600;
    int a=totalTimeInSeconds%3600;
    minute=a/60;
    second=a%60;
  }
  public void set(int h,int m,int s){
    hour=h;
    minute=m;
    second=s;
  }

  public int getHour(){
    return hour;
  }

  public int getMinute(){
    return minute;
  }

  public int getSecond(){
    return second;
  }

  public void tic(){
    if (second+1==60){
      if (minute+1==60){
        hour+=1;
        minute=0;
      }
      else minute+=1;
      second=0;
    }
    else second+=1;
  }

  public int convertToSeconds(){
    return hour*360+minute*60+second;
  }

  public boolean isBefore(Clock time){
    if (convertToSeconds() > time.convertToSeconds()){
      return true;
    }
    else return false;
  }

  public int timeInSeconds(Clock time){
    if (isBefore(time)){
      return convertToSeconds()-time.convertToSeconds();
    }
    else return convertToSeconds()-time.convertToSeconds()+86400;
    //return Math.abs(convertToSeconds()-time.convertToSeconds());
  }

  public Clock timeTo(Clock time){
    return new Clock(timeInSeconds(time));
  }

  public boolean isTimeFormat24(){
    if (timeFormat24){
      return true;
    }
    else return false;
  }

  public void setTimeFormat(int hourFormat){
    if (hourFormat==12){
        timeFormat24=false;
    }
    if (hourFormat==24){
        timeFormat24=true;
    }
  }

  public String toString(){
    if (timeFormat24)
    return hour+":"+minute+":"+second;
    else {
      if (hour/12==1){
        return (hour-=12)+":"+minute+":"+second+" PM";
      }
      else return hour+":"+minute+":"+second+" AM";
    }
  }
}
