package fr.dauphine.ja.GUOHengyi.generics;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.RandomAccess;

public class Ex5 {

   public static <T> void swap(List<T> l, int i, int j) {
      if(i >= 0 && j >= 0 && i < l.size() && j < l.size()) {
         T ele_i = l.get(i);
         T ele_j = l.get(j);
         l.set(i, ele_j);
         l.set(j, ele_i);
      } 
      else {
         throw new IndexOutOfBoundsException();
      }
   }

   private static void swap(Object[] obj, int i, int j) {
      if(i >= 0 && j >= 0 && i <= obj.length && j <= obj.length) {
         Object ele_i = obj[i];
         Object ele_j = obj[j];
         obj[i] = ele_j;
         obj[j] = ele_i;
      } 
      else {
         throw new IndexOutOfBoundsException();
      }
   }

   public static List<?> melanger(List<?> l) {
      Random r = new Random();
      if(!(l instanceof RandomAccess)) {
         Object[] o = l.toArray();
         for(int i = 0; i < o.length; ++i) {
            swap(o, i, r.nextInt(o.length - 1));
         }
         l = Arrays.asList(o);
      } 
      else {
         for(int i = 0; i < l.size(); i++) {
            swap(l, i, r.nextInt(l.size() - 1));
         }
      }
      return l;
   }

   public static void main(String[] args) {
      List<Integer> l1 = Arrays.asList(1,2,3,4,5,6);
      System.out.println(l1);
      List<?> l11 = melanger(l1);
      System.out.println(l11);
      LinkedList<Integer> l2 = new LinkedList<>();
      l2.add(Integer.valueOf(1));
      l2.add(Integer.valueOf(2));
      l2.add(Integer.valueOf(3));
      l2.add(Integer.valueOf(4));
      System.out.println(l2);
      List<?> l21 = melanger(l2);
      System.out.println(l21);
   }
}
