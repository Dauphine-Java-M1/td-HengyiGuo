package view;

import java.awt.Graphics;

import Model.LigneBrisée;

public class DrawableLine implements DrawableShape
{
	LigneBrisée l=new LigneBrisée();
	public DrawableLine(LigneBrisée _l)
	{
		this.l=_l;
	}
	@Override
	public void draw(Graphics g) 
	{
		if(2<=l.nbPoints())
		{
			for(int i=0;i<l.nbPoints()-1;i++)
			{
				g.drawLine(l.getLigne().get(i).getX(), l.getLigne().get(i).getY(), l.getLigne().get(i+1).getX(), l.getLigne().get(i+1).getY());
			}
		}
	}
	
}
