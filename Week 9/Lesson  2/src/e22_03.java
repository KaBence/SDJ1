import java.util.Scanner;

public class e22_03
{
  public static void main(String[] args)
  {
    Scanner k=new Scanner(System.in);
    int sum=0;
    int count=0;
    do
    {
      sum+=k.nextInt();
      count++;
    }
    while (sum<20&&count<10);
    if (sum<20)
      System.out.println(count);
    else
      System.out.println(sum);

    //The other one is using while not do while
  }
}
