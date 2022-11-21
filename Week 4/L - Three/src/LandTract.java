public class LandTract
{
  private int w, l;

  public int area()
  {
    return w * l;
  }

  public LandTract(int w,int l){
    this.w=w;
    this.l=l;
  }

  public boolean equals(LandTract obj)
  {
    return w == obj.w && l == obj.l;
  }

  public String toString(){
    return "Width: "+w+" Length: "+l;
  }
}