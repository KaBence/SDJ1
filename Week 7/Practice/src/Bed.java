public class Bed
{
  private String type;

  public Bed(String Type){
    if (type.equals("Single")||type.equals("Double")||type.equals("King Size")){
      this.type=Type;
    }
  }

  public boolean isSingle(){
    return type.equals("Single");
  }
  public boolean isDouble(){
    return type.equals("Double");
  }
  public boolean isKingSize(){
    return type.equals("King Size");
  }
}
