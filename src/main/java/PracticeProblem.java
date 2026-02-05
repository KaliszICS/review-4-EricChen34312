import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();		
	}

	public static void q1() {
		//Write question 1 code here
		//Initiate scanner
		Scanner sc = new Scanner(System.in);

		//get string
		System.out.print("Input an integer: ");
		String str = sc.nextLine();
		
		//add 5 before str and convert string to int
		str = '5' + str;
		int x = Integer.parseInt(str);

		// print new integer
		System.out.println(x+5);
	}

	public static void q2() {
		//Write question 2 code here
		//Initiate scanner
		Scanner sc = new Scanner(System.in);

		//get string
		System.out.print("Input a number: ");
		String str = sc.nextLine();
		
		//concat 4 and 3
		str = '4' + str + '3';

		//convert to double
		double d = Double.parseDouble(str);

		//print double + 3.4
		System.out.println(d + 3.4);
	}

	public static void q3() {
		//Write question 3 code here
		//Initiate scanner
		Scanner sc = new Scanner(System.in);

		//get string
		System.out.print("Input a boolean: ");
		String str = sc.nextLine();

		//convert str to bool
		boolean bool = Boolean.parseBoolean(str);

		//Print the opposite of bool
		System.out.println(!bool);
	}

	public static void q4() {
		//Write question 4 code here
		//Initiate scanner
		Scanner sc = new Scanner(System.in);

		//get string
		System.out.print("Input an integer: ");
		String str = sc.nextLine();

		//concat 3 
		str += '3';
		//convert to int and add 2
		int x = Integer.parseInt(str) + 2;
		//convert to char
		char c = (char) x;
		//print
		System.out.println(c);	
	}

	public static void q5() {
		//Write question 5 code here
		//Initiate scanner
		Scanner sc = new Scanner(System.in);

		//get string
		System.out.print("Input an integer: ");
		String str = sc.nextLine();

		//concat 1
		str += '1';
		//convert to int and divide by 2
		int x = Integer.parseInt(str) / 2;
		//convert to double 
		double d = (double) x;
		//print d 
		System.out.println(d);
	}

	public static void q6() {
		//Write question 6 code here
		//Initiate scanner
		Scanner sc = new Scanner(System.in);

		//get string
		System.out.print("Input a number: ");
		String str = sc.nextLine();

		//concat 1
		str = '1' + str;
		//convert to double
		double d = Double.parseDouble(str);
		//convert back to integer
		int x = (int) d;
		//print x
		System.out.println(x);

	}

}
