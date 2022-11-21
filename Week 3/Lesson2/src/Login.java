import java.util.Scanner;

public class Login
{
  public static void main(String[] args){
    Scanner k=new Scanner(System.in);
    System.out.println("Enter a username");
    String username=k.nextLine();
    System.out.println("Enter your password");
    String pass=k.nextLine();
    System.out.println("Confirmation password");
    String passC=k.nextLine();
    if (pass.equals(passC)){
      System.out.println("Passwords are identical");
    }
    else System.out.println("Passwords are not identical");
  }
}
