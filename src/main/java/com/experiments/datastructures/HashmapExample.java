package main.java.com.experiments.datastructures;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;

//The HashMap class is roughly equivalent to Hashtable, except that it is non synchronized and permits nulls.
//similar to this make it as Test annotation and make as test then only you can push to github
public class HashmapExample {
	
    //@Test
	public static void main(String[] args){
	 //HashmapExample(){
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		
		hmap.put(1001, "venkatesh");
		hmap.put(1002, "john");
		hmap.put(1003, "sam");
		hmap.put(1004, "victor");
		hmap.put(null, "");
		hmap.put(1005, "peter");
		
		Set set = hmap.entrySet();
		Iterator iterator = set.iterator();
		
		while(iterator.hasNext()){
			Map.Entry mentry = (Entry) iterator.next();
			System.out.println("Key is :"+mentry.getKey()+" "+"Value is :"+mentry.getValue());
		}
		
		
	}
	
}
