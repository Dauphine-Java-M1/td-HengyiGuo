package fr.dauphine.ja.GUOHengyi.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex3 {

	public static List<Integer> listLength(List<?> list) {
		ArrayList<Integer> length = new ArrayList<Integer>();
		for (int i=0; i<list.size();i++) {
			CharSequence seq= (CharSequence)list.get(i);
			length.add(seq.length());
		}
		return length;
	}

   public static void main(String[] args) {
      List<String> l = Arrays.asList("colonel", "reyel");
      System.out.println(listLength(l));
   }
}
