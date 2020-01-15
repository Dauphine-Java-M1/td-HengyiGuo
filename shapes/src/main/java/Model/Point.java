package Model;

public class Point
{
	private int x,y;
	public static int c=0;
	public int count;
	
	public Point(int px,int py)
	{
		this.x=px;
		this.y=py;
		this.count=c;
		this.count++;
	}
	public Point(Point _p)
	{
		this.x=_p.x;
		this.y=_p.y;
		this.count=c;
		this.count++;
	}

	public Point() 
	{
		this.x=0;
		this.y=0;
	}
	public boolean isSameAs(Point p)
	{
		if((this.x==p.x)&&(this.y==p.y))
			return true;
		else
			return false;
	}
	public boolean equals(Object obj) 
	{
		return this.isSameAs((Point)(obj));
	}
	
	public Point translate(int dx,int dy) 
	{
		this.x=dx;
		this.y=dy;
		return new Point(this.x,this.y);
	}
	public int getX()
	{
		return this.x;
	}
	public int getY() 
	{
		return this.y;
	}
	
	public static void main(String[] args)
	{
		Point p=new Point(5,6);
		String point="("+p.x+","+p.y+")";
		System.out.println(point);
		System.out.println(p.x+" "+p.y);
	}
}
