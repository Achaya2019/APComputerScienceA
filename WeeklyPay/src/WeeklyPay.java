import java.util.Scanner;
public class WeeklyPay {

	public static void main(String[] args) {
		double hours;
		double wage;
		double overtime;
		double pay = 0;
		Scanner hoursin =new Scanner(System.in);
		Scanner wagein=new Scanner(System.in);
		System.out.println("Enter hours worked:");
		hours=hoursin.nextDouble();
		System.out.println("Enter hourly wage");
		wage=wagein.nextDouble();
		Scanner overtimein=new Scanner(System.in);
		System.out.println("Enter overtime worked");
		overtime=overtimein.nextDouble();
		overtimePay(overtime,wage,hours,pay);
		
	}
	public static void overtimePay(double overtime, double wage, double hours, double pay) {
		pay=wage*hours;
		wage=wage*1.5;
		overtime=overtime*wage;
		pay=pay+overtime;
		System.out.print("Your weekly pay is: $" + pay);
	}
	
}
