package Model;

import java.awt.Graphics;

public abstract class Shape extends World 
{
	public void draw(Graphics g){}

	public abstract boolean contains(Point p);

	public abstract void translate(int x, int y);
}
