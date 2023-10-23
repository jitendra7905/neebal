package day1assign;
import java.util.Scanner;
public class armstrong {
	public static void main (String [] args) {
		System.out.println("Enter the number");
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int t,r,rev=0;
    	t=n;
    	while (t>0) {
    	r =t%10;
    	rev = rev+r*r*r;
    	t = t/10;
    	}
    	
    	if (n == rev) {
    		System.out.println(n+" is an Armstrong number");
    	}else {
    		System.out.println(n+" is not an Armstrong number");
    	}
	}
}
