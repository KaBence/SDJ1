public class Room
{
  private int number;
  private Guest guest;
  private Bed bed;

  public Room (int number,String bedType){
    guest=null;
    this.number=number;
    this.bed=new Bed(bedType);
  }

  public int getNumber(){
    return number;
  }

  public int getFloor(){
    return number/100;
  }

  public double getPrice(){
    if (bed.isDouble())return 72.40;
    else if (bed.isKingSize()) return 89.00;
    else return 59.50;
  }

  public boolean isOccupied(){
    return guest!=null;
  }

  public void registerGuest(Guest guest){
    this.guest=guest;
  }

  public void vacate(){
    guest=null;
  }

  public String getBedType(){
    if (bed.isDouble())return "Double";
    else if (bed.isKingSize()) return "King Size";
    else return "Single";
  }

  public Guest getGuest(){
    return guest;
  }
}
