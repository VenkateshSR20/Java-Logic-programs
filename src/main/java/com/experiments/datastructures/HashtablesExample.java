package main.java.com.experiments.datastructures;

import java.util.Hashtable;
import java.util.Map;

//The HashMap class is roughly equivalent to Hashtable, except that it is non synchronized and permits nulls.

public class HashtablesExample {

	public static void main(String[] args){
		Hashtable<Integer, String> htable = new Hashtable<Integer, String>();
		
		htable.put(1, "venkatesh");
		htable.put(2, "sam");
		htable.put(3, "Ram");
		htable.put(4, "peter");
		htable.put(5, "victor");
		
		for(Map.Entry entry:htable.entrySet()){
			System.out.println("Key is : "+entry.getKey()+" "+entry.getValue());
		}
		
	}
}
