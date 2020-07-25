
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		boolean n = true;
		Scanner sc = new Scanner(System.in);
		while(n) {
			System.out.println("Operations available:-");
			System.out.println("ADD+");
			System.out.println("SUB - ");
			System.out.println("MUL *");
			System.out.println("DIV /");
			System.out.println("Enter the numbers to perform the operations on");
			double a, b;
			a = sc.nextDouble();
			b = sc.nextDouble();
			System.out.println("Select an operator(+ - * /)");
			char choice = sc.next().charAt(0);
			double ans = 0;
			char rep;
			try {
				operations op = new operations();
			switch(choice) {
				case '+':
					ans = op.add(a,b);
					System.out.println("The sum = " +ans);
					System.out.println("Do you want to perform any other operations? (Y/N)");
					rep = sc.next().charAt(0);
					if(rep == 'Y' || rep == 'y') {
						n = true;
						break;
					} else {
						n = false;
						System.out.println("Thankyou!");
						break;
					}
				case '-':
				    ans = op.sub(a, b);
					System.out.println("The difference = " +ans);
					System.out.println("Do you want to perform any other operations? (Y/N)");
					rep = sc.next().charAt(0);
					if(rep == 'Y' || rep == 'y') {
						n = true;
						break;
					} else {
						n = false;
						System.out.println("Thankyou");
						break;
					}
				case '*':
				    ans = op.mul(a, b);
					System.out.println("The product = " +ans);
					System.out.println("Do you want to perform any other operations? (Y/N)");
					rep = sc.next().charAt(0);
					if(rep == 'Y' || rep == 'y') {
						n = true;
						break;
					} else {
						n = false;
						System.out.println("Thankyou");
						break;
					}
				case '/':
				    ans = op.divide(a, b);
					System.out.println("The quotient = " +ans);
					System.out.println("Do you want to perform any other operations? (Y/N)");
					rep = sc.next().charAt(0);
					if(rep == 'Y' || rep == 'y') {
						n = true;
						break;
					} else {
						n = false;
						break;
					}
				}
			} catch(Exception e) {
	        	System.out.println("Please select a valid operator!");
			}
		}
	}

}
