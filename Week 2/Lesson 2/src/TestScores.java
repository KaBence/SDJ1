import java.util.Scanner;

public class TestScores
{
  Scanner k=new Scanner(System.in);
  private double testScore1,testScore2,testScore3;

  public TestScores(){
    System.out.println("Tell me the first score");
    testScore1=k.nextDouble();
    k.nextLine();
    System.out.println("Tell me the second score");
    testScore2=k.nextDouble();
    k.nextLine();
    System.out.println("Tell me the third score");
    testScore3=k.nextDouble();
    k.nextLine();
  }

  public double getTestScore1(){
    return testScore1;
  }

  public double getTestScore2(){
    return testScore2;
  }

  public double getTestScore3(){
    return testScore3;
  }

  public void setTestScore1(int testScore1){
    this.testScore1=testScore1;
  }

  public void setTestScore2(int testScore2){
    this.testScore2=testScore2;
  }

  public void setTestScore3(int testScore3){
    this.testScore3=testScore3;
  }

  public double Average(){
    return (testScore2+testScore1+testScore3)/3;
  }
}
