
import java.util.Scanner;

public class Arithmetic {

	public void calculate(char operator,double a,double b) {
		double answer=0;
		switch (operator) {
		case '+':
			 answer = a+b;
			break;
		case '-':
			answer = a-b;
			break;
		case '*':
			answer = a*b;
			break;
		case '/':
			answer = a/b;
			break;
			default:
			break;
		}
		System.out.println("Answer is "+answer);
		
	}
	
	
	public static void main(String[] args) {
		
		double a,b;
		
		char c;
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Please Enter the first number");
		
		a = s.nextDouble();
		
		System.out.println("Please Enter the second number");
		
		b = s.nextDouble();
		
		System.out.println("Operator + - * / ");
		
		System.out.println("Please Enter an operator");
		
		c= s.next().charAt(0);
		
		Arithmetic obj = new Arithmetic();
		
		obj.calculate(c, a, b);
		
	}
	
}
