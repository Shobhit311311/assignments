package lab_9;
import java.util.*;
public class Exercise_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    System.out.println("enter the range:");
	    int n=sc.nextInt();
	    char a[]=new char[n];
	    for(int i=0;i<n;i++)
	    {    System.out.println("enter "+i+"th element");
	    	a[i]=sc.next().charAt(0);
	    }
	    System.out.println(countCharacter(a));
	}
  public static Map<Character,Integer> countCharacter(char[] a)
  {    Map<Character,Integer> h=new LinkedHashMap<Character,Integer>();
	  for(int i=0;i<a.length;i++)
		 {   int c=0;
			 for(int j=0;j<a.length;j++)
			 { 
			 if(a[i]==a[j])
			 {
				 c++;
				 i=j;
			 }}
			 h.put(a[i],c);
		 
		 	}
	  return h;
	  }
  }

