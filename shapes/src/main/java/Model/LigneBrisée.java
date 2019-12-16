package fr.dauphine.ja.GUOHengyi.shapes;

import java.util.LinkedList;

public class LigneBrisée 
{
	LinkedList<Point> pointlist=new LinkedList<Point>();
	
	public LigneBrisée(LinkedList<Point> plist)
	{
		this.pointlist=plist;
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
}
