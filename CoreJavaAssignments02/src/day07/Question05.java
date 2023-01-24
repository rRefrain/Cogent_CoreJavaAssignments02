package day07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Consumer;

/**
 * Driver class to test the functionality of Comparator interface for Collections.sort
 * 
 * @author michaelmiranda
 */
public class Question05 {
	public static void main(String[] args) {
		ArrayList<Student> registry = new ArrayList<Student>();
		registry.add(new Student(44, "Max", "Eogent" , "Azzz 4222-Parker Ave", "July 1st 1999"));
		registry.add(new Student(2, "Ren", "Cogent" , "Bzzz 4222-Saiko Ave", "July 11st 1999"));
		registry.add(new Student(76, "Xia", "Bogent" , "Dzzzz 4222-Geary Ave", "July 15th 1999"));
		registry.add(new Student(4, "Yuriya", "Aogent" , "Czzz 4222-Downing Ave", "July 18th 1999"));
		registry.add(new Student(9, "Mark", "Dogent" , "Ezzz 4222-Dogen Ave", "July 21st 1999"));
		
		Consumer<ArrayList<Student> > dispList = (list) -> list.stream().forEach(s -> System.out.println(s.getInfo(true) + "\n"));
		
		System.out.println("Printing registry before sort: ");
		dispList.accept(registry);
		
		Collections.sort(registry, new SortByID());
		System.out.println("\nSort by ID: ");
		dispList.accept(registry);
		
		Collections.sort(registry, new SortBySchool());
		System.out.println("\nSort by School: ");
		dispList.accept(registry);
		
		Collections.sort(registry, new SortByAddress());
		System.out.println("\nSort by Address: ");
		dispList.accept(registry);
		
		
	}
	
}
