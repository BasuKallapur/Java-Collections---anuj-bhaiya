import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class learnCollectionClass {
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(6);
        list.add(6);
        list.add(8);
        list.add(6);

        // // to directly get min element
        // System.out.println("min element is: " + Collections.min(list));
        // // to directly get max element
        // System.out.println("max element is: " + Collections.max(list));
        // // to get frequency of element
        // System.out.println("frequency of element 6 is: " + Collections.frequency(list, 6));

        //sort 
        // Collections.sort(list); //least to most
        Collections.sort(list, Comparator.reverseOrder()); //most to least
        System.out.println("sorted list is: " + list);
    }
}
