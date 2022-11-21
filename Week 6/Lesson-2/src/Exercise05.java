import java.util.Scanner;

public class Exercise05
{
  public static void main(String[] args)
  {
    Scanner k=new Scanner(System.in);
    int[] array1=new int[4];
    int[] array2=new int[4];
    System.out.println("Tell me 4 numbers: ");
    for (int i=0;i< array1.length;i++){
      array1[i]=k.nextInt();
    }
    System.out.println("Tell me 4 more numbers: ");
    for (int i=0;i< array2.length;i++){
      array2[i]=k.nextInt();
    }
    boolean iden=true;
    for (int i=0;i< array1.length;i++){
      iden=array1[i]==array2[i];
      if (!iden)break;
      }
    System.out.println("Two arrays are identical: "+iden);
  }
}
