package lab_9;
import java.util.*;
public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	HashMap<Integer,String> m=new HashMap<Integer,String>();
	System.out.println("Enter the range");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    
    int i=0;
    while(i<n) {
    	String j=sc.next();
    	int f=sc.nextInt();
         m.put(f,j);
         i++;
    }
    
    System.out.println(getValues(m));
    
    
	}
  public static List<String> getValues(HashMap<Integer,String> a)
  {
	  Collection<String> b=a.values();
	  List<String> d=new ArrayList<String>(b);
	  Collections.sort(d);
	  return d;
  }
}
