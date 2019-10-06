package fr.dauphine.ja.GUOHengyi.td00;

/**
 * Hello world!
 *
 */
import java.util.*;

class Prime
{
	ArrayList<Integer> numbers=new ArrayList<Integer>();
    public void initRandom(int n,int m)
    {
    	Random rand=new Random();
    	for(int i=0;i<=n;i++)
    	{
    		numbers.add(rand.nextInt(m)+1000);
    	}
    }
    private static boolean isPrime(int p)
    {
    	for(int j=2;j<=Math.sqrt(p);j++)
    	{
    		if(p%j==0)
    			return false;
    	}
    	return true;
    }
    public void printPrimes()
    {
    	for(int i=0;i<numbers.size();i++)
    	{
    		if(isPrime(numbers.get(i)))
    			System.out.println(numbers.get(i)+" est un nombre premier.");
    	}
    }
}
public class PrimeCollection 
{
	public static void main(String[] args)
    {
		Prime pm=new Prime();
		pm.initRandom(100,1000);
		pm.printPrimes();
    }
}
