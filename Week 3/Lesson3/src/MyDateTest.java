public class MyDateTest
{
  public static void main(String[] args){
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
  }
}
