package array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                list.add(sc.nextInt());
            }
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    int temp = (list.get(j) & list.get(k)) ^ ((list.get(j)) | list.get(k));
                    if (temp < min) {
                        min = temp;
                    }
                }
                // System.out.println(temp);
            }
            System.out.println(min);
        }
        sc.close();
    }
}
