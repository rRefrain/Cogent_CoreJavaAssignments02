/**
 * 
 */
package day07;

/**
 * Class to hold various data about a student
 * 
 * @author : michaelmiranda
 * @date   : Jan 23, 2023
 */
public class Student {
	/** Student's ID */
	private final int id;
	
	/** Student's name */
	private String name;
	
	/** Student's school name */
	private String school;
	
	/** Student's home address */
	private String homeAddress;
	
	/** Student's Date-Of-Birth */
	private String DOB;
	
	/**
	 * Constructor
	 * 
	 * @param id the Student's ID
	 * @param name the Student's name
	 * @param school the name of the Student's school
	 * @param homeAddress the address of the Student's home
	 * @param DOB the Date-Of-Birht of the Student
	 */
	public Student(int id, String name, String school, String homeAddress, String DOB) {
		super();
		this.id = id;
		this.name = name;
		this.school = school;
		this.homeAddress = homeAddress;
		this.DOB = DOB;
	}
	
	/**
	 * Constructor to create a "blank" student with 
	 * with a set name, as this class has an overriden equals method
	 * comparing only the Student name
	 * 
	 * Used for index search ups (ArrayList#indexOf(new Student(name)))
	 * @param name the Student's name
	 */
	public Student(String name) {
		this.id = -1;
		this.name = name;
	}
	
	/**
	 * Function to print out student details
	 * 
	 * @see getInfo(boolean)
	 * @param privateDetails flag to print allow a student's private detail
	 */
	public void printInfo(boolean privateDetails) {
		System.out.println(getInfo(privateDetails));
	}

	/**
	 * Function to create a String for private Details
	 * 
	 * @param privateDetails flag to print allow a student's private detail
	 * @return String of a Student's information, details based off privateDetails
	 */
	public String getInfo(boolean privateDetails) {
		String str = "Student: " + name + " ID: " + id + " School: " + school;
		if (privateDetails) {
			str += "\nHome Adress: " + homeAddress + " DOB: " + DOB;
		}
		return str;
	}
	
	
	
	@Override
	public boolean equals(Object o) { 
        /* Check if o is an instance of Student or not
          null instanceof Student also returns false */
        if (!(o instanceof Student)) {
            return false;
        }
         
        /*  type cast to Student */
        Student s = (Student) o;
                
        /* Compare by name */
        return this.name.equals(s.name);
  
    }
	
}
