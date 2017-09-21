
public class Adapter implements Cat,Dog {
   private Dog dog;
   private Cat cat;
   public void catchMouse()
   {
	   System.out.println("¹·Ä£·Â");
	   cat.catchMouse();
   }
   public void wang()
   {
	   System.out.println("Ã¨Ä£·Â");
	   dog.wang();
   }
   public void setDog(Dog dog)
   {
	   this.dog=dog;
   }
   public void setCat(Cat cat)
   {
	   this.cat=cat;
   }
}
