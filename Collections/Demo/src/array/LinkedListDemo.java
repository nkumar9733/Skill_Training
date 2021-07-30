package array;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {

		List<Integer> list = new LinkedList<>();

		list.addAll(Arrays.asList(11, 12, 13, 14, 15, 16, 17, 18));

		System.out.println(list);
		list.remove(0);

		list.remove(list.size() - 1);
		System.out.println(list);

		list.remove(0);
		list.remove(list.size() - 1);
		System.out.println(list);

		// You can also use this but in this case comparator is compulsory
		list.sort((a, b) -> a - b);
		System.out.println(list);
	}

}
