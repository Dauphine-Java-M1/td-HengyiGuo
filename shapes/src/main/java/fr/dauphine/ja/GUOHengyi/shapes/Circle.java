package fr.dauphine.ja.GUOHengyi.shapes;

public class Circle 
{
	Point centre;
	double rayon;
	
	public Circle(Point c, double r)
	{
		this.centre=c;
		this.rayon=r;
	}
	
	public String toString()
	{
		return "centre=("+this.centre.x+","+this.centre.y+"),rayon="+this.rayon+",surface="+this.surface();
	}
	public void translate(int dx,int dy)
	{
		this.centre.x=dx;
		this.centre.y=dy;
	}
	public Point getCenter()
	{
		return this.centre;
	}
	public double surface()
	{
		return Math.PI*Math.pow(this.rayon,2);
	}
	public boolean contains(Point p)
	{
		if(Math.sqrt((Math.pow((p.x-this.centre.x),2)+Math.pow((p.y-this.centre.y),2)))<=this.rayon)
			return true;
		else
			return false;
	}
	public static boolean contains(Point p,Circle c1,Circle c2,Circle c3)
	{
		if(Math.sqrt((Math.pow((p.x-c1.centre.x),2)+Math.pow((p.y-c1.centre.y),2)))<=c1.rayon)
			return true;
		else if(Math.sqrt((Math.pow((p.x-c2.centre.x),2)+Math.pow((p.y-c2.centre.y),2)))<=c2.rayon)
			return true;
		else if(Math.sqrt((Math.pow((p.x-c3.centre.x),2)+Math.pow((p.y-c3.centre.y),2)))<=c3.rayon)
			return true;
		else
			return false;	
	}
}
