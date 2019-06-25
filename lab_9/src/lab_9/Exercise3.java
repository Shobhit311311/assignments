package lab_9;
import java.util.*;
public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the range");
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int a[]=new int[n];
	    for(int i=0;i<a.length;i++)
	    {
	    	a[i]=sc.nextInt();
	    }
	    System.out.println(getSquares(a));
	}
	public static Map<Integer,Integer> getSquares(int[] a)
	  {  Map<Integer,Integer> m=new LinkedHashMap<Integer,Integer>();
		for(int i=0;i<a.length;i++)
		{
			int d=a[i]*a[i];
			m.put(a[i], d);
			
		}
		return m;
	  }
}
