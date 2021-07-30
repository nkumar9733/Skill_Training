package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {

//		All the methods works with object not with stereotype
		Integer arr[] = { 11, 23, 32 };

//		Comparator and streams only works with Objects not with stereotype
		Arrays.sort(arr, Collections.reverseOrder());

		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(30);
		list.add(20);
		
		Collections.sort(list, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1 - o2;
			}
		});
		
		// this is general sort
		Collections.sort(list,(a,b)->a-b);
		System.out.println(list);

		// You can also use this but in this case comparator is compulsory
		list.sort((a,b)->a-b);
		System.out.println(list);

		for (int i : arr)
			System.out.println(i);
	}

}
