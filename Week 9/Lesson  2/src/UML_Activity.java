import java.util.Scanner;

public class UML_Activity
{
  public static void main(String[] args)
  {
    Scanner k=new Scanner(System.in);
    int positivesum=0;
    int x=0;
    do
    {
      x=k.nextInt();
      if (x>0) positivesum+=x;
      else positivesum-=x;
    }
    while (x!=0);
    System.out.println(positivesum);
  }
}
