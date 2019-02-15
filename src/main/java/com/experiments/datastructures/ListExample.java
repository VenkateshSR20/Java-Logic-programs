package main.java.com.experiments.datastructures;

import java.util.ArrayList;
import java.util.List;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class ListExample {

	public static void main(String[] args){
		List list1 = new ArrayList();
		list1.add(0, 100);
		list1.add(1, 101);
		list1.add(2, 102);
		list1.add(3, 103);
		list1.add(4, 104);
		list1.add(5, 105);
		System.out.println("The values of List L1 are :"+list1);
		
		List list2 = new ArrayList();
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.add(4);
		list2.add(5);
		list2.add(6);
		System.out.println("The values of List L2 are :"+list2);
		
		list1.addAll(1, list2);
		System.out.println("Added elements :"+list1);
		
		list1.remove(1);
		System.out.println("Removed Element :"+list1);
		
		System.out.println(list1.get(3));
		
		list1.set(0, 5);
		System.out.println(list1);
	}	
}
