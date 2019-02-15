package main.java.com.experiments.datastructures;

/**
 * String Buffer: It is synchronized only one thread can access the stringBuffer at a time, other threads
 * should have to wait. Performance is not good and not recommended to use, but thread safety is there good.
 * 
 * String Builder: If we want performance go for string builder came at 1.5version, in string builder no method
 * is synchronized(not-synchronized), any number of thread can access at same time
 * 
 */

public class StringBuilderExample {

	public static void main(String[] args){
		StringBuilder sb = new StringBuilder();
		sb.append("Hello");
		System.out.println("String Builder append:"+sb);
		sb.insert(5, "Java");
		System.out.println("Insert : "+sb);
		sb.replace(1, 3, "java");
		System.out.println("Replace : "+sb);
		sb.delete(1, 3);
		System.out.println("Delete : "+sb);
		sb.reverse();
		System.out.println("Reverse : "+sb);
		System.out.println("Capacity : "+sb.capacity());
		sb.ensureCapacity(50);
		System.out.println("Ensure Capacity :"+sb.capacity());
	}
}
