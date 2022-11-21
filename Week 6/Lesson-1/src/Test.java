public class Test
{
  public static void main(String[] args)
  {
    Person p1=new Person("Bence",new MyDate(6,3,2003));
    System.out.println("Brain damaged: "+p1.isBrainDamaged());
    p1.rememberThis("Something very clever that is worthy enough to store");
    p1.rememberThis("Something extremely clever that is worthy enough to store");
    p1.rememberThis("Something extraordinary clever that is worthy enough to store");
    System.out.println("Active Memory: "+p1.whatAreYouThinkingAbout());
    System.out.println("do you remember: "+p1.doYouRemember("Something extremely clever that is worthy enough to store"));
    System.out.println("IQ: "+p1.getIQ());
  }
}
