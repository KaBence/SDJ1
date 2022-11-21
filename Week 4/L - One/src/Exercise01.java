import java.util.Scanner;

public class Exercise01
{
  public static void main(String[] args){
    Scanner k=new Scanner(System.in);

    System.out.println("Tell me a number");
    int n= k.nextInt();
    for (int i=1;i<=n;i++){
        System.out.print(i+" ");
    }
    System.out.println();
    for (int i=1;i<=n;i++){
      System.out.print(i*2+" ");
    }
    System.out.println();
    for (int i=1;i<=n;i++){
      System.out.println(Math.pow(i,2));
    }


  }
}
