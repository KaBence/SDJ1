public class Exercise02
{
  public static void main(String[] args){
    double total=0;
    double grain=1;
    for (int i=0;i<64;i++){
      grain*=2;
      total+=grain;
    }
    System.out.println(total);
  }
}
