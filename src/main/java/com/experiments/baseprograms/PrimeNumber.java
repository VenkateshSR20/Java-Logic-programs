package main.java.com.experiments.baseprograms;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args){
		System.out.println("Enter the prime number");
		Scanner input = new Scanner(System.in);
		int value = input.nextInt();
		int i, m=0, flag=0;
	    m=value/2;
	    
		if(value == 0  || value == 1){
			System.out.println(value+"is not a prime-number");
		}else{
			for(i=2; i<=m; i++){
				if(value % i==0){
					System.out.println(value+"is not a prime-number");
					flag = 1;
					break;
				}
			}
			if(flag == 0){
				System.out.println(value+"It is a prime-number");
			}
		}
	}
	
}
