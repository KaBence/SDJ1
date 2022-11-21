public class JobTest
{
  public static void main(String[] args){
    Person p1=new Person("Emett","1985-12-09");
    Job job1=new Job("Boss",5421,p1);
    Job job2=new Job("Candidate",0,new Person("Marty","2015-12-09"));
    Job job3=new Job("Dog",0);

    System.out.println(job1);
    System.out.println(job2);
    System.out.println(job3);

    job1.givePercentageRaise(0.2);
    job2.givePercentageRaise(0.6);
    job3.setEmployee(new Person("No one",null));
    System.out.println(job1);
    System.out.println(job2);
    System.out.println(job3);
  }
}
