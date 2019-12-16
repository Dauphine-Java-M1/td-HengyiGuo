package fr.dauphine.ja.GUOHengyi.shapes;

public class Point
{
	public int x,y;
	
	public Point(int px,int py)
	{
		this.x=px;
		this.y=py;
	}
	public Point(Point _p)
	{
		this.x=_p.x;
		this.y=_p.y;
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
	
	public void translate(int dx,int dy) {};
	
	public static void main(String[] args)
	{
		Point p=new Point(5,6);
		String point="("+p.x+","+p.y+")";
		System.out.println(point);
		System.out.println(p.x+" "+p.y);
	}
}
