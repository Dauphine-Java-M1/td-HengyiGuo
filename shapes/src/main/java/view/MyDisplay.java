<<<<<<< HEAD
package view;

import javax.swing.*;
import java.awt.*;
import java.util.Observable;
import java.util.Observer;
import Model.World;
import controller.MouseController;
import Model.Point;
import Model.Ring;
import Model.Circle;
import Model.LigneBrisée;
import Model.Shape;

public class MyDisplay extends JPanel implements Observer
{
	private static final long serialVersionUID = 1L;
	public World w;
	
	MyDisplay(World w)
	{
		this.w=w;
	}
	
	public void paintComponent(Graphics g)
	{
		//super.paintComponent(g);
		//g.drawLine(100,100,200,200);
		for(Shape s:w.getShapes())
		{
			s.draw(g);
		}
	}
	public static void main(String[] args) 
	{
		World w=new World();
		Circle c=new Circle(new Point(100,100),100);
		Ring r=new Ring(new Point(50,50),50,10);
		Point p1=new Point(100,200);
		Point p2=new Point(150,400);
		Point p3=new Point(300,400);
		Point p4=new Point(400,200);
		LigneBrisée l=new LigneBrisée();
		l.add(p1);
		l.add(p2);
		l.add(p3);
		l.add(p4);
		w.add(c);
		w.add(r);
		w.add(l);
		MyDisplay d1=new MyDisplay(w);
		JFrame frame=new JFrame("Java Avancé - Graphic Display");
		MouseController mc=new MouseController(w,frame);
		frame.setSize(new Dimension(500,500));
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	//	MyDisplay d=new MyDisplay();
		frame.add(d1);
		frame.addMouseMotionListener(mc);
	}
	@Override
	public void update(Observable arg0, Object arg1) {
		//this.paintComponent(this.get);
	}
}
=======
package view;

import javax.swing.*;
import java.awt.*;
import java.util.Observable;
import java.util.Observer;
import Model.World;
import controller.MouseController;
import Model.Point;
import Model.Ring;
import Model.Circle;
import Model.LigneBrisée;
import Model.Shape;

public class MyDisplay extends JPanel implements Observer
{
	private static final long serialVersionUID = 1L;
	public World w;
	
	MyDisplay(World w)
	{
		this.w=w;
	}
	
	public void paintComponent(Graphics g)
	{
		//super.paintComponent(g);
		//g.drawLine(100,100,200,200);
		for(Shape s:w.getShapes())
		{
			s.draw(g);
		}
	}
	public static void main(String[] args) 
	{
		World w=new World();
		Circle c=new Circle(new Point(100,100),100);
		Ring r=new Ring(new Point(50,50),50,10);
		Point p1=new Point(100,200);
		Point p2=new Point(150,400);
		Point p3=new Point(300,400);
		Point p4=new Point(400,200);
		LigneBrisée l=new LigneBrisée();
		l.add(p1);
		l.add(p2);
		l.add(p3);
		l.add(p4);
		w.add(c);
		w.add(r);
		w.add(l);
		MyDisplay d1=new MyDisplay(w);
		JFrame frame=new JFrame("Java Avancé - Graphic Display");
		MouseController mc=new MouseController(w,frame);
		frame.setSize(new Dimension(500,500));
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	//	MyDisplay d=new MyDisplay();
		frame.add(d1);
		frame.addMouseMotionListener(mc);
	}
	@Override
	public void update(Observable arg0, Object arg1) {
		//this.paintComponent(this.get);
	}
}
>>>>>>> 6b544db24088e6ca28c98dae68870e83272219fa
