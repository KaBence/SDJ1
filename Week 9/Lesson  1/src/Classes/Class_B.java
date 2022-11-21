package Classes;

public abstract class Class_B
{
  private  int m;
  protected int n;

  public int getM()
  {
    return m;
  }
  public int getN()
  {
    return n;
  }
  public void setM(int m)
  {
    this.m = m;
  }
  public void setN(int n)
  {
    this.n = n;
  }

  public abstract double calc();
}
