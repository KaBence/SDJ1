public class Apartment
{
  private String address;
  private double rent;
  private Tenant tenant;

  public Apartment(String address,double rent){
    this.address=address;
    this.rent=rent;
    tenant=null;
  }

  public double getRent()
  {
    return rent;
  }

  public String getAddress()
  {
    return address;
  }

  public void setRent(double rent)
  {
    this.rent = rent;
  }

  public void rentTo(String name,String phone){
    if (!(isOccupied())){
      tenant=new Tenant(name,phone);
    }
  }

  public void evict(){
    tenant=null;
  }

  public boolean isOccupied(){
    return tenant!=null;
  }

  public Tenant getTenant(){
    if (isOccupied()) return tenant.copy();
    else return null;
  }

  public double getRentDue(){
    if (isOccupied())
      return tenant.getRentDue();
    else return -1;
  }

  public void chargeRent(){
    if (isOccupied()) tenant.setRentDue(rent);
  }

  public void collectRent(double amount){
    if (isOccupied()) tenant.setRentDue(tenant.getRentDue()-amount);
  }

  public String toString(){
    if (tenant==null){
      return address+" "+rent+" No tenant";
    }
    else return address+" "+rent+" "+tenant;
  }
}
