public class Brain
{
  private String[] brain;

  public Brain(){
    brain[0]="";
    brain[1]="";
    brain[2]="";
  }

  public int getIQ(){
    if (brain[0].length()>20){
      if (brain[2].length()>10 && brain[1].length()>10) return 130;
    }
    if (brain[2].length()>20){
      if (brain[0].length()>10 && brain[1].length()>10) return 130;
    }
    if (brain[1].length()>20){
      if (brain[0].length()>10 && brain[2].length()>10) return 130;
    }

    if (brain[0].length()>10 && brain[2].length()>10 && brain[1].length()>10) return 100;

    if (brain[0].length()<10){
      if (brain[2].length()<10 && brain[1].length()<10) return 70;
    }
    if (brain[2].length()<10){
      if (brain[0].length()<10 && brain[1].length()<10) return 70;
    }
    if (brain[1].length()<10){
      if (brain[0].length()<10 && brain[2].length()<10) return 70;
    }
    return 0;
  }

  public boolean isBrainDamaged(){
    return brain[0]==null || brain[1]==null || brain[2]==null;
  }

  public void remember(String info){
    brain[2]=brain[1];
    brain[1]=brain[0];
    brain[0]=info;
  }

  public void refreshMemory(String info){
    if (brain[1].equals(info)){
      brain[1]=brain[0];
      brain[0]=info;
    }

    if (brain[2].equals(info)){
      brain[2]=brain[1];
      brain[1]=brain[0];
      brain[0]=info;
    }
  }

  public boolean recall(String info){
    return brain[1].equals(info) || brain[2].equals(info) || brain[0].equals(info);
  }

  public String recall(){
    return brain[0];
  }

  public String toString(){
    return "activeMemoryItem: "+brain[0]+"\npassiveMemoryItemOne:"+brain[1]+"\npassiveMemoryItemTwo:"+brain[2];
  }

  public boolean equals(Object obj){
    if (obj==null || getClass()!=obj.getClass()) return false;
    Brain temp=(Brain)obj;
    return brain[0].equals(temp.brain[0])&&brain[1].equals(temp.brain[1])&&brain[2].equals(temp.brain[2]);
  }

}
