package day1assign;
import java.util.Scanner;
public class years {
	public static void main (String [] args) {
		System.out.println("Enter the number of days");
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	
    	int years=(n/365);
    	n = n%365;
    	int months=(n/30);
    	n= n%30;
    	int weeks=(n/7);
    	int days=(n%7);
    	
    	System.out.println(years+" years : "+months+" months : "+weeks+" weeks : "+days+" days");
 }
}