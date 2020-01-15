package fr.dauphine.ja.GUOHengyi.iterables;

import java.util.AbstractList;
import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public class Mult{
	public static List<Integer> mult(final int a,final List<Integer> l)
	{
		/*List<Integer> list=new ArrayList<Integer>();
		for(int i:l)
			list.add(i*a);
		return list;*/
		if(l instanceof RandomAccess)
			return new AbstractList<Integer>() {

				@Override
				public Integer get(int index) {
					// TODO Auto-generated method stub
					return l.get(index)*a;
				}

				@Override
				public int size() {
					// TODO Auto-generated method stub
					return l.size();
				}
			
		};
		else
			return new AbstractSequentialList<Integer>() {

				@Override
				public ListIterator<Integer> listIterator(final int index) {
					// TODO Auto-generated method stub
					return new ListIterator<Integer>() {
						ListIterator<Integer> lite=l.listIterator(index);
						@Override
						public void add(Integer arg0) {
							// TODO Auto-generated method stub
							lite.add(arg0);
						}

						@Override
						public boolean hasNext() {
							// TODO Auto-generated method stub
							return lite.hasNext();
						}

						@Override
						public boolean hasPrevious() {
							// TODO Auto-generated method stub
							return lite.hasPrevious();
						}

						@Override
						public Integer next() {
							// TODO Auto-generated method stub
							return lite.next()*a;
						}

						@Override
						public int nextIndex() {
							// TODO Auto-generated method stub
							return lite.nextIndex();
						}

						@Override
						public Integer previous() {
							// TODO Auto-generated method stub
							return lite.previous();
						}

						@Override
						public int previousIndex() {
							// TODO Auto-generated method stub
							return lite.previousIndex();
						}

						@Override
						public void remove() {
							// TODO Auto-generated method stub
							lite.remove();
						}

						@Override
						public void set(Integer arg0) {
							// TODO Auto-generated method stub
							lite.set(arg0);
						}
						
					};
				}

				@Override
				public int size() {
					// TODO Auto-generated method stub
					return l.size();
				}
			
		};
	}
	
	public static List<Integer> mult1(final List<Integer> l, final int a)
	{
		return new AbstractList<Integer>() {

			@Override
			public Integer get(int index) {
				return l.get(index)*a;
			}

			@Override
			public int size() {
				return l.size();
			}
			
		};
	}
	
	
	
	public static void main(String args[])
	{
		ArrayList<Integer> al = new ArrayList<>();
		for (int i = 0; i < 1000000; i++) {
			al.add(i);
		}
		long t0 = System.nanoTime();
		List<Integer> ret = Mult.mult(2, al);
		long sum=0;
		for(int val : ret) {
			sum+=val/2;
		}
		System.out.println((System.nanoTime() - t0));
		
		LinkedList<Integer> ll = new LinkedList<>();
		for (int i = 0; i < 1000000; i++) {
			ll.add(i);
		}
		t0 = System.nanoTime();
		sum=0;
		ret = Mult.mult(2, ll);
		for(int val : ret) {
			sum+=val/2;
		}
		System.out.println((System.nanoTime() - t0));
	}
}
