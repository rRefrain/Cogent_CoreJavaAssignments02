package day07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Consumer;

/**
 * Driver class to test the functionality of comparable interface in Student
 * 
 * @author michaelmiranda
 */
public class Question04 {
	public static void main(String [] args) {
		ArrayList<Student> registry = new ArrayList<Student>();
		registry.add(new Student(1, "Max", "Cogent" , "4222-Parker Ave", "July 1st 1999"));
		registry.add(new Student(2, "Ren", "Cogent" , "4222-Saiko Ave", "July 11st 1999"));
		registry.add(new Student(3, "Xia", "Cogent" , "4222-Geary Ave", "July 15th 1999"));
		registry.add(new Student(4, "Yuriya", "Cogent" , "4222-Downing Ave", "July 18th 1999"));
		registry.add(new Student(5, "Mark", "Cogent" , "4222-Dogen Ave", "July 21st 1999"));
		
		Consumer<ArrayList<Student> > dispList = (list) -> list.stream().forEach(s -> System.out.println(s.getInfo(true) + "\n"));
		
		System.out.println("Priniting registry before sort: ");
		dispList.accept(registry);
		
		Collections.sort(registry);
		
		System.out.println("\nPriniting registry after sort: ");
		dispList.accept(registry);
		
	}
}
