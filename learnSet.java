import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class learnSet {
    // // 1. Hashset -> O(logn)
    // public static void main(String[] args) {
    //     // in set order is random. but it contains unique elements
    //     Set<Integer> set= new HashSet<>();
    //     set.add(12);
    //     set.add(54);
    //     set.add(97);
    //     set.add(155);
    //     System.out.println(set);

    //     // remove method 
    //     System.out.println(set.remove(69)); //false
    //     System.out.println("remove 12: " + set.remove(12)); //true
    //     System.out.println(set);

    //     // contains method
    //     System.out.println("contain method: " + set.contains(97)); //true

    //     //isEmpty method to check if set is empty
    //     System.out.println("is empty: " + set.isEmpty()); //false
        
    //     //size method
    //     System.out.println("size of set is : " + set.size());

    //     //clear method
    //     set.clear();
    //     System.out.println("set after using clear method: " + set);


    // // 2. Linked Hashset
    // public static void main(String[] args) {
    //     // in set order is random. but it contains unique elements
    //     Set<Integer> set= new LinkedHashSet<>();
    //     set.add(12);
    //     set.add(54);
    //     set.add(97);
    //     set.add(155);
    //     System.out.println(set);

    //     // remove method 
    //     System.out.println(set.remove(69)); //false
    //     System.out.println("remove 12: " + set.remove(12)); //true
    //     System.out.println(set);

    //     // contains method
    //     System.out.println("contain method: " + set.contains(97)); //true

    //     //isEmpty method to check if set is empty
    //     System.out.println("is empty: " + set.isEmpty()); //false
        
    //     //size method
    //     System.out.println("size of set is : " + set.size());

    //     //clear method
    //     set.clear();
    //     System.out.println("set after using clear method: " + set);


    // 3. treeset -> O(logn)
    public static void main(String[] args) {
        // in set order is random. but it contains unique elements
        Set<Integer> set= new TreeSet<>();
        set.add(12);
        set.add(54);
        set.add(97);
        set.add(155);
        System.out.println(set);

        // remove method 
        System.out.println(set.remove(69)); //false
        System.out.println("remove 12: " + set.remove(12)); //true
        System.out.println(set);

        // contains method
        System.out.println("contain method: " + set.contains(97)); //true

        //isEmpty method to check if set is empty
        System.out.println("is empty: " + set.isEmpty()); //false
        
        //size method
        System.out.println("size of set is : " + set.size());

        //clear method
        set.clear();
        System.out.println("set after using clear method: " + set);


        
    }
}
