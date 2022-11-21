public class FactorialTest
{
  public static void main(String[] args)
  {
    Factorial f=new Factorial();
    f.fac(22);
    System.out.println("How many times will the function fac be called to calculate 22! ? "+f.getCounter());
  }

}
