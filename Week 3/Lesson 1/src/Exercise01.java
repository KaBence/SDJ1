import java.util.Scanner;

public class Exercise01
{
  public static void main(String[] args){
    Scanner k=new Scanner(System.in);
    System.out.println("Tell me your age");
    int age=k.nextInt();
    if (age<0){
      System.out.println("Error in age value");
    }
    else if(age>=0 && age <= 12){
      System.out.println("Child");
    }
    else if (age>=13 && age <=19){
      System.out.println("Teenager");
    }
    else if (age>=20 && age <=65){
      System.out.println("Adult");
    }
    else if (age>65){
      System.out.println("Senior citizen");
    }
  }
}
