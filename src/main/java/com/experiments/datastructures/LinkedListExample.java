package main.java.com.experiments.datastructures;

import java.util.*;

public class LinkedListExample {

	public static void main(String[] args){
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("Java");
		linkedList.add("C++");
		linkedList.add("Python");
		linkedList.add("Android");
		System.out.println("Linked list values:"+linkedList);
		
		linkedList.addFirst("First Item");
		linkedList.addLast("Last Item");
		System.out.println("LinkedList content after addition: "+linkedList);
		
		Object firstvar = linkedList.get(0);
		System.out.println("First element: "+firstvar);
		linkedList.set(0, "Changed first item");
		Object firstvar2 = linkedList.get(0);
		System.out.println("First element after update by set method: "+firstvar2);
		
		linkedList.removeFirst();
		linkedList.removeLast();
		System.out.println("LinkedList after deletion of first and last element:");
		
		linkedList.add(0, "Newly added item");
		linkedList.remove(2);
		System.out.println("Final Content: " +linkedList);
	}
}
