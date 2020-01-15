package Model;

import java.awt.Graphics;
import java.util.LinkedList;

import view.DrawableLine;

public class LigneBrisée extends Shape
{
	LinkedList<Point> pointlist;
	
	public LinkedList<Point> getLigne()
	{
		return this.pointlist;
	}
	public LigneBrisée()
	{
		this.pointlist=new LinkedList<Point>();
	}
	
	public void add(Point p) 
	{
		pointlist.add(p);
		/*for(int i=0;i<pointlist.size();i++)
			if(pointlist[i]!=null)
				pointlist[i]=p;	*/		
	}
	public int pointCapacity()
	{
		return pointlist.size();
	}
	public int nbPoints()
	{
		return pointlist.size();
	}
	public boolean contains(Point _p)
	{
		return pointlist.contains(_p);
		/*for(Point p:pointlist)
		{
			if(p.isSameAs(_p))
				return true;
		}
		return false;*/
	}
	public void draw(Graphics g)
	{
		DrawableLine dl=new DrawableLine(this);
		dl.draw(g);
	}
	@Override
	public void translate(int x, int y) 
	{
		Point p=new Point();
		for(int i=0;i<pointlist.size();i++)
		{
			p=pointlist.get(i);
			p.translate(x,y);
		}
	}
}
