package task25;
public class Book implements Product
{
  public void accept(Visitor visitor)
  {
      visitor.visit(this);
  }	
}