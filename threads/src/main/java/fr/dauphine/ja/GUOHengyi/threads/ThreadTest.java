package fr.dauphine.ja.GUOHengyi.threads;

public class ThreadTest {

   private static int n = 1;
   private static final Object monitor = new Object();
   private static boolean flag;


   public static Runnable repete(final int id) {
      return new Runnable() {
		public void run() {
			// TODO Auto-generated method stub
	    	  for(int i = 0; i < 10000; ++i) {
	    	         System.out.println("Je suis le thread" + id);
	    	  }
		}
			
      };
   }

   public static Runnable repete1(final int id) {
      return new Runnable() {

		public void run() {
			// TODO Auto-generated method stub
		     while(n < 10000) {
		         synchronized(monitor) {
		            if(n < 10000) {
		               flag=true;
		            }

		            if(flag=true) {
		               System.out.println("Je suis le thread" + id + ", et j'effectue l'iteration" + n);
		               n++;
		               flag=false;
		            }
		         }
		     }
		}	  
      };
   }

   public static void main(String[] args) {
      Thread t1 = new Thread(repete1(1));
      Thread t2 = new Thread(repete1(2));
      t1.start();
      t2.start();
   }
}
