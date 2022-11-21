package Classes;

public class Class_D extends Class_B
{
  private double q;
  protected double r;

  public double getQ()
  {
    return q;
  }
  public double getR()
  {
    return r;
  }
  public void setQ(double q)
  {
    this.q = q;
  }
  public void setR(double r)
  {
    this.r = r;
  }

  public double calc(){
    return q*r;
  }
}
