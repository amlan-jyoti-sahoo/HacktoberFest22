import java.util.Scanner;

public class PassOrFail {
    public static void main(String[] args) {
        System.out.print("Enter mark of subject1 out of 100: ");
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        System.out.print("Enter mark of subject2 out of 100: ");
        int m2 = sc.nextInt();
        System.out.print("Enter mark of subject3 out of 100: ");
        int m3 = sc.nextInt();
        System.out.print("Enter mark of subject4 out of 100: ");
        int m4 = sc.nextInt();
        System.out.print("Enter mark of subject5 out of 100: ");
        int m5 = sc.nextInt();
        float p = (float)(m1+m2+m3+m4+m5)/5;
        if(m1>33 && m2>33 && m3>33 && m4>33 && m5>33 && p>40.0f){
            System.out.println("Your Overall Percentage is "+p+".\nAnd You are promoted to next grade.");
        } else {
            System.out.println("Your Overall Percentage is "+p+".\nBut You are not promoted to next grade.");
        }
    }
}
