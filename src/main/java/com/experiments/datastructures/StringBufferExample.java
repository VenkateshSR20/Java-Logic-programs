package main.java.com.experiments.datastructures;

/**
 * String Buffer: It is synchronized only one thread can access the stringBuffer at a time, other threads
 * should have to wait. Performance is not good and not recommended to use, but thread safety is there good.
 * 
 * String Builder: If we want performance go for string builder came at 1.5version, in string builder no method
 * is synchronized(not-synchronized), any number of thread can access at same time
 * 
 * *No. String StringBuffer
 * 1. String class is immutable, StringBuffer class is mutable
 * 2. String is slow and consumes more memory when you concat too many strings because everytime it creates new instance, 
 *    StringBuffer is fast and consumes less memory when you concat strings.
 * 3. String class overrides the equal() method of Object class. So you can compare the contents of two strings by equals() method. 
 *    StringBuffer class doesn't override the equals() method of Object class
 *
 */

public class StringBufferExample {

	public static void main(String[] main){
		StringBuffer sb = new StringBuffer();
		sb.append("hello");
		System.out.println("The value is :"+sb);
		System.out.println("Insert : "+sb.insert(5, "Java"));
		System.out.println("Replace : "+sb.replace(8, 13, "welcome"));
		System.out.println("Delete : "+sb.delete(9, 16));
		System.out.println("Reverse : "+sb.reverse());
		System.out.println("Capacity : "+sb.capacity());
		sb.ensureCapacity(50);
		System.out.println("ensure capacity  :"+sb.capacity());
	}
}
