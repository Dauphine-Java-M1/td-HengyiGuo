package Model;

import java.awt.Graphics;

import view.DrawableCircle;

public class Circle extends Shape
{
	private Point centre;
	private int rayon;
	
	public Circle()
	{
		this.centre=new Point(0,0);
		this.rayon=0;
	}
	public Circle(Point c, int r)
	{
		this.centre=c;
		this.rayon=r;
	}
	
	public String toString()
	{
		return "centre=("+this.centre.getX()+","+this.centre.getY()+"),rayon="+this.rayon+",surface="+this.surface();
	}
	public void translate(int dx,int dy)
	{
		this.centre=this.centre.translate(dx,dy);
	}
	public Point getCenter()
	{
		return this.centre;
	}
	public int getRayon()
	{
		return this.rayon;
	}
	public double surface()
	{
		return Math.PI*Math.pow(this.rayon,2);
	}
	public boolean contains(Point p)
	{
		if(Math.sqrt((Math.pow((p.getX()-this.centre.getX()),2)+Math.pow((p.getY()-this.centre.getY()),2)))<=this.getRayon())
			return true;
		else
			return false;
	}
	public static boolean contains(Point p,Circle c1,Circle c2,Circle c3)
	{
		if(Math.sqrt((Math.pow((p.getX()-c1.centre.getX()),2)+Math.pow((p.getY()-c1.centre.getY()),2)))<=c1.getRayon())
			return true;
		else if(Math.sqrt((Math.pow((p.getX()-c2.centre.getX()),2)+Math.pow((p.getY()-c2.centre.getY()),2)))<=c2.getRayon())
			return true;
		else if(Math.sqrt((Math.pow((p.getX()-c3.centre.getX()),2)+Math.pow((p.getY()-c3.centre.getY()),2)))<=c3.getRayon())
			return true;
		else
			return false;	
	}
	
	public void draw(Graphics g)
	{
		DrawableCircle dc=new DrawableCircle(this);
		dc.draw(g);
	}
}
