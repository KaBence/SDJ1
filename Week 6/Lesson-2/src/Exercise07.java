public class Exercise07
{
  public static void main(String[] args)
  {
    int[] hits={3,5,1,3,3,2,4,2,3};
    int sum=0;
    int holeInOne=0;
    for (int i = 0; i < hits.length; i++)
    {
      sum+=hits[i];
      if (hits[i]==1) holeInOne++;
    }
    System.out.println("Total number of hits: "+sum);
    System.out.println("Average hits: "+sum/hits.length);
    System.out.println("Hole in ones: "+holeInOne);
  }
}
