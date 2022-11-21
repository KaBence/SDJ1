import java.util.Scanner;
import java.util.Formatter;

public class Exercise03
{
  public static void main(String[] args){
    Scanner k=new Scanner(System.in);
    System.out.println("how many iterations should the loop run?");
    int num=k.nextInt();
    double bracket=0;
    int szam=3;
    bracket=1-(double)1/szam;
    szam+=2;
    for (int i=1;i<num;i++){
      if (i%2==1) bracket+=(double)1/szam;
      else bracket-=(double)1/szam;
      szam+=2;
    }
    System.out.println("Value of PI: "+(4*bracket));
    /*double bracket=0;
    int szam=3;
    bracket=1-(double)1/szam;
    int counter=1;
    do
    {
      if (counter%2==1) bracket+=(double)1/szam;
      else bracket-=(double)1/szam;
      szam+=2;
      counter++;
    }
    while ()*/
  }
}
