import java.util.ArrayList;

public class Hotel
{
  private String name;
  private ArrayList<Room> rooms;

  public Hotel(String name,Room[] rooms){
    this.name=name;
    for (Room item : rooms){
      this.rooms.add(item);
    }
  }

  public String getName(){
    return name;
  }

  public int getNumberOfRooms(){
    return rooms.size();
  }

  public int getNumberOfAvailableRooms(){
    int counter=0;
    for (Room item : rooms){
      if (!(item.isOccupied()))counter++;
    }
    return counter;
  }
  public Room getFirstAvailableRoom(){
    Room temp=null;
    for (int i = 0; i < rooms.size(); i++)
    {
      if (!(rooms.get(i).isOccupied())){
        temp=rooms.get(i);
        break;
      }
    }
    return temp;
  }

  public Room getFirstAvailableRoom(double maxPrice){
    Room temp=null;
    for (int i = 0; i < rooms.size(); i++)
    {
      if (!(rooms.get(i).isOccupied()&&rooms.get(i).getPrice()<maxPrice)){
        temp=rooms.get(i);
        break;
      }
    }
    return temp;
  }

  public Room[] getAllAvailableRooms(String bedType){
    Room[] temp=new Room[getNumberOfAvailableRooms()];
    int counter=0;
    for (int i = 0; i < rooms.size(); i++)
    {
      if (!(rooms.get(i).isOccupied())){
        temp[counter]= rooms.get(i);
        counter++;
      }
    }
    return temp;
  }

  public boolean hasGuest(Guest guest){
    for (Room item : rooms){
      if (item.getGuest().equals(guest)){
        return true;
      }
    }
    return false;
  }
}
