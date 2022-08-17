package diaatech;
import java.util.Scanner;
public class TemperatureConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double Tc;
		double Tf;
		Scanner input = new Scanner(System.in);
		System.out.println("enter the conversion");
		 System.out.println("1.Celcius to fehrenheit");
	    System.out.println("2.Fehrenheit to celcius");
	    
	     int num = input.nextInt();
	     switch(num) {
	     case 1:System.out.println("enter Celcius value:");
	            double tc =input.nextDouble();
	                   Tf=  (1.8) * (tc +32);
	            System.out.println("temprature is:" + Tf+"F");
	            break;
	     case 2:System.out.println("enter Fehrenheit value:");
	            double tf =input.nextDouble();
	                   Tc=(1.8 )* (tf -32);
	                   System.out.println("temprature is:" + Tc+"C"); 
	             break;
	             default:
	            	 System.out.println("sorry invalid entry");
	                   
	     }
	}

}
