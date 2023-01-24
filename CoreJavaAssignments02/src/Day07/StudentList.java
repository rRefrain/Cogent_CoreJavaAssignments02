/**
 * 
 */
package Day07;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Class to hold a list of students
 * 
 * @author : michaelmiranda
 * @date   : Jan 23, 2023
 */
public class StudentList {
	
	/** ArrayList of students */
	private final ArrayList<Student> registry = new ArrayList<Student>();
	
	
	/**
	 * Function to populate registry
	 * 
	 * @param id the student's id
	 * @param name the student's name
	 * @param school the name of the school the student is attending
	 * @param homeAddress the student's home address
	 * @param DOB the student's Date of Birth
	 * 
	 * @see Student#Student(int, String, String, String, String)
	 */
	public void setStudent(int id, String name, 
			String school, String homeAddress, String DOB) {
		registry.add(new Student(id, name, school, homeAddress, DOB));
	}
	
	/**
	 * Function that will search for Student by name 
	 * and print student details
	 * 
	 * @param name the student name to find
	 * @param privateDetails flag to print allow a student's private detail
	 * @see getStudent(String)
	 * @see printDetails(Student, boolean)
	 */
	public void searchName(String name, boolean privateDetails) {
		printDetails(getStudent(name), privateDetails);
	}

	/** 
	 * No-Practical usage, only for exercise 
	 * 
	 * Function that will search for Student by index
	 * then will print student details for Student
	 * 
	 * @param index the index of the registery to lookup
	 * @param privateDetails flag to print allow a student's private detail
	 * @see getStudent(int)
	 * @see printDetails(Student, boolean)
	 */
	@Deprecated
	public void searchName(int index, boolean privateDetails) {
		printDetails(getStudent(index), privateDetails);
	}
	
	/**
	 * Function to get the Student object from the registry
	 * using the Student's name
	 * 
	 * @param name the Student's name to find
	 * @see getIndex(name)
	 * @see getStudent(int)
	 * @return a Student if found in registry or a NULL if not found
	 */
	private Student getStudent(String name) {
		int i = getIndex(name);
		if (i == -1) {
			return null;
		}
		return getStudent(i);
	}
	
	/**
	 * Function to get the Student object from the registry
	 * using the registys index 
	 * 
	 * Will notify if student will not found with println()
	 * 
	 * @param index the Index to search in the registry
	 * @return a Student if found in registry or a NULL if not found
	 */
	private Student getStudent(int index) {
		try {
			return registry.get(index);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Index out of Bounds");
			return null;
		}
			
	}
	
	/**
	 * Function to find the index of the Student's name in registry
	 * 
	 * @param name the name to search for in registry
	 * @return the index of name in registry or -1 if not found
	 */
	private int getIndex(String name) {
		return registry.indexOf(new Student(name));
	}
	
	/**
	 * Function to remove a student from registry
	 * via name lookup
	 * 
	 * @see removeName(int)
	 * @see getIndex(String)
	 * @param name the Student's name to lookup
	 * @return true if removal was success 
	 * 		or false if removal name was not found
	 */
	public boolean removeName(String name) {
		return removeName(getIndex(name));
	}
	
	/**
	 * Function to remove a student from registry
	 * via index removal
	 * 
	 * Will notify if index if invalid with a println()
	 * 
	 * @param index the index to delete
	 */
	public boolean removeName(int index) {
		try {
			registry.remove(index);
			return true;
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Index out of Bounds");
			return false;
		}
	}
	
	
	/**
	 * Function to print the details of a single student
	 * 
	 * Will Notify if Student is null with println()
	 * 
	 * @param s the student to print details from
	 * @param privateDetails flag to print allow a student's private detail
	 */
	public void printDetails(Student s, boolean privateDetails) {
		try {
			s.printInfo(privateDetails);
		} catch (NullPointerException e) {
			System.out.println("Student not found!");
		}
		
	}
	
	/**
	 * Function to print the details of all students in registry
	 * 
	 * @see printDetails boolean privateDetails)
	 * @param privateDetails flag to print allow a student's private detail
	 */
	public void printAllDetails(boolean privateDetails) {
		Iterator<Student> iterator = registry.iterator();
		while (iterator.hasNext()) {
			printDetails(iterator.next(), privateDetails);
		}
	}
}
