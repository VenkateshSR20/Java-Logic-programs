package main.java.com.experiments.baseprograms;

import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args){
		String original, reverse="";
		int length;
		System.out.println("Enter the string to find pallindrome/not");
		
		Scanner input = new Scanner(System.in);
		original = input.nextLine();
		length = original.length();
		
		for(int i = length-1 ; i >= 0; i--)
			reverse = reverse + original.charAt(i);
		if(original.equals(reverse))
			System.out.println("The string is a pallindrome");
		else 
			System.out.println("The string is not a pallindrome");
	}
}
