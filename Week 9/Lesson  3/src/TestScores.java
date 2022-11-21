public class TestScores
{
  private int[] score;

  public TestScores(int[] t){
    score=new int[5];
    int counter=0;
    for (int item: t){
      if (item>0&&item<100)
      {
        score[counter] = item;
        counter++;
      }
      else throw new InvalidTestScore();
    }
  }

  public double avg(){
    int sum=0;
    for (int item: score){
      sum+=item;
    }
    return sum/score.length;
  }
}
