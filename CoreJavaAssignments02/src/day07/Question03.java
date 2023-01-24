package day07;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * Driver class to test the functionality of TreeSet
 * @author michaelmiranda
 */
public class Question03 {
	public static void main(String[] args) {
		TreeSet<String> products = null;
		printTreeSet(products);
		
		System.out.println("Initilized TreeSet");
		products =	new TreeSet<>();
		printTreeSet(products);
		
		add(products, "ramen");
		add(products, "katsu");
		add(products, "okonomiyaki");
		add(products, "okonomiyaki");
		add(products, "latte");
		add(products, "mocha");
		add(products, "curry");
		
		System.out.println("\nPrinting all products: ");
		printTreeSet(products);
		
		System.out.println("\nSize of Set: " + products.size());
		
		System.out.println("\nDeleteing curry");
		remove(products, "curry");
		
		System.out.println("\nDeleteing curry");
		remove(products, "curry");
		
		System.out.println("\nPrinting all products: ");
		printTreeSet(products);
		
		System.out.println("\nSize of Set: " + products.size());
		
		System.out.println("\nFirst item in Set: " + products.first());
		System.out.println("\nLast item in Set: " + products.last());
		
	}
	
	/**
	 * Function to print all the elements in a given TreeSet<String>
	 * @param products the TreeSet to print
	 */
	private static void printTreeSet(TreeSet<String> products) {
		System.out.println("Products Set:");
		
		if (products == null || products.isEmpty()) {
			System.out.println("is Empty!");
			return;
		}
		
		Iterator<String> it = products.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	/**
	 * Function to add a element to a TreeSet
	 * 
	 * Will notify if element is Null or element is not found via println()
	 * @param products the TreeSet to append
	 * @param newProduct the product to add
	 */
	private static void add(TreeSet<String> products, String newProduct) {	
		try {
			if (!products.add(newProduct)) {
				System.out.println("Duplicate Not Added: " + newProduct);
			} else {
				System.out.println("Successfully Added: " + newProduct);
			}
		} catch (NullPointerException e) {
			System.out.println("Null Element!");
		}
	}
	
	/**
	 * Function to remove a element to a TreeSet
	 * 
	 * Will notify if element is Null or element is not found via println()
	 * @param products the TreeSet to append
	 * @param product the Element to remove
	 */
	private static void remove(TreeSet<String> products, String product) {	
		try {
			if (!products.remove(product)) {
				System.out.println("Not Found " + product);
			} else {
				System.out.println("Successfully Deleted: " + product);
			}
		} catch (NullPointerException e) {
			System.out.println("Null Element!");
		}
	}
}
