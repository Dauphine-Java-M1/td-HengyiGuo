package view;

import java.awt.Graphics;

import Model.Ring;

public class DrawableRing extends DrawableCircle
{
	Ring r=new Ring();
	public DrawableRing(Ring _r) 
	{
		this.r=_r;
	}
	public void draw(Graphics g) 
	{
		g.drawOval(r.getCenter().getX()-r.getRayon(),r.getCenter().getY()-r.getRayon(),r.getRayon()*2,r.getRayon()*2);
		g.drawOval(r.getCenter().getX()-r.getInnerRayon(),r.getCenter().getY()-r.getInnerRayon(),r.getInnerRayon()*2,r.getInnerRayon()*2);
	}
}