public class HotelRoomTest
{
  public static void main(String[] args){
    HotelRoom hr1=new HotelRoom(201,152.5);
    HotelRoom hr2=new HotelRoom(202,52.5);
    HotelRoom hr3=new HotelRoom(203,405);

    hr2.setRent(160.4);
    hr1.checkIn(new Guest("Bob"));
    hr2.checkIn(new Guest("Jimmy"));
    System.out.println(hr1);
    System.out.println(hr2);
    System.out.println(hr3);
  }
}
