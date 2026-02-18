/*
	Lesson: Input
	Author: Angie
	Date Created: Feb 17, 2026
	Date Last Modified: Feb 18, 2026
	*/

	import java.util.Scanner; //scanner created
	
public class PracticeProblem {

	public static void main(String args[]) {

		q1();
		q2();
		q3();
		q4();
		q5();
	}

	public static void q1() {
		//Write question 1 code here
		//1. Ask the user to "What is your name: ". Output it back to them.
		
		Scanner input = new Scanner(System.in);
		//input is variable name

		String name;
		System.out.print("What is your name: ");
		name = input.nextLine();

		System.out.println(name);
		input.nextLine(); //clear the scanner


	}

	public static void q2() {
		//Write question 2 code here
		//2. Ask the user to "Input a whole number: ". Take that number, multiply by 2 then add 2. Output the result.
		Scanner input = new Scanner (System.in);

		int number;
		System.out.print("Input a whole number: ");
		number = input.nextInt();
		input.nextLine(); //scanner cleared
		System.out.println(number);


	}

	public static void q3() {
		//Write question 3 code here
		//3. Ask the user to "Input a radius: " (can be not a whole number). 
		// Calculate the area of the circle with the given radius. Output the result on a different line.  Use 3.14 for the value of pi.
		
		Scanner input = new Scanner (System.in);

		double num2;
		System.out.print("Input a radius: ");
		num2 = input.nextDouble();
		num2 = 3.14 * (num2 * num2);
		input.nextLine(); //clear scanner
		System.out.println(num2);

	
	}

	public static void q4() {
		//Write question 4 code here
		//4. Ask the user to "Input a first name: ", to "Input a last name: " and to "Input an age: ". Output them in the order of “Last name, first name – age”.
	
		Scanner input = new Scanner (System.in);
		String fname;
		String lname;
		int age;
	
		System.out.print("Input a first name: ");
		fname = input.nextLine();
	
		System.out.print("Input a last name: ");
		lname = input.nextLine();
	
		System.out.print("Input an age: ");
		age = input.nextInt();
	
		System.out.println(lname + "," + " " + fname + " - " + age);
		input.nextLine(); //clear scanner
		

	}

	public static void q5() {
		//Write question 5 code here
	/* Ask the user "Input a name: " and store it in a String variable called name
	Ask the user "Input an age: " and store it in  an integer variable called age
	Create an integer variable called _iq_ and set it to the value of _age_
	Increase age by 3.
	Output the value of name
	Output the value of age without skipping a new line
	Output the value of iq
	*/

	Scanner input = new Scanner(System.in);
	String name;
	System.out.print("Input a name: ");
	name = input.nextLine();

	int age;
	System.out.print("Input an age: ");
	age = input.nextInt();
	
	int iq;
	iq = age;
	age = age + 3;

	System.out.print(name);
	System.out.print(age);
	System.out.print(iq);
	input.nextLine(); //clear scanner


	}

}
