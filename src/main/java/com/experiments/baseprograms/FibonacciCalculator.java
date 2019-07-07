package main.java.com.experiments.baseprograms;

import java.util.Scanner;

public class FibonacciCalculator {

		public static void main(String[] args){
			
			System.out.println("Enter number upto which Fibonacci series to print::");
			int number = new Scanner(System.in).nextInt();
			
			System.out.println("Fibonacci series upto "+ number +" numbers : ");
			for(int i=1; i <=number ; i++){
				System.out.println(fibonacci2(i) + " ");
			}
		}

		private static int fibonacci2(int i) {
			if(i<=1){
				return 1;
			}else{
				return fibonacci2(i-1) + fibonacci2(i-2);
		}
		}
}
