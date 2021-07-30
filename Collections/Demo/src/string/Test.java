package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {

    public static void checkMagazine(List<String> magazine, List<String> note) {

        // System.out.println(magazine.size());
        // int i = 0;
        // for (; i < note.size(); i++) {
            
        //     System.err.println(magazine);
        //     System.err.println(i);
        //     System.err.println(magazine.contains(note.get(i)));
        //     if(magazine.contains(note.get(i))){
        //         magazine.remove(note.get(i));
        //     }else
        //     {
        //         System.out.println("No");
        //         break;
        //     }
        // }
        // if(i==note.size())
        //     System.out.println("Yes");

        Map<String,Integer> map = new HashMap<>();
        for(String str: note){
            if(map.containsKey(str)){
                map.put(str, map.get(str)+1);
            }
            else
                map.put(str,1);
        }

        for(String s:magazine){
            if(map.containsKey(s)){
                map.put(s, map.get(s)-1);
            }
        }
        for(int i: map.values())
        {
            if(i!=0){
                System.out.println("No");
                return;
            }
            
        }
        System.out.println("Yes");

        System.out.println(map);
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("word", "at", "peace"));
        checkMagazine(list,new ArrayList<String>(Arrays.asList("word", "at", "peace")));
    }

}
