import java.util.Scanner;

public class PayrollTest
{
  public static void main(String[] args){
    Payroll p=new Payroll();
    Payroll p2=new Payroll("bence",142,10);
    Scanner k=new Scanner(System.in);
    System.out.println("What is your name?");
    p.setEmployeeName(k.nextLine());
    System.out.println("What is your hourly pay rate?");
    p.setHourlyPayRate(k.nextDouble());
    System.out.println("How many hours did you work?");
    p.setWorkedHours(k.nextInt());
    System.out.println(p.getEmployeeName()+"'s gross pay is: "+p.grossPay());

    System.out.println(p2);
  }
}
