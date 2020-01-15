package Model;

import java.awt.Graphics;

import view.DrawableRing;

public class Ring extends Circle
{
	Point centre;
	int rayon,rayon_interne;
	
	public Ring(Point c,int r,int r_i)
	{
		super(c,r);
		this.rayon_interne=r_i;
	}
	public Ring()
	{
		this.centre=new Point(0,0);
		this.rayon=0;
		this.rayon_interne=0;
	}
	public int getInnerRayon()
	{
		return this.rayon_interne;
	}
	public boolean equals(Ring ri)
	{
		if(this.centre.isSameAs(ri.centre)&&this.rayon==ri.rayon&&this.rayon_interne==ri.rayon_interne)
			return true;
		else
			return false;
	}
	public boolean contains(Point p)
	{
		if(Math.sqrt((Math.pow((p.getX()-this.centre.getX()),2)+Math.pow((p.getY()-this.centre.getY()),2)))<=this.rayon && this.rayon_interne<=Math.sqrt((Math.pow((p.getX()-this.centre.getX()),2)+Math.pow((p.getY()-this.centre.getY()),2))))
			return true;
		else
			return false;
	}
	public static boolean contains(Point p,Ring r1,Ring r2,Ring r3)
	{
		if(Math.sqrt((Math.pow((p.getX()-r1.centre.getX()),2)+Math.pow((p.getY()-r1.centre.getY()),2)))<=r1.rayon && r1.rayon_interne<=Math.sqrt((Math.pow((p.getX()-r1.centre.getX()),2)+Math.pow((p.getY()-r1.centre.getY()),2))))
			return true;
		else if(Math.sqrt((Math.pow((p.getX()-r2.centre.getX()),2)+Math.pow((p.getY()-r2.centre.getY()),2)))<=r2.rayon && r2.rayon_interne<=Math.sqrt((Math.pow((p.getX()-r2.centre.getX()),2)+Math.pow((p.getY()-r2.centre.getY()),2))))
			return true;
		else if(Math.sqrt((Math.pow((p.getX()-r3.centre.getX()),2)+Math.pow((p.getY()-r3.centre.getY()),2)))<=r3.rayon && r3.rayon_interne<=Math.sqrt((Math.pow((p.getX()-r3.centre.getX()),2)+Math.pow((p.getY()-r3.centre.getY()),2))))
			return true;
		else
			return false;	
	}
	public void draw(Graphics g)
	{
		DrawableRing dr=new DrawableRing(this);
		dr.draw(g);
	}
}
