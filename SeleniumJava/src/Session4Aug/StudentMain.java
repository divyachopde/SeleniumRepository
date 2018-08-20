package Session4Aug;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentMain {

	public static void main(String[] args) {
		Student s1 = new Student(20,"Ab",45,23,145);
		Student s2 = new Student(5,"Bb",20,44,123);
		Student s3 = new Student(30,"Fb",22,55,67);
		
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		System.out.println(studentList);
		
//		Collections.sort(studentList, Student.NameComparator);
//		Collections.reverse(studentList);
//		System.out.println(studentList);
        
		
		Collections.sort(studentList, Student.MathsComparator);
		System.out.println(studentList);
	}

}
