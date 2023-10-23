package day1assign;
import java.util.Scanner;
public class bluebird {
	public static void main (String [] args) {
		System.out.println("Enter the number of bookings");
    	Scanner sc = new Scanner(System.in);
    	int x = sc.nextInt();
    	
    	int passengers = (50)*(x/50);
    	System.out.println("People Travelling = "+ passengers);
}
}