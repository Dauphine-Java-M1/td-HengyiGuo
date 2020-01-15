package Model;

import Model.Shape;
import java.util.ArrayList;
import java.util.Observable;

public class World extends Observable
{
	private ArrayList<Shape> shapes;
	
	public World()
	{
		this.shapes=new ArrayList<Shape>();
	}
	public void add(Shape s)
	{
		shapes.add(s);
		setChanged();
		notifyObservers();
	}
	public ArrayList<Shape> getShapes()
	{
		return this.shapes;
	}
}
