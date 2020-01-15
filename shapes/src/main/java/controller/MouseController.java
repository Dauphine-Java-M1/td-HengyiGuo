package controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

import Model.Shape;
import Model.World;
import Model.Point;

public class MouseController implements MouseMotionListener 
{
	World w;
	JFrame frame;
	public MouseController(World _w, JFrame _frame)
	{
		this.w=_w;
		this.frame=_frame;
	}
	@Override
	public void mouseDragged(MouseEvent e) 
	{
		/*Point p=new Point(e.getX(),e.getY());
		for(Shape s:w.getShapes())
		if(s.contains(p))
		{
			s.translate(e.getX(),e.getY());
			frame.repaint();
		}*/
	}

	@Override
	public void mouseMoved(MouseEvent e) 
	{
		w.getShapes().get(w.getShapes().size()-2).translate(e.getX(), e.getY());
		frame.repaint();
	}

}
