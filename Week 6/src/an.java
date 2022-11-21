public class an
{
  public static void main(String[] args)
  {
    System.out.println(an(4));
  }
  public static int an(int n){
    if (n==1) return 2;
    else return an(n-1)*3;
  }
}
