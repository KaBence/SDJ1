public class Website
{
  private String url;
  private boolean needsUpdate;

  public Website(String url){
    this.url=url;
    needsUpdate=false;
  }

  public String getUrl()
  {
    return url;
  }

  public boolean needsUpdate()
  {
    return needsUpdate;
  }

  public void markAsNotUpdated(){
    needsUpdate=false;
  }

  public void markAsUpdate(){
    needsUpdate=true;
  }

  public boolean equals(Object obj){
    if (obj==null ||obj.getClass()!=getClass()){
      return false;
    }
    Website temp=(Website)obj;
    return url==temp.getUrl()&&needsUpdate== temp.needsUpdate();
  }

  public String toString(){
    if (needsUpdate)return url+" Needs update";
    else return url;
  }
}
