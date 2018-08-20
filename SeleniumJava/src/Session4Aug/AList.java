package Session4Aug;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list1 = new ArrayList<Integer>();

		list1.add(11);
		list1.add(44);
		list1.add(33);
		list1.add(55);

		Collections.sort(list1);

		System.out.println(list1);

		List<Integer> list2 = new ArrayList<Integer>();
		list2.addAll(list1);//added list1 to list2
		list2.add(66);
		System.out.println(list2);

	}

}
