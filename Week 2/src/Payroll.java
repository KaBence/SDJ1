public class Payroll
{
  private String employeeName;
  private int WorkedHours;
  private double hourlyPayRate;

  public Payroll(String eN,int WH,double hPR){
    employeeName=eN;
    WorkedHours=WH;
    hourlyPayRate=hPR;
  }

  public Payroll(){
    employeeName="name";
    WorkedHours=0;
    hourlyPayRate=0;
  }

  public String toString(){
    return "name: "+employeeName+" WorkedHours: "+WorkedHours+" hourlyPayRate: "+ hourlyPayRate;
  }

  public String getEmployeeName(){
    return employeeName;
  }

  public double getHourlyPayRate(){
    return hourlyPayRate;
  }

  public int getWorkedHours(){
    return WorkedHours;
  }

  public void setEmployeeName(String N){
    employeeName=N;
  }

  public void setHourlyPayRate(double P){
    hourlyPayRate=P;
  }

  public void setWorkedHours(int W){
    WorkedHours=W;
  }

  public double grossPay(){
    return hourlyPayRate*WorkedHours;
  }
}
