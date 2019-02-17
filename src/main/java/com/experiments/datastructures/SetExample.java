package main.java.com.experiments.datastructures;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args){
		Set<String> hash_set = new HashSet<String>();
		hash_set.add("This");
		hash_set.add("is");
		hash_set.add("Canadian");
		hash_set.add("Software");
		hash_set.add("Consulting");
		hash_set.add("Canadian");
		hash_set.add("Company");
		System.out.println("Set Output without the duplicated :" +hash_set);
		
		System.out.println(" ");
		Set<String> tree_set = new TreeSet<String>(hash_set);
		System.out.println("Sorted set after passing into TreeSet :" +tree_set);
	}
}
