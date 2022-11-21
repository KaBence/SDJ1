import java.util.Scanner;

public class Exercise04
{
  public static void main(String[] args){
    Scanner k=new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number=k.nextInt();
    int variable=0;
    do{
      variable=(number*10);
      number=variable;
      System.out.println(variable);
    }
    while (variable<100);
    System.out.println(variable);
    double total=0;
    for (int i=1;i<31;i++){
      for (int j=30;j>0;j--){
        total+=((double)i/j);
      }
    }
    System.out.println(total);
    int space=0;
    for (int i=0;i<10;i++)
    {
      System.out.print("#");
      for (int j = 0; j < space; j++)
      {
        System.out.print(" ");
      }
      System.out.print("#");
      space++;
      System.out.println();
    }
    System.out.print("Tell me a number: ");
    int totalnum=0;
    int range=k.nextInt();
    for (int i=1;i<range+1;i++){
      totalnum+=i;
    }
    System.out.println(totalnum);
  }
}
