package task13_1;

public abstract class Qizi {
    public abstract String getColor();
    public void location(Location loc)
    {
    	System.out.println("棋子颜色:"+this.getColor()+"棋子位置："+"("+loc.getX()+","+loc.getY()+")");
    }
}
