package fr.dauphine.ja.GUOHengyi.shapes;

public class Ring 
{
	Point centre;
	double rayon,rayon_interne;
	
	public Ring(Point c,double r,double r_i)
	{
		this.centre=c;
		this.rayon=r;
		this.rayon_interne=r_i;
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
		if(Math.sqrt((Math.pow((p.x-this.centre.x),2)+Math.pow((p.y-this.centre.y),2)))<=this.rayon && this.rayon_interne<=Math.sqrt((Math.pow((p.x-this.centre.x),2)+Math.pow((p.y-this.centre.y),2))))
			return true;
		else
			return false;
	}
	public static boolean contains(Point p,Ring r1,Ring r2,Ring r3)
	{
		if(Math.sqrt((Math.pow((p.x-r1.centre.x),2)+Math.pow((p.y-r1.centre.y),2)))<=r1.rayon && r1.rayon_interne<=Math.sqrt((Math.pow((p.x-r1.centre.x),2)+Math.pow((p.y-r1.centre.y),2))))
			return true;
		else if(Math.sqrt((Math.pow((p.x-r2.centre.x),2)+Math.pow((p.y-r2.centre.y),2)))<=r2.rayon && r2.rayon_interne<=Math.sqrt((Math.pow((p.x-r2.centre.x),2)+Math.pow((p.y-r2.centre.y),2))))
			return true;
		else if(Math.sqrt((Math.pow((p.x-r3.centre.x),2)+Math.pow((p.y-r3.centre.y),2)))<=r3.rayon && r3.rayon_interne<=Math.sqrt((Math.pow((p.x-r3.centre.x),2)+Math.pow((p.y-r3.centre.y),2))))
			return true;
		else
			return false;	
	}
}
