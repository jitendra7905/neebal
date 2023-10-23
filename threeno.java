package day1assign;
import java.util.Scanner;
public class threeno {
	public static void main (String [] args) {
		System.out.println("Enter the three numbers");
    	Scanner sc = new Scanner(System.in);
    	int a = sc.nextInt();
    	int b = sc.nextInt();
    	int c = sc.nextInt();
    	int temp=a>b?a:b;  
    	int largest=c>temp?c:temp;  
    	System.out.println("The largest number is: "+largest);
	}
}
