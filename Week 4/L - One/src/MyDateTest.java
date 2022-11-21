import java.util.Scanner;

public class MyDateTest
{
  public static void main(String[] args){
    Scanner k=new Scanner(System.in);
    MyDate d0=new MyDate();
    d0.setDay(3);
    d0.setMonth(1);
    d0.setYear(2022);
    MyDate d1=new MyDate();
    d1.setDay(9);
    d1.setMonth(10);
    d1.setYear(1950);
    MyDate d2=new MyDate(15,11,1961);
    System.out.println("First date is: "+d0.displayDate());
    System.out.println("Second date is: "+d1.displayDate());
    System.out.println(d2);

    System.out.println(d0.isLeapYear());
    System.out.println(d0.getAstroSign());
    System.out.println(d0.dayOfWeek());
    System.out.println(d0.getMonthName());
    int counter=0;
    for (int i=1582;i<=2022;i++){
      d0.setYear(i);
      if (d0.isLeapYear()){
        counter++;
      }
    }
    System.out.println("Since 1582 There were "+counter+" leap years");
    System.out.println("Tell me the start year");
    d0.setYear(k.nextInt());
    System.out.println("Tell me the end year");
    d1.setYear(k.nextInt());
    counter=0;
    for (int i= d0.getYear();i<= d1.getYear();i++){
      if (d0.isLeapYear()){
        counter++;
      }
      d0.setYear(i+1);
    }
    System.out.println("Since "+d0.getYear()+" There were "+counter+" leap year until "+ d1.getYear());
    MyDate birthday=new MyDate(06,03,2003);
    MyDate current=new MyDate(19,9,2022);
    counter=0;
    do
    {
      birthday.nextDay();
      counter++;
    }
    while (!(birthday.displayDate().equals(current.displayDate())));
    System.out.println("Since 06/03/2003 "+counter+" days have passed until "+ current.displayDate());
  }
}
