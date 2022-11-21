public class Factorial
{
  private int counter;

  public Factorial(){
    counter=0;
  }

  public double fac(int n){
    counter++;
    if (n==1) return 2;
    else return fac(n-1)*n;
  }

  public int getCounter()
  {
    return counter;
  }
}
