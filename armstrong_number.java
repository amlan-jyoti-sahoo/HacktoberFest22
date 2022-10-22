import java.util.*;
public class armstrong_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int x=sc.nextInt();
        int i,sum=0,r,m=x;
        while(x!=0)
        {
            r=x%10;
            sum=sum+r*r*r;
            x=x/10;
        }
        if(m==sum)
        {
            System.out.println("Armstrong Number");
        }
        else
        {
            System.out.println("Not an armstrong number");
        }
    }    
}
