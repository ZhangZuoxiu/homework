package task13_1;

public abstract class Qizi {
    public abstract String getColor();
    public void location(Location loc)
    {
    	System.out.println("������ɫ:"+this.getColor()+"����λ�ã�"+"("+loc.getX()+","+loc.getY()+")");
    }
}
