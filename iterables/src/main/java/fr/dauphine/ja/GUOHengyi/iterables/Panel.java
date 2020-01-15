package fr.dauphine.ja.GUOHengyi.iterables;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;

public class Panel extends AbstractList<Integer> implements Iterable<Integer>
{
	public static Iterator<Integer> panel1(final int lowerNumber,final int higherNumber)
	{
		return new Iterator<Integer>() {
			int index=lowerNumber;
			public boolean hasNext() 
			{
				return (index<=higherNumber);
			}
			public Integer next() 
			{
				if(this.hasNext())
					return index++;
				return null;
			}
		};
	}
	
	public static Iterable<Integer> panel2(final int lowerNumber,final int higherNumber)
	{
		return new Iterable<Integer>() {
			public Iterator<Integer> iterator() {
				return panel1(lowerNumber,higherNumber);
			}
		};
	}
	
	public static List<Integer> panel(final int lowerNumber,final int higherNumber)
	{
		return new AbstractList<Integer>() {

			@Override
			public Integer get(int index) {
				return lowerNumber+index;
			}

			@Override
			public int size() {
				return higherNumber-lowerNumber+1;
			}
			
		};
	}
	
	public static void main(String args[])
	{
		Iterator<Integer> it=panel1(1,5);
		System.out.println("Output 1:");
		for(;it.hasNext();)
			System.out.println(it.next()); //affiche 1,2,3,4,5
		
		System.out.println("Output 2:");
		for(int i:panel2(1,5))
			System.out.println(i); //affiche 1,2,3,4,5 
		
		List<Integer> l=panel(3,6);
		System.out.println("Output 3:");
		for(int i:l)
			System.out.println(i); //affiche 3,4,5,6
		System.out.println(l.get(1)); //affiche 4
		
	}

	@Override
	public Integer get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}
}
