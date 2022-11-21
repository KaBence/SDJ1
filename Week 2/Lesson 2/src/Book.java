import java.util.Scanner;
public class Book
{
  Scanner k=new Scanner(System.in);
  private String author,title;
  private double price;
  private int pages;

  public Book(String a,String t,double price,int pages){
    author=a;
    title=t;
    this.price=price;
    this.pages=pages;
  }

  public Book(){
    System.out.println("Who is the author?");
    author=k.nextLine();
    System.out.println("What is the name of the book?");
    title=k.nextLine();
    System.out.println("How much it costs?");
    price=k.nextDouble();
    System.out.println("How many pages?");
    pages=k.nextInt();
  }

  public String getAuthor(){
    return author;
  }

  public String getTitle(){
    return title;
  }

  public double getPrice(){
    return price;
  }

  public int getPages(){
    return pages;
  }

  public void setPrice(double p){
    price=p;
  }

  public String toString(){
    return author+" : "+title+" Price:"+(price*0.8)+" Pages:"+pages;
  }
}
