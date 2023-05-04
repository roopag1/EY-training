package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;


public class CollectionDemo {
    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(10);

    //     System.out.println(list);
    //     for(int n: list) {
    //     System.out.println(n);
    //  }
    //     System.out.println(list.get(4));
      

       Set<Integer> set = new HashSet<>();
       set.add(11);
       set.add(12);
       set.add(18);
       set.add(14);
       set.add(15);
       set.add(17);

        //   System.out.println(set);      
        //   for(int n: set) {
        //       System.out.println(n);
        //   }


      Set<Integer> set1 = new TreeSet<>();     
      set1.add(20);
      set1.add(30);
      set1.add(40);
      set1.add(80);
      set1.add(60);
      set1.add(70);

    //   System.out.println(set1);      
    //   for(int n: set1) {
    //       System.out.println(n);
    //   }


      List<Integer> list1 = new ArrayList<>();
            list1.add(11);
            list1.add(22);
            list1.add(31);
            list1.add(14);
            list1.add(55);
            list1.add(2);
    
            Collections.sort(list1);
            System.out.println(list1);

      
      Iterator<Integer> itr = set.iterator();
      while(itr.hasNext()) {
        System.out.println(itr.next());
      }  


      Map<String, Integer> l1 = new HashMap<>();
      l1.put("roopa", 1000000); 
      l1.put("raksha", 40000); 
      l1.put("yash", 20000); 
      l1.put("rocky", 20000); 
      l1.put("roopa", 100000); 
     

      System.out.println(l1);
      System.out.println(l1.get("roopa"));

      System.out.println(l1.keySet());

      for(String name: l1.keySet()) {
          System.out.println(name + "--->>" + l1.get(name));
      }
      for(Integer salary: l1.values()) {
          System.out.println(salary + "--->>");
      }
    }
}
