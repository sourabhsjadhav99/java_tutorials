import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;

public class A22_arrayList {

    public static void main(String[] args) {

        // ==========================
        // 1. Create List
        // ==========================
        List<String> list = new ArrayList<>();

        // ==========================
        // 2. Add Elements
        // ==========================
        list.add("Java");
        list.add("Python");
        list.add("Spring");
        list.add("React");

        System.out.println("List : " + list);

        // ==========================
        // 3. Add at Index
        // ==========================
        list.add(1, "SQL");
        System.out.println("After Insert : " + list);

        // ==========================
        // 4. Get Element
        // ==========================
        System.out.println("Element at index 2 : " + list.get(2));

        // ==========================
        // 5. Update Element
        // ==========================
        list.set(2, "JavaScript");
        System.out.println("After Update : " + list);

        // ==========================
        // 6. Remove by Index
        // ==========================
        list.remove(3);
        System.out.println("After Remove Index : " + list);

        // ==========================
        // 7. Remove by Object
        // ==========================
        list.remove("SQL");
        System.out.println("After Remove Object : " + list);

        // ==========================
        // 8. Contains
        // ==========================
        System.out.println("Contains Java? "
                + list.contains("Java"));

        // ==========================
        // 9. Index Of
        // ==========================
        System.out.println("Index Of React : "
                + list.indexOf("React"));

        // ==========================
        // 10. Size
        // ==========================
        System.out.println("Size : "
                + list.size());

        // ==========================
        // 11. isEmpty
        // ==========================
        System.out.println("Is Empty : "
                + list.isEmpty());

        // ==========================
        // 12. For Loop
        // ==========================
        System.out.println("\nFor Loop");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // ==========================
        // 13. Enhanced For Loop
        // ==========================
        System.out.println("\nFor Each");

        for (String s : list) {
            System.out.println(s);
        }

        // ==========================
        // 14. Iterator
        // ==========================
        System.out.println("\nIterator");

        Iterator<String> itr = list.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // ==========================
        // 15. AddAll
        // ==========================
        List<String> list2 = new ArrayList<>();

        list2.add("HTML");
        list2.add("CSS");

        list.addAll(list2);

        System.out.println("\nAfter addAll : " + list);

        // ==========================
        // 16. RemoveAll
        // ==========================
        list.removeAll(list2);

        System.out.println("After removeAll : " + list);

        // ==========================
        // 17. Clear
        // ==========================
        List<String> temp = new ArrayList<>(list);

        temp.clear();

        System.out.println("After Clear : " + temp);

        // ==========================
        // 18. Replace Implementation
        // ==========================
        List<String> linkedList = new LinkedList<>();

        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");

        System.out.println("\nLinkedList via List : "
                + linkedList);

        // ==========================
        // 19. List of Integers
        // ==========================
        List<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println("Numbers : " + numbers);

        // ==========================
        // 20. Convert to Array
        // ==========================
        Object[] arr = list.toArray();

        System.out.println("Array Length : "
                + arr.length);
    }
}