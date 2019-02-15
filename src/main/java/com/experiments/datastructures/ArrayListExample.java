package main.java.com.experiments.datastructures;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args){
		ArrayList<String> employee = new ArrayList<String>();
		
		employee.add("Venkatesh");
		employee.add("Rahul");
		employee.add("John");
		employee.add("victor");
		employee.add("sam");
		
		Iterator iterator = employee.iterator();
		while(iterator.hasNext()){
			System.out.println("Employee List: " +iterator.next());
		}
	}
}
