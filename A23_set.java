import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.Set;

public class A23_set {

    public static void main(String[] args) {

        // ==========================
        // 1. HashSet
        // ==========================
        Set<String> set = new HashSet<>();

        set.add("Java");
        set.add("Python");
        set.add("Spring");
        set.add("Java"); // Duplicate

        System.out.println("HashSet : " + set);

        // ==========================
        // 2. Size
        // ==========================
        System.out.println("Size : " + set.size());

        // ==========================
        // 3. Contains
        // ==========================
        System.out.println("Contains Java : "
                + set.contains("Java"));

        // ==========================
        // 4. Remove
        // ==========================
        set.remove("Python");

        System.out.println("After Remove : " + set);

        // ==========================
        // 5. isEmpty
        // ==========================
        System.out.println("Is Empty : "
                + set.isEmpty());

        // ==========================
        // 6. For Each Loop
        // ==========================
        System.out.println("\nFor Each");

        for (String s : set) {
            System.out.println(s);
        }

        // ==========================
        // 7. Iterator
        // ==========================
        System.out.println("\nIterator");

        Iterator<String> itr = set.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // ==========================
        // 8. Add All
        // ==========================
        Set<String> set2 = new HashSet<>();

        set2.add("HTML");
        set2.add("CSS");

        set.addAll(set2);

        System.out.println("\nAfter addAll : "
                + set);

        // ==========================
        // 9. Remove All
        // ==========================
        set.removeAll(set2);

        System.out.println("After removeAll : "
                + set);

        // ==========================
        // 10. Clear
        // ==========================
        Set<String> temp = new HashSet<>(set);

        temp.clear();

        System.out.println("After Clear : "
                + temp);

        // ==========================
        // 11. LinkedHashSet
        // Maintains Insertion Order
        // ==========================
        Set<String> linkedSet = new LinkedHashSet<>();

        linkedSet.add("C");
        linkedSet.add("A");
        linkedSet.add("B");
        linkedSet.add("A");

        System.out.println(
                "\nLinkedHashSet : "
                        + linkedSet);

        // ==========================
        // 12. TreeSet
        // Sorted Order
        // ==========================
        Set<Integer> treeSet = new TreeSet<>();

        treeSet.add(50);
        treeSet.add(10);
        treeSet.add(40);
        treeSet.add(20);

        System.out.println(
                "TreeSet : "
                        + treeSet);

        // ==========================
        // 13. Integer Set
        // ==========================
        Set<Integer> numbers = new HashSet<>();

        numbers.add(100);
        numbers.add(200);
        numbers.add(100);

        System.out.println(
                "Numbers : "
                        + numbers);

        // ==========================
        // 14. Convert Set to Array
        // ==========================
        Object[] arr = set.toArray();

        System.out.println(
                "Array Length : "
                        + arr.length);

        // ==========================
        // 15. Set Equality
        // ==========================
        Set<Integer> s1 = new HashSet<>();

        Set<Integer> s2 = new HashSet<>();

        s1.add(1);
        s1.add(2);

        s2.add(2);
        s2.add(1);

        System.out.println(
                "s1 equals s2 : "
                        + s1.equals(s2));

        // treeset

        TreeSet<Integer> nums = new TreeSet<>();

        nums.add(50);
        nums.add(10);
        nums.add(80);
        nums.add(20);
        nums.add(40);
        nums.add(10); // Duplicate

        System.out.println("TreeSet: " + nums);

        System.out.println("First Element: " + nums.first());

        System.out.println("Last Element: " + nums.last());

        System.out.println("Contains 20? " + nums.contains(20));

        System.out.println("Size: " + nums.size());

        nums.remove(40);

        System.out.println("After Remove: " + nums);

        System.out.println("\nTraversing:");

        for (Integer num : nums) {
            System.out.println(num);
        }

        System.out.println(nums.first()); // Smallest element
        System.out.println(nums.last()); // Largest element

        System.out.println(nums.ceiling(25)); // >= 25 -> 40
        System.out.println(nums.floor(25)); // <= 25 -> 20

        System.out.println(nums.higher(20)); // > 20 -> 40
        System.out.println(nums.lower(20)); // < 20 -> 10

        System.out.println(nums.pollFirst()); // Remove & return smallest
        System.out.println(nums.pollLast()); // Remove & return largest
    }
}