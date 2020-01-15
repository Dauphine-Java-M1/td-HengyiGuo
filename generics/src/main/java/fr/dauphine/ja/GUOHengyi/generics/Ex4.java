package fr.dauphine.ja.GUOHengyi.generics;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Ex4 {

	private static <T> List<T> fusion(List<? extends T> list1, List<? extends T> list2) {
		List<T> l = new LinkedList<>();  
		if(!list1.isEmpty() && !list2.isEmpty()) {
			if(list1.size() == list2.size()) {
				Iterator<? extends T> t1 = list1.iterator();
				Iterator<? extends T> t2 = list2.iterator();    
				while(t1.hasNext()) {
					l.add(t1.next());
					l.add(t2.next());
				}
			}
			else if(list1.size() != list2.size()) {
				throw new IllegalArgumentException("Must have the same size");
			}
			return l;
		} 
		else {
			return Collections.emptyList();
		}
	}

	public static void main(String[] args) {
		List<String> l1= Arrays.asList("C", "rc");
		List<StringBuilder> l2= Arrays.asList(new StringBuilder("a ma"), new StringBuilder("he!"));
		List<? extends CharSequence> r1=fusion(l1,l2);
		List<?> r2=fusion(l1,l2);
		List<Integer> l3 = Arrays.asList(1,2);
		List<Integer> l4 = Arrays.asList(10,20);
		List<Integer> r3 = fusion(l3,l4);
		List<?> r4 = fusion(l1,l3);
	}
}
