import java.util.Scanner;

public class LandTractTest
{
  public static void main(String[] args){
    Scanner k=new Scanner(System.in);
    System.out.print("First land width: ");
    int w=k.nextInt();
    System.out.print("First land length: ");
    int l=k.nextInt();
    LandTract l1=new LandTract(w,l);
    System.out.print("Second land width: ");
    w=k.nextInt();
    System.out.print("Second land length: ");
    l=k.nextInt();
    LandTract l2=new LandTract(w,l);
    System.out.println("First land area: "+l1.area());
    System.out.println("Second land area: "+l2.area());

    if (l1.equals(l2))
      System.out.println("The two lands are the same");
    else
      System.out.println("The two lands are not the same");
  }
}
