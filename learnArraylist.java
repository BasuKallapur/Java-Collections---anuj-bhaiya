// Source code is decompiled from a .class file using FernFlower decompiler.
//fixed most but some topics need to be seen again from yt video and fix them
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class learnArraylist {

   public static void main(String[] var0) {
      List<Integer> list = new ArrayList<>();
      System.out.println("adding new elements to list");
      list.add(1);
      list.add(2);
      list.add(3);
      System.out.println(list);
      list.add(4);
      System.out.println(list);
      List<Integer> list2 = new ArrayList<>();
      list2.add(1);
      list2.add(69);
      System.out.println("adding new defined list to pre-existing list");
      System.out.println(list2);
      list.addAll(list2);
      System.out.println(list);
      System.out.println(list.get(0));
      System.out.println("get method");
      System.out.println(list.get(0));
      System.out.println("remove method");
      System.out.println(list.remove(0));
      System.out.println("list after removing list: " + list);
      System.out.println("remove particular element from list");
      List<Integer> list3 = new ArrayList();
      list3.add(6);
      list3.add(2);
      list3.add(1);
      list3.add(3);
      list3.add(1);
      list3.add(4);
      list3.remove(1);
      System.out.println("new second list after removing first occurecne of 1 is: " + list3);
      System.out.println("to clear whole list");
      list3.clear();
      System.out.println("new list after after clearing all elements is: " + list3);
      System.out.println("set method: to update pre-existing value at some index");
      List<Integer> list4 = new ArrayList<>();
      list4.add(122);
      list4.add(56);
      list4.add(30);
      System.out.println("newwList: " + list4);
      list4.set(2, 34);
      System.out.println("after set method: " + list4);
      System.out.println("contain method to check given element present or not: ");
      System.out.println(list4.contains(34));
      System.out.println(list4.contains(69));
      System.out.println();
      System.out.println("Interation concept: ");
      List<Integer> list5 = new ArrayList();
      list5.add(45);
      list5.add(89);
      list5.add(22);
      list5.add(100);

      System.out.println("using for loop");
      for(int i = 0; i < list5.size(); ++i) {
         System.out.println(list5.get(i));
      }


   }
}
