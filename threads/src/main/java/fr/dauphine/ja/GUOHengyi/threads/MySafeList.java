package fr.dauphine.ja.GUOHengyi.threads;

import java.util.ArrayList;

public class MySafeList {

   private ArrayList<Double> list;


   public void add(Double d) {
      this.list.add(d);
   }

   public int size() {
      return this.list.size();
   }

   public Double get(int i) {
      return (Double)this.list.get(i);
   }

   public static void main(String[] args) {
   }
}
