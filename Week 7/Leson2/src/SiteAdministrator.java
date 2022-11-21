public class SiteAdministrator
{
  private String name;
  private SiteCollection sc;

  public SiteAdministrator(String name,SiteCollection sc){
    this.name=name;
    this.sc=sc;
  }

  public String getName()
  {
    return name;
  }

  public SiteCollection getSc()
  {
    return sc;
  }

  public Website getNextSiteToUpdate(){
    return sc.getAllNotUpdatedSites()[0];
  }

  public Website[] getAllSitesToUpdate(){
    return sc.getAllNotUpdatedSites();
  }
}
