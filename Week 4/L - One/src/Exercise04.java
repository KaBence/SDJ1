public class Exercise04
{
  public static void main(String[] args){
    int fibonacci;
    int first=1;
    int second=0;
    for (int i=0;i<=20;i++){
      fibonacci=first+second;
      System.out.println("Fibonacci("+i+") = "+fibonacci);
      first=second;
      second=fibonacci;
    }
  }
}
