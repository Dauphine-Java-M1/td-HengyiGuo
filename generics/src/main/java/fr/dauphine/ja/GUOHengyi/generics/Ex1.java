package fr.dauphine.ja.GUOHengyi.generics;


public class Ex1 {

   public static <T extends Comparable<T>> T myMax(T t, T ... ts) {
      T max = t;
      for (T obj : ts) {
    	  if(max.compareTo(obj)<0) 
           max = obj;
      }
      return max;
   }

   public static void main(String[] args) {
      System.out.println(myMax(Integer.valueOf(42), new Integer[]{Integer.valueOf(1664)}));
      System.out.println(myMax(Integer.valueOf(2014), new Integer[]{Integer.valueOf(86), Integer.valueOf(13)}));
      System.out.println(myMax(Double.valueOf(8.6D), new Double[]{Double.valueOf(16.64D)}));
      System.out.println((String)myMax("baa", new String[]{"aba"}));
   }
}
