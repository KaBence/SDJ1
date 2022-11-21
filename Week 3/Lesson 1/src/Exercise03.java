
import java.util.Scanner;
public class Exercise03
{
  public static void main(String[] args){
    Scanner k=new Scanner(System.in);
    System.out.print("Tell me your grade: ");
    int grade=k.nextInt();
    if (grade==12) System.out.println("A");
    if (grade==10) System.out.println("B");
    if (grade==7) System.out.println("C");
    if (grade==4) System.out.println("D");
    if (grade==2) System.out.println("E");
    if (grade==0) System.out.println("Fx");
    if (grade==-3) System.out.println("F");
  }
}
