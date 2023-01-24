package day07;

import java.util.Comparator;

/**
 * Comparator Class for Student's id Field
 * 
 * @author michaelmiranda
 */
public class SortBySchool implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getSchool().compareTo(o2.getSchool());
	}

}
