import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
       /* set.add(645);
        set.add(567);
        set.add(33);
        set.add(45);
        set.add(100);
        set.add(22);
        set.add(34);
        set.add(10);
        set.add(5);
        set.add(6); */


        while (set.size() < 10) {
            set.add((int) (Math.random() * 100));
        }

        Map<Integer, Integer> map = new HashMap<>();
        map.put(34, 43);
        map.put(9, 87);
        map.put(21, 12);
        map.put(5, 4);
        map.put(98, 66);
        System.out.println(convert(set, map));
    }

    public static Map<Integer, Integer> convert(Set<Integer> set, Map<Integer, Integer> map) {
        Map<Integer, Integer> result = new HashMap<>();
        List<Integer> listKey = new ArrayList<>();
        List<Integer> listValue = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) { //что происходит в этой строчке
            listValue.add(entry.getKey());
            listValue.add(entry.getValue());
        }
        for (Integer i : set) {
            listKey.add(i);
        }

        for (int i = 0; i < listValue.size(); i++) {
            result.put(listKey.get(i), listValue.get(i));
        }
        return result;
    }
}