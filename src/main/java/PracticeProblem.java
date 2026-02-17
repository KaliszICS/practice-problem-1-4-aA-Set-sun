/*
	Lesson: Input
	Author: Angie
	Date Created: Feb 17, 2026
	Date Last Modified: Feb 17, 2026
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
		input.nextLine(); //clear the scanner of \n


	}

	public static void q2() {
		//Write question 2 code here
		//2. Ask the user to "Input a whole number: ". Take that number, multiply by 2 then add 2. Output the result.
		Scanner input = new Scanner (System.in);

		int num;
		System.out.print("Input a whole number: ");
		num = input.nextInt();
		System.out.print(num * 2 + 2);
		input.nextLine(); //clear the scanner of \n
	}

	public static void q3() {
		//Write question 3 code here
		//3. Ask the user to "Input a radius: " (can be not a whole number). 
		// Calculate the area of the circle with the given radius. Output the result on a different line.  Use 3.14 for the value of pi.

		Scanner input = new Scanner(System.in);
		double radius;
		System.out.print("Input a radius: ");


	}

	public static void q4() {
		//Write question 4 code here
		//4. Ask the user to "Input a first name: ", to "Input a last name: " and to "Input an age: ". Output them in the order of “Last name, first name – age”.
	}

	public static void q5() {
		//Write question 5 code here
		/* Ask the user "Input a name: " and store it in a String variable called _name_</br>
	Ask the user "Input an age: " and store it in  an integer variable called _age_</br>
	Create an integer variable called _iq_ and set it to the value of _age_</br>
	Increase age by 3.</br>
	</br>
	Output the value of name</br>
	Output the value of age without skipping a new line</br>
	Output the value of iq</br>
	*/

	}

}
