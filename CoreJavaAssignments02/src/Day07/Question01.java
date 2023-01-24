/**
 * 
 */
package Day07;

/**
 * Driver class to demonstrate use of ArrayList()
 * 
 * @author : michaelmiranda
 * @date   : Jan 23, 2023
 */
public class Question01 {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		StudentList registry = new StudentList();
		registry.setStudent(1, "Max", "Cogent" , "4222-Parker Ave", "July 1st 1999");
		registry.setStudent(2, "Ren", "Cogent" , "4222-Saiko Ave", "July 11st 1999");
		registry.setStudent(3, "Xia", "Cogent" , "4222-Geary Ave", "July 15th 1999");
		registry.setStudent(4, "Yuriya", "Cogent" , "4222-Downing Ave", "July 18th 1999");
		registry.setStudent(5, "Mark", "Cogent" , "4222-Dogen Ave", "July 21st 1999");
		
		System.out.println("\n\nPrinting entire Registers details");
		registry.printAllDetails(true);
		
		System.out.println("\nFinding Max's basic Details");
		registry.searchName("Max", false);
		
		System.out.println("\nFinding all of Mark's Details");
		registry.searchName("Mark", true);
		
		System.out.println("Deleting Mark");
		registry.removeName("Mark");
		
		System.out.println("Deleting (non-existent) Mark Again");
		registry.removeName("Mark");
		
		System.out.println("\nFinding all of (non-existent) Mark's Details");
		registry.searchName("Mark", true);
		
		System.out.println("\nFinding all of (registery index #) 2's details");
		registry.searchName(2, true);
		
		System.out.println("Deleting (registery index #) 2");
		registry.removeName(2);
		
		System.out.println("\nFinding all of (registery index #) 2's details");
		registry.searchName(2, true);
		
		System.out.println("\n\nPrinting entire Registers details");
		registry.printAllDetails(true);
		
	}
}
