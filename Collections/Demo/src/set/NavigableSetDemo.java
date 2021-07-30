package set;

import java.util.TreeSet;

public class NavigableSetDemo {
	

	public static void main(String[] args) {

		TreeSet<Integer> s = new TreeSet<>();

		s.add(20);
		s.add(10);
		s.add(5);
		s.add(30);
		s.add(40);
		s.add(50);
		s.add(60);

		System.out.println(s);
		
		//the lowest number greater or equal to 10		
		System.out.println(s.ceiling(10));
//		the lowest number greater than 10
		System.out.println(s.higher(10));
//		the highest number lesser or equal to 30
		System.out.println(s.floor(30));
//		the highest number less than 30
		System.out.println(s.lower(30));
//		Delete and return first element
		System.out.println(s.pollFirst());
//		Delete and return last element
		System.out.println(s.pollLast());
		System.out.println(s);
//		Delete and return boolean of specified obj
		System.out.println(s.remove(10));
//		return set in descending order
		System.out.println(s.descendingSet());
		
		
	}

}
