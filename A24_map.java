import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.Map;

public class A24_map {

    public static void main(String[] args) {

        // ==========================
        // 1. HashMap
        // ==========================
        Map<Integer, String> map = new HashMap<>();

        // ==========================
        // 2. put()
        // ==========================
        map.put(101, "John");
        map.put(102, "Alice");
        map.put(103, "Bob");
        map.put(104, "David");

        System.out.println("Map : " + map);

        // ==========================
        // 3. get()
        // ==========================
        System.out.println("ID 102 : "
                + map.get(102));

        // ==========================
        // 4. Update Value
        // ==========================
        map.put(102, "Emma");

        System.out.println("After Update : "
                + map);

        // ==========================
        // 5. containsKey()
        // ==========================
        System.out.println(
                "Contains Key 101 : "
                        + map.containsKey(101));

        // ==========================
        // 6. containsValue()
        // ==========================
        System.out.println(
                "Contains Value Bob : "
                        + map.containsValue("Bob"));

        // ==========================
        // 7. remove()
        // ==========================
        map.remove(104);

        System.out.println(
                "After Remove : "
                        + map);

        // ==========================
        // 8. size()
        // ==========================
        System.out.println(
                "Size : "
                        + map.size());

        // ==========================
        // 9. isEmpty()
        // ==========================
        System.out.println(
                "Is Empty : "
                        + map.isEmpty());

        // ==========================
        // 10. keySet()
        // ==========================
        System.out.println(
                "\nKeys");

        for (Integer key : map.keySet()) {
            System.out.println(key);
        }

        // ==========================
        // 11. values()
        // ==========================
        System.out.println(
                "\nValues");

        for (String value : map.values()) {
            System.out.println(value);
        }

        // ==========================
        // 12. entrySet()
        // ==========================
        System.out.println(
                "\nKey-Value Pairs");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {

            System.out.println(
                    entry.getKey()
                            + " -> "
                            + entry.getValue());
        }

        // ==========================
        // 13. getOrDefault()
        // ==========================
        System.out.println(
                "\nDefault Value : "
                        + map.getOrDefault(999,
                                "Not Found"));

        // ==========================
        // 14. putIfAbsent()
        // ==========================
        map.putIfAbsent(105, "Chris");

        System.out.println(
                "After putIfAbsent : "
                        + map);

        // ==========================
        // 15. replace()
        // ==========================
        map.replace(101, "Mike");

        System.out.println(
                "After Replace : "
                        + map);

        // ==========================
        // 16. Clear
        // ==========================
        Map<Integer, String> temp = new HashMap<>(map);

        temp.clear();

        System.out.println(
                "After Clear : "
                        + temp);

        // ==========================
        // 17. LinkedHashMap
        // Maintains Insertion Order
        // ==========================
        Map<Integer, String> linkedMap = new LinkedHashMap<>();

        linkedMap.put(3, "C");
        linkedMap.put(1, "A");
        linkedMap.put(2, "B");

        System.out.println(
                "\nLinkedHashMap : "
                        + linkedMap);

        // ==========================
        // 18. TreeMap
        // Sorted By Key
        // ==========================
        Map<Integer, String> treeMap = new TreeMap<>();

        treeMap.put(50, "Java");
        treeMap.put(10, "Python");
        treeMap.put(30, "Spring");

        System.out.println(
                "TreeMap : "
                        + treeMap);
    }
}