package ua.skorobahatyi.help_for_collections;

import java.util.*;

/**
 * https://www.youtube.com/watch?v=LTJpKChCNSA&list=PLxqzxxW1gWwJvVK11R_lJKAlP_9m3Gu2H&index=4
 * */
public class SortedValueInHashMap {
    public static void main(String[] args) {
        Map<String,Integer> nonSortedMap = Map.of(
                "Two",2,
                "Three",3,
                "Five",5,
                "One",1,
                "Four",4
        );
       //Map<String,Integer> sortedMap = sortedByValue(nonSortedMap); // MyCode
       Map<String,Integer> sortedMap = sortedByValueBetterSolution(nonSortedMap);   // tips
        sortedMap.entrySet().forEach(System.out::println);

        System.out.println("=================================");
        // Nice good
        nonSortedMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);
    }

    private static Map<String, Integer> sortedByValueBetterSolution(Map<String, Integer> nonSortedMap) {
        SortedMap<String,Integer> temp = new TreeMap<>(new MyComparator(nonSortedMap));
        temp.putAll(nonSortedMap);
        return temp;
    }

    private static class MyComparator implements Comparator<String>{
        private Map<String,Integer> map;

        public MyComparator(Map<String, Integer> map) {
            this.map = map;
        }

        @Override
        public int compare(String o1, String o2) {
            return map.get(o1)-map.get(o2);
        }
    }
    private static Map<String, Integer> sortedByValue(Map<String, Integer> nonSortedMap) {
        SortedMap<Integer,String> sort1 = new TreeMap<>();

        for (String key : nonSortedMap.keySet()) {
            sort1.put(nonSortedMap.get(key),key);
        }

        Map<String,Integer> sort = new LinkedHashMap<>();

        for (Integer key : sort1.keySet()) {
            sort.put(sort1.get(key),key);
        }

        return sort;
    }
}
