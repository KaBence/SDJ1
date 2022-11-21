public class Brain
{
  private String activeMemoryItem,passiveMemoryItemOne,passiveMemoryItemTwo;

  public Brain(){
    activeMemoryItem="";
    passiveMemoryItemOne="";
    passiveMemoryItemTwo="";
  }

  public int getIQ(){
    if (activeMemoryItem.length()>20){
      if (passiveMemoryItemTwo.length()>10 && passiveMemoryItemTwo.length()>10) return 130;
    }
    if (passiveMemoryItemTwo.length()>20){
      if (activeMemoryItem.length()>10 && passiveMemoryItemOne.length()>10) return 130;
    }
    if (passiveMemoryItemOne.length()>20){
      if (activeMemoryItem.length()>10 && passiveMemoryItemTwo.length()>10) return 130;
    }

    if (activeMemoryItem.length()>10 && passiveMemoryItemTwo.length()>10 && passiveMemoryItemOne.length()>10) return 100;

    if (activeMemoryItem.length()<10){
      if (passiveMemoryItemTwo.length()<10 && passiveMemoryItemTwo.length()<10) return 70;
    }
    if (passiveMemoryItemTwo.length()<10){
      if (activeMemoryItem.length()<10 && passiveMemoryItemOne.length()<10) return 70;
    }
    if (passiveMemoryItemOne.length()<10){
      if (activeMemoryItem.length()<10 && passiveMemoryItemTwo.length()<10) return 70;
    }
    return 0;
  }

  public boolean isBrainDamaged(){
    return activeMemoryItem==null || passiveMemoryItemOne==null || passiveMemoryItemTwo==null;
  }

  public void remember(String info){
    passiveMemoryItemTwo=passiveMemoryItemOne;
    passiveMemoryItemOne=activeMemoryItem;
    activeMemoryItem=info;
  }

  public void refreshMemory(String info){
    if (passiveMemoryItemOne.equals(info)){
      passiveMemoryItemOne=activeMemoryItem;
      activeMemoryItem=info;
    }

    if (passiveMemoryItemTwo.equals(info)){
      passiveMemoryItemTwo=passiveMemoryItemOne;
      passiveMemoryItemOne=activeMemoryItem;
      activeMemoryItem=info;
    }
  }

  public boolean recall(String info){
    return passiveMemoryItemOne.equals(info) || passiveMemoryItemTwo.equals(info) || activeMemoryItem.equals(info);
  }

  public String recall(){
    return activeMemoryItem;
  }

  public String toString(){
    return "activeMemoryItem: "+activeMemoryItem+"\npassiveMemoryItemOne:"+passiveMemoryItemOne+"\npassiveMemoryItemTwo:"+passiveMemoryItemTwo;
  }

  public boolean equals(Object obj){
    if (obj==null || getClass()!=obj.getClass()) return false;
    Brain temp=(Brain)obj;
    return activeMemoryItem.equals(temp.activeMemoryItem)&&passiveMemoryItemOne.equals(temp.passiveMemoryItemOne)&&passiveMemoryItemTwo.equals(temp.passiveMemoryItemTwo);
  }

}
