package day1assign;
import java.util.Scanner;
public class millisec {
	    public static void main(String[] args) {
	    	System.out.println("Enter the time in milliseconds");
	    	Scanner sc = new Scanner(System.in);
	    	long milliseconds= sc.nextLong();
	    	long Hrs=(milliseconds/(1000*60*60)%24);
	    	long minutes=((milliseconds/1000)/60)%60;
	    	long seconds=(milliseconds/1000)%60;
	    	
	    	System.out.println("The time in hrs:min:sec is ");
	    	System.out.println(Hrs + " : " + minutes +" : " + seconds);
	    	
	    	
	    }
	}

