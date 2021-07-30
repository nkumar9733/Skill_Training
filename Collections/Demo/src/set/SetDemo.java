package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {

        Random random = new Random();

        // This stores the value in random order. 
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < 10; i++) {
            set.add(random.nextInt(10));
        }
        System.out.println(set);

        // LinkedHashSet maintains the order.
        Set<Integer> lset = new LinkedHashSet<Integer>();
        for (int i = 0; i < 10; i++) {
            int temp = random.nextInt(10);
            // System.out.println(temp);
            lset.add(temp);
        }
        System.out.println(lset);

        // It stores the value in sorted order.
        Set<Integer> tset = new TreeSet<Integer>();
        for (int i = 0; i < 10; i++) {
            int temp = random.nextInt(10);
            // System.out.println(temp);
            tset.add(temp);
        }
        System.out.println(tset);

    }
}
