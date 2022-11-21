import java.util.Scanner;

public class Exercise06
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
    int[] sumArray=new int[4];
    for (int i = 0; i < array1.length; i++)
    {
      sumArray[i]=array1[i]+array2[i];
    }
    System.out.print("First array: ");
    for(int item : array1){
      System.out.print(item+" ");
    }
    System.out.println();
    System.out.print("Second array: ");
    for(int item : array2){
      System.out.print(item+" ");
    }
    System.out.println();
    System.out.print("Sum array: ");
    for(int item : sumArray){
      System.out.print(item+" ");
    }

  }
}
