package fr.dauphine.ja.GUOHengyi.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex2 {

   private static void print(List<?> list) {
	   for(Object o:list)
		   System.out.println(o);
   }

   private static void print1(List<? extends CharSequence> list) {
      List<Integer> longueur = new ArrayList<>();
      for(CharSequence o : list) {
    	  longueur.add(o.length());
      }
      print(longueur);
   }

   public static void main(String[] args) {
      List<String> list = Arrays.asList(new String[]{"foo", "toto"});
      print(list);
      System.out.println("-----");
      print1(list);
   }
}
