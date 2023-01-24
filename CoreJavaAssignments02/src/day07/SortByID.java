package day07;

import java.util.Comparator;


/**
 * Comparator Class for Student's id Field
 * 
 * @author michaelmiranda
 */
public class SortByID implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getId() - o2.getId();
	}

}
