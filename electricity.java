package day1assign;
import java.util.Scanner;
public class electricity {
	public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = in.nextLine();
        System.out.println("Enter Units Consumed: ");
        int units = in.nextInt();
        double billamount = 0.0;
        if (units <= 100)
        {
        	billamount = units * 4;
        }
        else if (units>100 && units<= 200)
        {
        	double unitconsumed100to300 = units-100;
        	billamount = (100*4)+(unitconsumed100to300*5);
        	if(billamount>1000)
        		billamount = billamount + billamount*0.05;
        }
        else if (units > 300)
        {
        	double unitconsumedabove300 = units-300;
        	billamount = (100*4)+(200*5)+(unitconsumedabove300*10);
        	billamount = billamount + (billamount*0.05);
        }
        double totalamount = billamount + billamount*0.18;
        
        System.out.println("name: " + name);
        System.out.println("Units : " + units);
        System.out.println("Amount: " + totalamount);
    }
}
