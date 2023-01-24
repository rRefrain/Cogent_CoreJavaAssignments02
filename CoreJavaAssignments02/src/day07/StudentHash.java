package day07;

import java.util.HashMap;
import java.util.Iterator;


/**
 * Class to hold a HashMap of students
 * 
 * @author : michaelmiranda
 * @date   : Jan 23, 2023
 */
public class StudentHash {
	
	/** ArrayList of Students - ID being the key */
	private final HashMap<Integer, Student> registry = new HashMap<>();
	
	
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
	public void setName(int id, String name, 
			String school, String homeAddress, String DOB) {
		registry.put(id, new Student(id, name.trim(), school.trim(), homeAddress.trim(), DOB.trim()));
	}
	
	
	/**
	 * Function to print the details of a single student
	 * via RollNo Lookup
	 * 
	 * @param rollNo the Student's roll number to look up through registry
	 * @param privateDetails flag to print allow a student's private detail
	 */
	public void getName(int rollNo, boolean privateDetails) {
		printDetails(registry.get(rollNo),privateDetails);
	}
	
	
	/**
	 * Function to print the details of a single student
	 * via RollNo Lookup
	 * 
	 * @param rollNo the Student's roll number to look up through registry
	 * @see getName(int, boolean)
	 */
	public void getName(int rollNo) {
		getName(rollNo,  false);
	}
	
	
	/**
	 * Functino to print the size of registry to console
	 */
	public void printSize() {
		System.out.println(getSize());
	}
	
	/**
	 * Function to get the size of the registry
	 * @return size of the registry
	 */
	public int getSize() {
		return registry.size();
	}
	
	/**
	 * Function to delete the records of a signle student 
	 * via RollNo lookup
	 * 
	 * @param rollNo the Student's roll number to look up through registry
	 */
	public void remove(int rollNo) {
		registry.remove(rollNo);
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
	 * @see printDetails (boolean)
	 * @param privateDetails flag to print allow a student's private detail
	 */
	public void printNamesKeySet(boolean privateDetails) {
		Iterator<Integer> iterator = registry.keySet().iterator();
		while (iterator.hasNext()) {
			printDetails(registry.get(iterator.next()), privateDetails);
		}
	}
	
	
	/**
	 * Function to print the details of all students in registry
	 * 
	 * @see printNamesKeySet(boolean)
	 * @param privateDetails flag to print allow a student's private detail
	 */
	public void printNamesKeySet() {
		printNamesKeySet(false);
	}
}
