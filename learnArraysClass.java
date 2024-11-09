import java.util.Arrays;

public class learnArraysClass {
    public static void main(String[] args) {
        // int[] numbers= {1,2,3,4,5,6,7,8,9};
        // int index= Arrays.binarySearch(numbers, 4);
        // System.out.println("index of value 4 is: " + index);

        //sorting very quickly
        System.out.println("sort: ");
        Integer[] numbers1= {1,22,11,33,432,9,4,10};
        Arrays.sort(numbers1);
        for(int i:numbers1){
            System.out.print(i + " ");
        }
        System.out.println();
        //fill method
        Arrays.fill(numbers1, 10);
        System.out.println("after fill method is used: ");
        for(int i:numbers1){
            System.out.print(i + " ");
        }
    }
}
