package day1assign;
import java.util.Scanner;
public class military {
	public static void main (String [] args) {
		String ampm = "";
		System.out.println("Enter the time in 24 hours");
    	Scanner sc = new Scanner(System.in);
    	int miltarytime = sc.nextInt();
    	int hrs = miltarytime/100;
    	int min = miltarytime%10;
    	
    	miltarytime = miltarytime/10;
    	min = min+((miltarytime%10)*10);

    	if(hrs>12)
    	{
    		ampm="pm";
    		hrs=hrs-12;
    	}else {
    		ampm="am";
    	}
    	System.out.println("12-hour format is "+hrs+":"+min+""+ampm );
    	
	}	
}
