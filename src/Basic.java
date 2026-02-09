import java.util.Scanner;

public class Basic {
	
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter 1st number:");
		int num1 = input.nextInt();
		System.out.println("Enter 2nd number:");
		int num2 = input.nextInt();
		
		Basic Cal = new Basic();
		int res = Cal.calculator(num1, num2);
		
		System.out.println(res);
		
		System.out.println(num1+num2);
		System.out.println(num1/num2);
		
		if(num1 == num2) {
			System.out.println("Equal");
		}
		
		input.close();
	}
	public int calculator(int num1, int num2) {
		int result = num1%num2;
		return result;
	}
}
