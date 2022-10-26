//LINEAR SEARCH in JAVA
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the size of the array");
	   int  n=sc.nextInt();
	    int a[]=new int[n];
	    
	     System.out.println("Enter the array");
	    for(int i=0;i<n;i++)
	    a[i]=sc.nextInt();
	    
	    System.out.println("Enter no to search");
	    int x=sc.nextInt();
	    for(int i=0;i<n;i++)
	    {
	        if(x==a[i]){
	            System.out.println("Required number found at index "+(i+1));
	            return;
	        }
	    }
	    
	    
		System.out.println("Not Found");;
	}
}
