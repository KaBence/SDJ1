public class TestScoresTest
{
  public static void main(String[] args)
  {
    int[] a={1,2,-5,105};
    try
    {
      TestScores t=new TestScores(a);
    }
    catch (InvalidTestScore e){
      System.out.println(e);
    }

  }
}
