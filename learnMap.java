import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class learnMap {
    public static void main(String[] args) {
        // Map<String, Integer> numbers= new HashMap<>();
        Map<String, Integer> numbers= new TreeMap<>();
        numbers.put("one", 1);
        numbers.put("two", 2);
        numbers.put("three", 3);
        numbers.put("four", 4);
        numbers.put("four", 445); //just overrides value of four to 445 
        System.out.println(numbers);

        // remove
        numbers.remove("four");
        System.out.println("after remove method: " + numbers);
        
        // to check map contains particular key/value or not
        System.out.println(numbers.containsKey("basu")); //false
        System.out.println(numbers.containsValue(445)); //false
        
        //to cler a map
        numbers.clear();
        System.out.println(numbers);

        // to check a map is empty or not
        System.out.println("checking map is empty or not: " + numbers.isEmpty());
        

        // numbers.putIfAbsent("five", 5); // doesn't override
        // System.out.println(numbers);

        // // Iteration in Map
        // System.out.println("Iteration in map: ");
        // //method 1
        // System.out.println("method 1");
        // for(Map.Entry<String, Integer> e:numbers.entrySet()){
        //     System.out.println(e);
        //     System.out.println(e.getKey());
        //     System.out.println(e.getValue());
        // }
        // // method 2
        // System.out.println("method 2");
        // for(String key: numbers.keySet()){
        //     System.out.println(key);
        // }
        // for(Integer value: numbers.values()){
        //     System.out.println(value);
        // }

    }
}
