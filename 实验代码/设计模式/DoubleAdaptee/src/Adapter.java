
public class Adapter implements Cat,Dog {
   private Dog dog;
   private Cat cat;
   public void catchMouse()
   {
	   System.out.println("��ģ��");
	   cat.catchMouse();
   }
   public void wang()
   {
	   System.out.println("èģ��");
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
