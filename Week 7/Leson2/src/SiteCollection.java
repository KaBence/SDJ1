import java.util.ArrayList;

public class SiteCollection
{
  private int size;
  private ArrayList<Website> web;

  public SiteCollection(int maxSites){
    web=new ArrayList<Website>();
    size=maxSites;
  }

  public int getNumberOfSites(){
    return web.size();
  }

  public int getNumberOfUpdatedSites(){
    int counter=0;
    for (Website item : web){
      if (!(item.needsUpdate()))counter++;
    }
    return counter;
  }

  public void addSite(Website site){
      web.add(site);
  }

  public void removeSite(String url){
    for (int i = 0; i < web.size(); i++)
    {
      if (web.get(i).getUrl().equals(url)) web.remove(i);
    }
  }

  public Website[] getAllSites(){
    return web.toArray(new Website[web.size()]);
  }

  public Website[] getAllNotUpdatedSites(){
    int counter=0;
    Website[] temp=new Website[web.size()-getNumberOfUpdatedSites()];
    for (Website item : web){
      if (item.needsUpdate()){
        temp[counter]=item;
        counter++;
      }
    }
    return temp;
  }

  public String toString(){
    String temp="";
    for (Website item : web){
      temp+=item+"\n";
    }
    return temp;
  }
}
