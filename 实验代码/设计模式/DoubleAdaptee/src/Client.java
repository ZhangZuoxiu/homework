
public class Client {
  public static void main(String []args)
  {
	  ConcreteCat cat= new ConcreteCat();
	  ConcreteDog dog = new ConcreteDog();
	  Adapter adp;
	adp=(Adapter)XMLUtil.getBean();
	adp.setDog(dog);
	 adp.setCat(cat);
	 adp.catchMouse();
	 adp.wang();
  }
}
