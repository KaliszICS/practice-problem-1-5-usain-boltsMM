/**
	* File: Lesson 1.5: Characters
	* Author: Mansoor Muhammad
	* Date Created: February 19, 2026
	* Date Last Modified: February 19, 2026
	*/

import java.util.Scanner;
public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
	}

	public static void q1() {
		char letter = 'a';
		System.out.println(letter);

	}

	public static void q2() {
		Scanner input = new Scanner(System.in);
		String word;
		System.out.print("Input a word: ");
		word = input.nextLine();
		char c = word.charAt(2);
		System.out.println(c);

	}

	public static void q3() {
		Scanner input = new Scanner(System.in);
		String wor;
		System.out.print("Input a word: ");
		wor = input.nextLine();
		char b = wor.charAt(1);
		System.out.println("The second character user entered was: "+ b);

	}

	public static void q4() {
		Scanner input = new Scanner(System.in);
		int num;
		System.out.print("Input a number: ");
		num = input.nextInt();
		System.out.println("Your number plus 1 is: " + (num+1));


	}

	public static void q5() {
		Scanner input = new Scanner(System.in);
		
		String lt;
		System.out.print("Input a letter: ");
		lt = input.nextLine();
		char lk = lt.charAt(0);
		
		
		String ltt;
		System.out.print("Input another letter: ");
		ltt = input.nextLine();
		char lkt = ltt.charAt(0);

		System.out.println(lk + lkt);


	}

}
