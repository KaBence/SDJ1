public class Exercise03
{
  public static void main(String[] args)
  {
    int[] sourceArray= new int[]{1,3,7,5,9};
    int[] destinationArray=new int[sourceArray.length*2];
    for (int i=0;i<sourceArray.length;i++){
      destinationArray[i]=sourceArray[i];
    }
    System.out.print("First array: ");
    for (int i=0;i<sourceArray.length;i++){
      System.out.print(sourceArray[i]);
    }
    System.out.println();
    System.out.print("Second array: ");
    for (int i=0;i<destinationArray.length;i++){
      System.out.print(destinationArray[i]);
    }
    System.out.println();
  }
}
