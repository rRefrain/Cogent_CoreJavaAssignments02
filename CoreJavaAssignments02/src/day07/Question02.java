package day07;

/**
 * Driver class to demonstrate use of HashMap()
 * 
 * @author : michaelmiranda
 * @date   : Jan 23, 2023
 */
public class Question02 {
	public static void main(String[] args) {
		StudentHash registry = new StudentHash();
		registry.setName(1, "Max", "Cogent" , "4222-Parker Ave", "July 1st 1999");
		registry.setName(2, "Ren", "Cogent" , "4222-Saiko Ave", "July 11st 1999");
		registry.setName(3, "Xia", "Cogent" , "4222-Geary Ave", "July 15th 1999");
		registry.setName(4, "Yuriya", "Cogent" , "4222-Downing Ave", "July 18th 1999");
		registry.setName(5, "Mark", "Cogent" , "4222-Dogen Ave", "July 21st 1999");
		
		System.out.println("Printing all students details with PERSONAL information:");
		registry.printNamesKeySet(true);
		
		System.out.printf("\nSize of Registry:");
		registry.printSize();
		
		System.out.println("\nOnly printing #3's basic information");
		registry.getName(3);
		
		System.out.println("\nDeleting #3 from Registry");
		registry.remove(3);
		
		System.out.println("\nOnly printing (non-existent) #3's basic information");
		registry.getName(3);
		
		System.out.println("Printing all students details:");
		registry.printNamesKeySet();
		
		System.out.printf("\nSize of Registry:");
		registry.printSize();
	}
}
