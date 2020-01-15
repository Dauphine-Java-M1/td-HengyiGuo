<<<<<<< HEAD
package view;

import java.awt.Graphics;

import Model.Circle;

public class DrawableCircle implements DrawableShape
{
	Circle c=new Circle();
	public DrawableCircle() {}
	public DrawableCircle(Circle _c)
	{
		this.c=_c;
	}
	@Override
	public void draw(Graphics g) 
	{
		g.drawOval(c.getCenter().getX()-c.getRayon(),c.getCenter().getY()-c.getRayon(),c.getRayon(),c.getRayon());
	}
}
=======
package view;

import java.awt.Graphics;

import Model.Circle;

public class DrawableCircle implements DrawableShape
{
	Circle c=new Circle();
	public DrawableCircle() {}
	public DrawableCircle(Circle _c)
	{
		this.c=_c;
	}
	@Override
	public void draw(Graphics g) 
	{
		g.drawOval(c.getCenter().getX()-c.getRayon(),c.getCenter().getY()-c.getRayon(),c.getRayon(),c.getRayon());
	}
}
>>>>>>> 6b544db24088e6ca28c98dae68870e83272219fa
